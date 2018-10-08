package DAO;

import Conexao.ConexaoSQL;
import Objetos.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FilmeDAO {
    
    public void Create(Filme f){
        
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_filme (Nome, Genero, Descricao, Diretor, Estudio, Dt_Lanca, Qtde, Valor) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getGenero());
            stmt.setString(3, f.getDescricao());
            stmt.setString(4, f.getDiretor());
            stmt.setString(5, f.getEstudio());
            stmt.setString(6, f.getData());
            stmt.setInt(7, f.getQtde());
            stmt.setDouble(8, f.getPreco());
            if (stmt.execute()) {
                JOptionPane.showMessageDialog(null, "Falha ao Inserir!");
            } else {
                JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar informações: " +e);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt);
        }
    }
    
    public List<Filme> read() {
        
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filme> filmes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_filme");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Filme f = new Filme();
                f.setId(rs.getInt("Id"));
                f.setNome(rs.getString("Nome"));
                f.setGenero(rs.getString("Genero"));
                f.setDescricao(rs.getString("Descricao"));
                f.setDiretor(rs.getString("Diretor"));
                f.setEstudio(rs.getString("Estudio"));
                f.setData(rs.getString("Dt_Lanca"));
                f.setQtde(rs.getInt("Qtde"));
                f.setPreco(rs.getDouble("Valor"));
                filmes.add(f);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter registros do BD: " +e);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt, rs);
        }
        
        return filmes;    
    }
    
    public void Update(Filme f){
    
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE tbl_filme SET Nome = ?, Genero = ?, Descricao = ?, Diretor = ?, Estudio = ?, Dt_Lanca = ?, Qtde = ?, Valor = ? WHERE Id = ?");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getGenero());
            stmt.setString(3, f.getDescricao());
            stmt.setString(4, f.getDiretor());
            stmt.setString(5, f.getEstudio());
            stmt.setString(6, f.getData());
            stmt.setInt(7, f.getQtde());
            stmt.setDouble(8, f.getPreco());
            stmt.setInt(9, f.getId());
            if (stmt.execute()) {
                JOptionPane.showMessageDialog(null, "Falha ao Atualizar!");
            } else {
                JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro: " +e);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt);
        }
        
    }
    
    public void Delete(int id){
    
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_filme WHERE Id = ?");
            stmt.setInt(1, id);
            if (stmt.execute()) {
                JOptionPane.showMessageDialog(null, "Falha ao Excluir!");
            } else {
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o registro: " +e);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt);
        }
        
    }
    
    public List<Filme> Search(String tipo, String valor){
        
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filme> filmes = new ArrayList<>();
        
        try {
            if(tipo.equals("Nome")){
                stmt = con.prepareStatement("SELECT * FROM tbl_filme WHERE Nome = ?");
            }else if(tipo.equals("Genero")){
                stmt = con.prepareStatement("SELECT * FROM tbl_filme WHERE Genero = ?");
            }else if(tipo.equals("Diretor")){
                stmt = con.prepareStatement("SELECT * FROM tbl_filme WHERE Diretor = ?");
            }else if(tipo.equals("Estudio")){
                stmt = con.prepareStatement("SELECT * FROM tbl_filme WHERE Estudio = ?");
            }else{
                stmt = con.prepareStatement("SELECT * FROM tbl_filme WHERE Dt_Lanca = ?");
            }
            stmt.setString(1, valor);
            rs = stmt.executeQuery();
              if(rs.next()){
                  do{                      
                    Filme f = new Filme();
                    f.setId(rs.getInt("Id"));
                    f.setNome(rs.getString("Nome"));
                    f.setGenero(rs.getString("Genero"));
                    f.setDescricao(rs.getString("Descricao"));
                    f.setDiretor(rs.getString("Diretor"));
                    f.setEstudio(rs.getString("Estudio"));
                    f.setData(rs.getString("Dt_Lanca"));
                    f.setQtde(rs.getInt("Qtde"));
                    f.setPreco(rs.getDouble("Valor"));
                    filmes.add(f);
                  }while (rs.next());
              }else{
                JOptionPane.showMessageDialog(null, "Cadastro Não Encontrado");
              }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter registros do BD: " +e);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt, rs);
        }
        
        return filmes;
    }
    
//    public int Somar(){
//    
//        Connection con = ConexaoSQL.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        
//        int cont = 0;
//        
//        try {
//            stmt = con.prepareStatement("SELECT sum(Id) as soma FROM tbl_aluno");
//            rs = stmt.executeQuery();
//            if(rs.next()){
//                cont = Integer.parseInt(rs.getString("soma"));
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao obter registros do BD: " +e);
//        } finally {
//            ConexaoSQL.CloseConnection(con, stmt, rs);
//        }
//        return cont;
//        
//    }
    
}
