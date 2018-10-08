package Model;

import DAO.FilmeDAO;
import Objetos.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FilmeTableModel extends AbstractTableModel{

    private final String[] colunas = {"Nome","Genero","Descrição","Diretor","Estudio","Data de Lançamento","Estoque","Preço"};
    private final List<Filme> dados = new ArrayList<>();
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getGenero();
            case 2:
                return dados.get(linha).getDescricao();
            case 3:
                return dados.get(linha).getDiretor();
            case 4:
                return dados.get(linha).getEstudio();
            case 5:
                return dados.get(linha).getData();
            case 6:
                return dados.get(linha).getQtde();
            case 7:
                return dados.get(linha).getPreco();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setNome((String) valor);
                break;
            case 1:
                dados.get(linha).setGenero((String) valor);
                break;
            case 2:
                dados.get(linha).setDescricao((String) valor);
                break;
            case 3:
                dados.get(linha).setDiretor((String) valor);
                break;
            case 4:
                dados.get(linha).setEstudio((String) valor);
                break;
            case 5:
                dados.get(linha).setData((String) valor);
                break;
            case 6:
                dados.get(linha).setQtde(Integer.parseInt((String) valor));
                break;
            case 7:
                dados.get(linha).setPreco(Double.parseDouble((String) valor));
                break;
        }
    }
    
    public void addLinha(Filme f) {        
        this.dados.add(f);
        this.fireTableDataChanged();
    }

    public void removeLinha(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public Filme PegaDadosLinha(int linha){
        return dados.get(linha);
    }
    
    public void LerDados(){
        
        FilmeDAO fdao = new FilmeDAO();
        
        for (Filme f: fdao.read()) {
            this.addLinha(f);
        }
        
        this.fireTableDataChanged();
        
    }
    
    public void Search(String tipo, String valor){
        
        this.dados.clear();
        FilmeDAO fdao = new FilmeDAO();
        for (Filme f: fdao.Search(tipo, valor)) {
            this.addLinha(f);
        }
        
        this.fireTableDataChanged();
        
    }
    
    public void RecarregaTabela(){
        this.dados.clear();
        LerDados();
        this.fireTableDataChanged();
    }
    
    public List<Filme> RetornaArray(){
        return dados;
    }
    
}
