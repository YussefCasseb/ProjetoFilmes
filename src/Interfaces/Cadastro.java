package Interfaces;

import DAO.FilmeDAO;
import Model.FilmeTableModel;
import Objetos.Filme;
import PDF.GerarPDF;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Cadastro extends javax.swing.JFrame {

    FilmeTableModel modelo = new FilmeTableModel();
    
    public Cadastro() {
        //Designer da Interface e seus Componentes
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	}catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException("Erro: " +e);
	}
        initComponents();
        modelo.RecarregaTabela();
        jTFilmes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDesc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTDiretor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTEstudio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jData = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTQtde = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTValor = new javax.swing.JTextField();
        jBCad = new javax.swing.JButton();
        jBAlt = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jCGenero = new javax.swing.JComboBox<>();
        jBPdf = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTFilmes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome:");

        jLabel2.setText("Genero:");

        jLabel3.setText("Descrição:");

        jTDesc.setColumns(20);
        jTDesc.setRows(5);
        jScrollPane1.setViewportView(jTDesc);

        jLabel4.setText("Diretor:");

        jLabel5.setText("Estudio:");

        jLabel6.setText("Data de Lançamento:");

        jLabel7.setText("Estoque:");

        jLabel8.setText("Valor:");

        jBCad.setText("Cadastrar");
        jBCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadActionPerformed(evt);
            }
        });

        jBAlt.setText("Alterar");
        jBAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar Filme");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jCGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "Drama", "Comédia", "Romance", "Documentário", "Policial", "Animação", "Ficção Científica", "Musical", "Fantasia", "Policial", "Suspense" }));

        jBPdf.setText("Gerar Relatório");
        jBPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTDiretor)
                                .addComponent(jTEstudio)
                                .addComponent(jData, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(jTQtde, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCad)
                        .addGap(18, 18, 18)
                        .addComponent(jBAlt)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBPdf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCad)
                    .addComponent(jBAlt)
                    .addComponent(jBExcluir)
                    .addComponent(jBPesquisar)
                    .addComponent(jBPdf))
                .addGap(35, 35, 35))
        );

        jTFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFilmesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTFilmes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadActionPerformed
        Filme f = new Filme();
        FilmeDAO fdao = new FilmeDAO();
        if(jTNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O Nome está vazio!");
            jTNome.requestFocus();
        }else if(jTDesc.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "A Descrição está vazia!");
            jTDesc.requestFocus();
        }else if(jTDiretor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O Diretor está vazio!");
            jTDiretor.requestFocus();
        }else if(jTEstudio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O Estudio está vazio!");
            jTEstudio.requestFocus();
        }else if(jData.getDate() == null){
            JOptionPane.showMessageDialog(this, "A Data está vazia!");
        }else if(jTQtde.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O Estoque está vazio!");
            jTQtde.requestFocus();
        }else if(jTValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O Valor está vazio!");
            jTValor.requestFocus();
        }else{
        f.setNome(jTNome.getText());
        f.setGenero(String.valueOf(jCGenero.getSelectedItem()));
        f.setDescricao(jTDesc.getText());
        f.setDiretor(jTDiretor.getText());
        f.setEstudio(jTEstudio.getText());
        f.setData(new SimpleDateFormat("dd/MM/yyyy").format(jData.getDate()));
        f.setQtde(Integer.parseInt(jTQtde.getText()));
        f.setPreco(Double.parseDouble(jTValor.getText().replace(",", ".")));
        fdao.Create(f);
        modelo.RecarregaTabela();
        LimpaCampos();
        }
    }//GEN-LAST:event_jBCadActionPerformed

    private void jTFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFilmesMouseClicked
        jTNome.setText(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 0)));
        jCGenero.setSelectedItem(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 1)));
        jTDesc.setText(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 2)));
        jTDiretor.setText(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 3)));
        jTEstudio.setText(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 4)));
        try{
        jData.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 5))));
        }catch(ParseException e){
        }
        jTQtde.setText(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 6)));
        jTValor.setText(String.valueOf(modelo.getValueAt(jTFilmes.getSelectedRow(), 7)));
    }//GEN-LAST:event_jTFilmesMouseClicked

    private void jBAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltActionPerformed
        FilmeDAO fdao = new FilmeDAO();
        if(jTFilmes.getSelectedRow() != -1){
            modelo.setValueAt(jTNome.getText(), jTFilmes.getSelectedRow(), 0);
            modelo.setValueAt(jCGenero.getSelectedItem(), jTFilmes.getSelectedRow(), 1);
            modelo.setValueAt(jTDesc.getText(), jTFilmes.getSelectedRow(), 2);
            modelo.setValueAt(jTDiretor.getText(), jTFilmes.getSelectedRow(), 3);
            modelo.setValueAt(jTEstudio.getText(), jTFilmes.getSelectedRow(), 4);
            modelo.setValueAt(new SimpleDateFormat("dd/MM/yyyy").format(jData.getDate()), jTFilmes.getSelectedRow(), 5);
            modelo.setValueAt(jTQtde.getText(), jTFilmes.getSelectedRow(), 6);
            modelo.setValueAt(jTValor.getText().replace(",", "."), jTFilmes.getSelectedRow(), 7);
            Filme f = modelo.PegaDadosLinha(jTFilmes.getSelectedRow());
            fdao.Update(f);
            modelo.RecarregaTabela();
            LimpaCampos();
        }
    }//GEN-LAST:event_jBAltActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        FilmeDAO fdao = new FilmeDAO();
        if(jTFilmes.getSelectedRow() != -1){
            fdao.Delete(modelo.PegaDadosLinha(jTFilmes.getSelectedRow()).getId());
            modelo.RecarregaTabela();
            LimpaCampos();
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        Pesquisa pes = new Pesquisa();
        pes.setVisible(true);
        pes.setLocationRelativeTo(null);
        pes.setTitle("Pesquisa de Filmes");
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPdfActionPerformed
        GerarPDF pdf = new GerarPDF();
        JFileChooser salvandoArquivo = new JFileChooser();
        int resultado = salvandoArquivo.showSaveDialog(this);
        if(resultado != JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(this, "Erro ao Salvar");
        }else{
            pdf.setLocal(String.valueOf(salvandoArquivo.getSelectedFile()));
            pdf.GerarPDF(modelo.RetornaArray());
        }
    }//GEN-LAST:event_jBPdfActionPerformed

    public void LimpaCampos(){
    
        jTNome.setText("");
        jTDesc.setText("");
        jTDiretor.setText("");
        jTEstudio.setText("");
        jTQtde.setText("");
        jTValor.setText("");
        jData.setDate(null);
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlt;
    private javax.swing.JButton jBCad;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPdf;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox<String> jCGenero;
    private com.toedter.calendar.JDateChooser jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTDesc;
    private javax.swing.JTextField jTDiretor;
    private javax.swing.JTextField jTEstudio;
    private javax.swing.JTable jTFilmes;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTQtde;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables
}
