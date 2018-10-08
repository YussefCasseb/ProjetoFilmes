package Interfaces;

import DAO.FilmeDAO;
import Model.FilmeTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Pesquisa extends javax.swing.JFrame {

    FilmeTableModel modelo = new FilmeTableModel();
    
    public Pesquisa() {
        initComponents();
        jTResultado.setModel(modelo);
        jCValor.setVisible(false);
        jData.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTValor = new javax.swing.JTextField();
        jCTipo = new javax.swing.JComboBox<>();
        jBPesquisa = new javax.swing.JButton();
        jCValor = new javax.swing.JComboBox<>();
        jData = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 409));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Genero", "Diretor", "Estudio", "Data de Lançamento" }));
        jCTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoActionPerformed(evt);
            }
        });

        jBPesquisa.setText("Pesquisar");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        jCValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "Drama", "Comédia", "Romance", "Documentário", "Policial", "Animação", "Ficção Científica", "Musical", "Fantasia", "Policial", "Suspense" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBPesquisa)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        FilmeDAO fdao = new FilmeDAO();
        if(jCTipo.getSelectedItem().equals("Nome") || jCTipo.getSelectedItem().equals("Diretor") || jCTipo.getSelectedItem().equals("Estudio")){
        if(!jTValor.getText().isEmpty()){
            modelo.Search(jCTipo.getSelectedItem().toString(), jTValor.getText());
            jTValor.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Informe algo para ser pesquisado");
        }
        }else if(jCTipo.getSelectedItem().equals("Genero")){
            modelo.Search(jCTipo.getSelectedItem().toString(), jCValor.getSelectedItem().toString());
        }else{
            modelo.Search(jCTipo.getSelectedItem().toString(), new SimpleDateFormat("dd/MM/yyyy").format(jData.getDate()));
            jData.setDate(null);
        }
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void jCTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoActionPerformed
        if(jCTipo.getSelectedItem().equals("Genero")){
            jCValor.setVisible(true);
            jTValor.setVisible(false);
            jData.setVisible(false);
        }else if(jCTipo.getSelectedItem().equals("Data de Lançamento")){
            jData.setVisible(true);
            jTValor.setVisible(false);
            jCValor.setVisible(false);
        }else{
            jTValor.setVisible(true);
            jCValor.setVisible(false);
            jData.setVisible(false);
        }
    }//GEN-LAST:event_jCTipoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JComboBox<String> jCValor;
    private com.toedter.calendar.JDateChooser jData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResultado;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables
}
