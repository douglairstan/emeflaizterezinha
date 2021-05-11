/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.escola;

import base.ctr.BaseCTR;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static lib.java.MD5.md5;

/**
 *
 * @author Douglas Estanislau Pereira
 */
public class PlanejamentoRotinaSemanalAdmVIEW extends javax.swing.JInternalFrame {

    /**
     * Creates new form PlanejamentoRotinaSemanalAdmVIEW
     */
    public PlanejamentoRotinaSemanalAdmVIEW() {
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

        jLabel3 = new javax.swing.JLabel();
        jComboBoxProfessorUF = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldProfessorRG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldProfessorNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldProfessorSenha = new javax.swing.JPasswordField();
        jTabbedPaneHistoricoVisual = new javax.swing.JTabbedPane();
        jPanelRotina = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaRotina = new javax.swing.JTextArea();
        jPanelHistórico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistorico = new javax.swing.JTable();
        jRadioButtonNVisualizados = new javax.swing.JRadioButton();
        jRadioButtonVisualizados = new javax.swing.JRadioButton();
        jButtonSair = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodigoPRS = new javax.swing.JTextField();

        getContentPane().setLayout(null);

        jLabel3.setText("UF:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 50, 14);

        jComboBoxProfessorUF.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jComboBoxProfessorUF);
        jComboBoxProfessorUF.setBounds(20, 110, 60, 26);

        jLabel6.setText("RG:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 90, 60, 14);

        jTextFieldProfessorRG.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextFieldProfessorRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProfessorRGKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldProfessorRG);
        jTextFieldProfessorRG.setBounds(90, 110, 130, 26);

        jLabel10.setText("Docente:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 90, 130, 14);

        jTextFieldProfessorNome.setEditable(false);
        jTextFieldProfessorNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jTextFieldProfessorNome);
        jTextFieldProfessorNome.setBounds(230, 110, 430, 26);

        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 90, 70, 14);

        jPasswordFieldProfessorSenha.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jPasswordFieldProfessorSenha);
        jPasswordFieldProfessorSenha.setBounds(670, 110, 130, 26);

        jPanelRotina.setLayout(null);

        jTextAreaRotina.setColumns(20);
        jTextAreaRotina.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jTextAreaRotina.setLineWrap(true);
        jTextAreaRotina.setRows(12);
        jTextAreaRotina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaRotinaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaRotina);

        jPanelRotina.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 840, 290);

        jTabbedPaneHistoricoVisual.addTab("Rotina:", jPanelRotina);

        jPanelHistórico.setLayout(null);

        jTableHistorico.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTableHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Data:", "Disciplina:", "Caderno:", "Período:", "Classe:", "Ensino:", "Turma:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHistorico.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableHistorico.getTableHeader().setReorderingAllowed(false);
        jTableHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHistorico);

        jPanelHistórico.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 860, 270);

        jRadioButtonNVisualizados.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jRadioButtonNVisualizados.setText("Não Visualizados:");
        jRadioButtonNVisualizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNVisualizadosActionPerformed(evt);
            }
        });
        jPanelHistórico.add(jRadioButtonNVisualizados);
        jRadioButtonNVisualizados.setBounds(10, 10, 160, 29);

        jRadioButtonVisualizados.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jRadioButtonVisualizados.setText("Visualizados:");
        jRadioButtonVisualizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVisualizadosActionPerformed(evt);
            }
        });
        jPanelHistórico.add(jRadioButtonVisualizados);
        jRadioButtonVisualizados.setBounds(180, 10, 160, 29);

        jTabbedPaneHistoricoVisual.addTab("Histórico:", jPanelHistórico);

        getContentPane().add(jTabbedPaneHistoricoVisual);
        jTabbedPaneHistoricoVisual.setBounds(10, 210, 870, 350);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/png/48x48/Sair48.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(0, 0, 80, 80);

        jLabel8.setText("Código:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 30, 80, 14);

        jTextFieldCodigoPRS.setEditable(false);
        jTextFieldCodigoPRS.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextFieldCodigoPRS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoPRSKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoPRS);
        jTextFieldCodigoPRS.setBounds(230, 50, 60, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProfessorRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProfessorRGKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            ConsultarVerificadorDocente();
            //MostrarDadosTabelaRelatoriosDocente();
            jTextFieldProfessorRG.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldProfessorRGKeyPressed

    public void ConsultarVerificadorDocente(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.VerificadorRelatarPessoaDocente(jComboBoxProfessorUF.getSelectedItem().toString(), jTextFieldProfessorRG.getText().toUpperCase().replace(".", "").replace("-", ""));
            int v = 0;
            while(rs.next()){       
                v = (rs.getInt("verificador"));  
            }
            if (v == 0){
                JOptionPane.showMessageDialog(null,"RG não encontrado ou não existente. Verifique...","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                jTextFieldProfessorRG.setText("");
                jTextFieldProfessorNome.setText("");
                jPasswordFieldProfessorSenha.setText("");
                jTextFieldProfessorRG.requestFocus();
            }else{
                ConsultarRelatarDocenteNome();
                //MostrarDadosTabelaPlanejamento();
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
         }
    }
    
    public void CapsLock(){
        Toolkit tk = Toolkit.getDefaultToolkit();  
        if(tk.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)){
            System.out.println("caps lock ligado...");
        } 
        else{
            JOptionPane.showMessageDialog(null,"Precione a Tecla CAPS LOCK para começar a Digitar...","Informação: ",JOptionPane.INFORMATION_MESSAGE);
        }       
    }
    
    public void ConsultarRelatarDocenteNome(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            rs=consultar.ConsultarRelatarPessoaNome(jComboBoxProfessorUF.getSelectedItem().toString(), jTextFieldProfessorRG.getText().toUpperCase().replace(".", "").replace("-", ""));
            while (rs.next()){
                jTextFieldProfessorNome.setText((rs.getString("pessoa_nome")));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
        }
    }
    
    private void jTextAreaRotinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaRotinaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() != evt.VK_CAPS_LOCK){
            CapsLock();
        }
    }//GEN-LAST:event_jTextAreaRotinaKeyPressed

    public void ConsultarPlanejamentoRotinaSemanal(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.ConsultarPlanejamentoRotinaSemanal(Integer.parseInt(jTextFieldCodigoPRS.getText()), jComboBoxProfessorUF.getSelectedItem().toString(), jTextFieldProfessorRG.getText());
            while(rs.next()){     
                //jTextFieldData.setText((rs.getString("prs_data_semanal")));
                //jComboBoxCaderno.setSelectedItem((rs.getString("")));
                //jComboBoxPeriodo.setSelectedItem((rs.getString("")));
                //jComboBoxDisciplina.setSelectedItem((rs.getString("")));
                jTextAreaRotina.setText((rs.getString("prs_descricao")));
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
         }
    }
    
    private void jTableHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHistoricoMouseClicked
        // TODO add your handling code here:
        //int linha = jTableHistorico.getSelectedRow();
        //jTextFieldCodigoPRS.setText(jTableHistorico.getValueAt(linha,0).toString());
        //jTextFieldExcluirPlanejamento.setText(jTableHistorico.getValueAt(linha,0).toString());
        //jTextFieldData.setText(jTableHistorico.getValueAt(linha,1).toString());
        //jComboBoxDisciplina.setSelectedItem(jTableHistorico.getValueAt(linha,2).toString());
        //jComboBoxCaderno.setSelectedItem(jTableHistorico.getValueAt(linha,3).toString());
       // jComboBoxPeriodo.setSelectedItem(jTableHistorico.getValueAt(linha,4).toString());
        //jTextFieldClasseNumero.setText(jTableHistorico.getValueAt(linha,5).toString());
        //jTextFieldSerie.setText(jTableHistorico.getValueAt(linha,6).toString());
        //jTextFieldTurma.setText(jTableHistorico.getValueAt(linha,7).toString());
        ConsultarPlanejamentoRotinaSemanal();
        jTabbedPaneHistoricoVisual.setSelectedComponent(jPanelRotina);
    }//GEN-LAST:event_jTableHistoricoMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Sair();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldCodigoPRSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoPRSKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            if ("".equals(jTextFieldCodigoPRS.getText())){
                JOptionPane.showMessageDialog(null,"Campo Código Vazio. Verifique...","Informação: ",JOptionPane.INFORMATION_MESSAGE);
            }else{

            }
        }
    }//GEN-LAST:event_jTextFieldCodigoPRSKeyPressed

    private void jRadioButtonNVisualizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNVisualizadosActionPerformed
        // TODO add your handling code here:
        jRadioButtonNVisualizados.setSelected(true);
        jRadioButtonVisualizados.setSelected(false);
        //ConsultarVisualizacaoDocente();
        VerificaSenhaVisualizacaoDocente();
    }//GEN-LAST:event_jRadioButtonNVisualizadosActionPerformed

    private void jRadioButtonVisualizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVisualizadosActionPerformed
        // TODO add your handling code here:
        jRadioButtonNVisualizados.setSelected(false);
        jRadioButtonVisualizados.setSelected(true);
        //ConsultarVisualizacaoDocente();
        VerificaSenhaVisualizacaoDocente();
    }//GEN-LAST:event_jRadioButtonVisualizadosActionPerformed

    public void VerificaSenhaVisualizacaoDocente(){
    try{
            //BibliotecaCTR inserirCTR = new EscolaCTR();	
            if ("".equals(jComboBoxProfessorUF.getSelectedItem()) || "".equals(jTextFieldProfessorRG.getText()) || "".equals(jPasswordFieldProfessorSenha.getText()) || "".equals(jTextFieldProfessorNome.getText())){
               JOptionPane.showMessageDialog(null,"Campos de Dados em Branco, Verifique...","Informação: ",JOptionPane.INFORMATION_MESSAGE);   
               jTextFieldProfessorRG.requestFocus();
            }else{
                //VerificadorPessoaSenha1();
                //ConsultarVisualizacaoDocente();
                VerificadorPessoaSenha();
                }
            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Campos de Dados em Branco... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
		System.out.println(e.getMessage());
	}    
    }
    
    public void VerificadorPessoaSenha(){
    try{
            BaseCTR bibliotecaCTR = new BaseCTR();
            ResultSet rs=null;
            rs=bibliotecaCTR.VerificadorPessoaSenha(jComboBoxProfessorUF.getSelectedItem().toString(), jTextFieldProfessorRG.getText().toUpperCase().replace(".", "").replace("-", ""), md5(jPasswordFieldProfessorSenha.getText()));
            int v = 0;
            while(rs.next()){       
                v = (rs.getInt("verificador"));  
            }
            if (v == 1){
               //InserirVisualizacaoDocente();
               //ConsultarRelatos();
               //ConsultarRelatosAluno();
               //ConsultarRelatosDocente();
               //LimparCampos2();
                ConsultarVisualizacaoDocente();
            }else{
                JOptionPane.showMessageDialog(null,"Senha está digitada errada. Verifique...","Informação: ",JOptionPane.INFORMATION_MESSAGE);   
                //AlterarPessoa();
                jPasswordFieldProfessorSenha.setText("");
                jPasswordFieldProfessorSenha.requestFocus();
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }    
    }
    
    public void ConsultarVisualizacaoDocente() {
        if (jRadioButtonNVisualizados.isSelected()){
            PlanejamentoNaoVistosDocente();
        }
        if (jRadioButtonVisualizados.isSelected()){
            PlanejamentoVistosDocente();
        }
    }
    
    public void PlanejamentoNaoVistosDocente(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            //rs=consultar.AlunosNaoVistosDocente(jComboBoxProfessorUF.getSelectedItem().toString(), jTextFieldProfessorRG.getText().toUpperCase().replace(".", "").replace("-", ""));
            DefaultTableModel modelo = (DefaultTableModel) jTableHistorico.getModel();
            modelo.setNumRows(0);
            while (rs.next()){
                Object[] novaLinha = new Object[5];
                novaLinha[0] = rs.getString("id");
                novaLinha[1] = rs.getString("data");
                novaLinha[2] = rs.getString("pessoa_ci_uf");
                novaLinha[3] = rs.getString("pessoa_ci_numero");
                novaLinha[4] = rs.getString("pessoa_nome");
                modelo.addRow(novaLinha);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void PlanejamentoVistosDocente(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            //rs=consultar.AlunosNaoVistosDocente(jComboBoxProfessorUF.getSelectedItem().toString(), jTextFieldProfessorRG.getText().toUpperCase().replace(".", "").replace("-", ""));
            DefaultTableModel modelo = (DefaultTableModel) jTableHistorico.getModel();
            modelo.setNumRows(0);
            while (rs.next()){
                Object[] novaLinha = new Object[5];
                novaLinha[0] = rs.getString("id");
                novaLinha[1] = rs.getString("data");
                novaLinha[2] = rs.getString("pessoa_ci_uf");
                novaLinha[3] = rs.getString("pessoa_ci_numero");
                novaLinha[4] = rs.getString("pessoa_nome");
                modelo.addRow(novaLinha);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void ConsultarUF(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.ConsultarUF();
            jComboBoxProfessorUF.removeAllItems();
            while(rs.next()){       
                jComboBoxProfessorUF.addItem(rs.getString("uf_nome"));
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void Iniciar(){
        this.setTitle("Planejamento da Rotina Semanal");
        this.setSize(900, 600);
        ConsultarUF();
    }
    
    public void Sair(){
        this.dispose();
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxProfessorUF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelHistórico;
    private javax.swing.JPanel jPanelRotina;
    private javax.swing.JPasswordField jPasswordFieldProfessorSenha;
    private javax.swing.JRadioButton jRadioButtonNVisualizados;
    private javax.swing.JRadioButton jRadioButtonVisualizados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneHistoricoVisual;
    private javax.swing.JTable jTableHistorico;
    private javax.swing.JTextArea jTextAreaRotina;
    private javax.swing.JTextField jTextFieldCodigoPRS;
    private javax.swing.JTextField jTextFieldProfessorNome;
    private javax.swing.JTextField jTextFieldProfessorRG;
    // End of variables declaration//GEN-END:variables
}