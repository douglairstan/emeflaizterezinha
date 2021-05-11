/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.escola;

import base.ctr.BaseCTR;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Douglas Estanislau Pereira
 */
public class BibliotecaConsultaDIALOG extends javax.swing.JDialog {

    private String gettombo, gettitulo, getisbn;
    
    /**
     * Creates new form BibliotecaConsultaDIALOG
     */
    public BibliotecaConsultaDIALOG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButtonISBN = new javax.swing.JRadioButton();
        jRadioButtonTitulo = new javax.swing.JRadioButton();
        jRadioButtonSubTitulo = new javax.swing.JRadioButton();
        jRadioButtonTombo = new javax.swing.JRadioButton();
        jRadioButtonAutor = new javax.swing.JRadioButton();
        jRadioButtonEditora = new javax.swing.JRadioButton();
        jRadioButtonColecao = new javax.swing.JRadioButton();
        jRadioButtonTag = new javax.swing.JRadioButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaBiblioteca = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Pesquisar por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 120, 18);

        jRadioButtonISBN.setText("ISBN");
        jRadioButtonISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonISBNActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonISBN);
        jRadioButtonISBN.setBounds(100, 40, 59, 24);

        jRadioButtonTitulo.setText("Título");
        jRadioButtonTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTituloActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonTitulo);
        jRadioButtonTitulo.setBounds(170, 40, 80, 24);

        jRadioButtonSubTitulo.setText("Sub. Título");
        jRadioButtonSubTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSubTituloActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonSubTitulo);
        jRadioButtonSubTitulo.setBounds(250, 40, 110, 24);

        jRadioButtonTombo.setText("Tombo");
        jRadioButtonTombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTomboActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonTombo);
        jRadioButtonTombo.setBounds(360, 40, 74, 24);

        jRadioButtonAutor.setText("Autor(a)");
        jRadioButtonAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAutorActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonAutor);
        jRadioButtonAutor.setBounds(440, 40, 90, 24);

        jRadioButtonEditora.setText("Editora");
        jRadioButtonEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonEditora);
        jRadioButtonEditora.setBounds(550, 40, 77, 24);

        jRadioButtonColecao.setText("Coleção");
        jRadioButtonColecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonColecaoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonColecao);
        jRadioButtonColecao.setBounds(640, 40, 80, 24);

        jRadioButtonTag.setText("Tag");
        jRadioButtonTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTagActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonTag);
        jRadioButtonTag.setBounds(740, 40, 51, 24);

        jTextFieldPesquisa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(100, 70, 690, 28);

        jTableConsultaBiblioteca.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTableConsultaBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tombo:", "ISBN:", "Título:", "Sub. Título:", "Autor(a):", "Coleção:", "Editora:", "Tipo:", "Páginas:", "Volume:", "Linguagem:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaBiblioteca.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableConsultaBiblioteca.getTableHeader().setReorderingAllowed(false);
        jTableConsultaBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaBibliotecaMouseClicked(evt);
            }
        });
        jTableConsultaBiblioteca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableConsultaBibliotecaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableConsultaBiblioteca);
        if (jTableConsultaBiblioteca.getColumnModel().getColumnCount() > 0) {
            jTableConsultaBiblioteca.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableConsultaBiblioteca.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableConsultaBiblioteca.getColumnModel().getColumn(2).setPreferredWidth(350);
            jTableConsultaBiblioteca.getColumnModel().getColumn(3).setPreferredWidth(350);
            jTableConsultaBiblioteca.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTableConsultaBiblioteca.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTableConsultaBiblioteca.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTableConsultaBiblioteca.getColumnModel().getColumn(7).setPreferredWidth(150);
            jTableConsultaBiblioteca.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTableConsultaBiblioteca.getColumnModel().getColumn(9).setPreferredWidth(150);
            jTableConsultaBiblioteca.getColumnModel().getColumn(10).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 110, 830, 240);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/png/48x48/Sair48.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(0, 0, 80, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonISBNActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(true);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonISBNActionPerformed

    private void jRadioButtonTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTituloActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(true);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonTituloActionPerformed

    private void jRadioButtonSubTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSubTituloActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(true);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonSubTituloActionPerformed

    private void jRadioButtonTomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTomboActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(true);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonTomboActionPerformed

    private void jRadioButtonAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAutorActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(true);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonAutorActionPerformed

    private void jRadioButtonEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEditoraActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(true);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonEditoraActionPerformed

    private void jRadioButtonColecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonColecaoActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(true);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(false);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonColecaoActionPerformed

    private void jRadioButtonTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTagActionPerformed
        // TODO add your handling code here:
        jRadioButtonAutor.setSelected(false);
        jRadioButtonColecao.setSelected(false);
        jRadioButtonEditora.setSelected(false);
        jRadioButtonISBN.setSelected(false);
        jRadioButtonSubTitulo.setSelected(false);
        jRadioButtonTag.setSelected(true);
        jRadioButtonTitulo.setSelected(false);
        jRadioButtonTombo.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonTagActionPerformed

    private void jTextFieldPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            ConsultarAcervo();
        }
    }//GEN-LAST:event_jTextFieldPesquisaKeyPressed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Sair();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void jTableConsultaBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaBibliotecaMouseClicked
        // TODO add your handling code here:
        ChaveSelecao();
    }//GEN-LAST:event_jTableConsultaBibliotecaMouseClicked

    private void jTableConsultaBibliotecaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableConsultaBibliotecaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            ChaveSelecao();
        }
    }//GEN-LAST:event_jTableConsultaBibliotecaKeyPressed

    public void Iniciar() {
       this.setSize(850, 375);
       this.setTitle("Biblioteca - Consultar Acervos");
       jRadioButtonTitulo.setSelected(true);
    }

    public void Sair() {
        this.dispose();
    }
    
    public void ConsultarBibliotecaTitulo(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            rs=consultar.ConsultarAcervoBibliotecaTitulo(jTextFieldPesquisa.getText().toUpperCase());
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaBiblioteca.getModel();
            modelo.setNumRows(0);
            while (rs.next()){
                Object[] novaLinha = new Object[11];
                novaLinha[0] = rs.getString("acervo_tombo_empresa_numero");
                novaLinha[1] = rs.getString("acervo_isbn");
                novaLinha[2] = rs.getString("acervo_nome");
                novaLinha[3] = rs.getString("acervo_subtitulo");
                novaLinha[4] = rs.getString("acervo_outros_nome2");
                novaLinha[5] = rs.getString("acervo_colecao");
                novaLinha[6] = rs.getString("acervo_editora");
                novaLinha[7] = rs.getString("acervo_tipo");
                novaLinha[8] = rs.getString("acervo_paginas");
                novaLinha[9] = rs.getString("acervo_volume");
                novaLinha[10] = rs.getString("acervo_linguagem");
                modelo.addRow(novaLinha);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void ConsultarBibliotecaTombo(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            rs=consultar.ConsultarAcervoBibliotecaTombo(jTextFieldPesquisa.getText().toUpperCase());
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaBiblioteca.getModel();
            modelo.setNumRows(0);
            while (rs.next()){
                Object[] novaLinha = new Object[11];
                novaLinha[0] = rs.getString("acervo_tombo_empresa_numero");
                novaLinha[1] = rs.getString("acervo_isbn");
                novaLinha[2] = rs.getString("acervo_nome");
                novaLinha[3] = rs.getString("acervo_subtitulo");
                novaLinha[4] = rs.getString("acervo_outros_nome2");
                novaLinha[5] = rs.getString("acervo_colecao");
                novaLinha[6] = rs.getString("acervo_editora");
                novaLinha[7] = rs.getString("acervo_tipo");
                novaLinha[8] = rs.getString("acervo_paginas");
                novaLinha[9] = rs.getString("acervo_volume");
                novaLinha[10] = rs.getString("acervo_linguagem");
                modelo.addRow(novaLinha);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void ChaveSelecao(){
        int linha = jTableConsultaBiblioteca.getSelectedRow();
        setGettombo(jTableConsultaBiblioteca.getValueAt(linha,0).toString());
        setGetisbn(jTableConsultaBiblioteca.getValueAt(linha,1).toString());
        setGettitulo(jTableConsultaBiblioteca.getValueAt(linha,2).toString());
        this.dispose();
    }

    public void ConsultarAcervo() {
        if (jRadioButtonTitulo.isSelected() == true){
            ConsultarBibliotecaTitulo();
        }
        if (jRadioButtonAutor.isSelected() == true){
            //ConsultarBibliotecaAutor();
            JOptionPane.showMessageDialog(null,"EM DESENVOLVIMENTO PELO PROGRAMADOR... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }
        if (jRadioButtonColecao.isSelected() == true){
            //ConsultarBibliotecaColecao();
            JOptionPane.showMessageDialog(null,"EM DESENVOLVIMENTO PELO PROGRAMADOR... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }
        if (jRadioButtonEditora.isSelected() == true){
            //ConsultarBibliotecaEditora();
            JOptionPane.showMessageDialog(null,"EM DESENVOLVIMENTO PELO PROGRAMADOR... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }
        if (jRadioButtonISBN.isSelected() == true){
            //ConsultarBibliotecaISBN();
            JOptionPane.showMessageDialog(null,"EM DESENVOLVIMENTO PELO PROGRAMADOR... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }
        if (jRadioButtonSubTitulo.isSelected() == true){
            //ConsultarBibliotecaSubTitulo();
            JOptionPane.showMessageDialog(null,"EM DESENVOLVIMENTO PELO PROGRAMADOR... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }
        if (jRadioButtonTag.isSelected() == true){
            //ConsultarBibliotecaTag();
            JOptionPane.showMessageDialog(null,"EM DESENVOLVIMENTO PELO PROGRAMADOR... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }
        if (jRadioButtonTombo.isSelected() == true){
            ConsultarBibliotecaTombo();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BibliotecaConsultaDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaConsultaDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaConsultaDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaConsultaDIALOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BibliotecaConsultaDIALOG dialog = new BibliotecaConsultaDIALOG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonAutor;
    private javax.swing.JRadioButton jRadioButtonColecao;
    private javax.swing.JRadioButton jRadioButtonEditora;
    private javax.swing.JRadioButton jRadioButtonISBN;
    private javax.swing.JRadioButton jRadioButtonSubTitulo;
    private javax.swing.JRadioButton jRadioButtonTag;
    private javax.swing.JRadioButton jRadioButtonTitulo;
    private javax.swing.JRadioButton jRadioButtonTombo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultaBiblioteca;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the gettombo
     */
    public String getGettombo() {
        return gettombo;
    }

    /**
     * @param gettombo the gettombo to set
     */
    public void setGettombo(String gettombo) {
        this.gettombo = gettombo;
    }

    /**
     * @return the gettitulo
     */
    public String getGettitulo() {
        return gettitulo;
    }

    /**
     * @param gettitulo the gettitulo to set
     */
    public void setGettitulo(String gettitulo) {
        this.gettitulo = gettitulo;
    }

    /**
     * @return the getisbn
     */
    public String getGetisbn() {
        return getisbn;
    }

    /**
     * @param getisbn the getisbn to set
     */
    public void setGetisbn(String getisbn) {
        this.getisbn = getisbn;
    }
}
