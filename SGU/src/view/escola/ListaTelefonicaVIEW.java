/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.escola;

import base.ctr.BaseCTR;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static main.DesktopSGU.jDesktopPaneSGUVIEW;

/**
 *
 * @author Douglas Estanislau Pereira
 */
public class ListaTelefonicaVIEW extends javax.swing.JInternalFrame {

    String operadora = "VIVO";
    
    /**
     * Creates new form ListaTelefonicaVIEW
     */
    public ListaTelefonicaVIEW() {
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

        jLabel13 = new javax.swing.JLabel();
        jComboBoxTelTipo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldTelObs = new javax.swing.JTextField();
        jButtonAddTelTipo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxTelDDD = new javax.swing.JComboBox();
        jButtonAddTelDDD = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldTelNumero = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTelRamal = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonGravarAlterar = new javax.swing.JButton();
        jComboBoxUF = new javax.swing.JComboBox();
        jTextFieldPessoaRA = new javax.swing.JTextField();
        jTextFieldPessoaNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonNumero = new javax.swing.JRadioButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaTelefonica = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigoTelefone = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel13.setText("Tipo:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 90, 70, 14);

        jComboBoxTelTipo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jComboBoxTelTipo);
        jComboBoxTelTipo.setBounds(20, 110, 150, 27);

        jLabel16.setText("Obs:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(570, 90, 50, 14);

        jTextFieldTelObs.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jTextFieldTelObs);
        jTextFieldTelObs.setBounds(570, 110, 240, 26);

        jButtonAddTelTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/png/16x16/add16.png"))); // NOI18N
        jButtonAddTelTipo.setToolTipText("Adicionar Unidade Federativa");
        jButtonAddTelTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTelTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddTelTipo);
        jButtonAddTelTipo.setBounds(170, 110, 30, 25);

        jLabel11.setText("DDD:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 90, 60, 14);

        jComboBoxTelDDD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jComboBoxTelDDD);
        jComboBoxTelDDD.setBounds(210, 110, 80, 26);

        jButtonAddTelDDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/png/16x16/add16.png"))); // NOI18N
        jButtonAddTelDDD.setToolTipText("Adicionar Unidade Federativa");
        jButtonAddTelDDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTelDDDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddTelDDD);
        jButtonAddTelDDD.setBounds(290, 110, 30, 25);

        jLabel14.setText("Número:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(330, 90, 80, 14);

        jTextFieldTelNumero.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jTextFieldTelNumero);
        jTextFieldTelNumero.setBounds(330, 110, 160, 26);

        jLabel15.setText("Ramal:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(500, 90, 70, 14);

        jTextFieldTelRamal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jTextFieldTelRamal);
        jTextFieldTelRamal.setBounds(500, 110, 60, 26);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/png/48x48/Sair48.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(80, 0, 80, 80);

        jButtonGravarAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/png/48x48/Gravar48.png"))); // NOI18N
        jButtonGravarAlterar.setToolTipText("Gravar ou Alterar Aluno");
        jButtonGravarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravarAlterar);
        jButtonGravarAlterar.setBounds(0, 0, 80, 80);

        jComboBoxUF.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jComboBoxUF);
        jComboBoxUF.setBounds(170, 50, 60, 26);

        jTextFieldPessoaRA.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextFieldPessoaRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPessoaRAKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldPessoaRA);
        jTextFieldPessoaRA.setBounds(240, 50, 170, 26);

        jTextFieldPessoaNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getContentPane().add(jTextFieldPessoaNome);
        jTextFieldPessoaNome.setBounds(420, 50, 390, 26);

        jLabel1.setText("UF:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 40, 14);

        jLabel2.setText("RG/RA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 30, 90, 14);

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 30, 90, 14);

        jRadioButtonNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonNome);
        jRadioButtonNome.setBounds(20, 150, 80, 29);

        jRadioButtonNumero.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jRadioButtonNumero.setText("Número");
        jRadioButtonNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonNumero);
        jRadioButtonNumero.setBounds(100, 150, 100, 29);

        jTextFieldPesquisa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(20, 180, 790, 26);

        jScrollPane1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jTableListaTelefonica.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTableListaTelefonica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Data:", "Tipo:", "Op.:", "DDD:", "Número:", "Ramal:", "Nome:", "Obs:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaTelefonica.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableListaTelefonica.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableListaTelefonica);
        if (jTableListaTelefonica.getColumnModel().getColumnCount() > 0) {
            jTableListaTelefonica.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTableListaTelefonica.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTableListaTelefonica.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableListaTelefonica.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableListaTelefonica.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableListaTelefonica.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableListaTelefonica.getColumnModel().getColumn(6).setPreferredWidth(70);
            jTableListaTelefonica.getColumnModel().getColumn(7).setPreferredWidth(300);
            jTableListaTelefonica.getColumnModel().getColumn(8).setPreferredWidth(400);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 860, 280);

        jLabel4.setText("Código:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 510, 80, 14);

        jTextFieldCodigoTelefone.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextFieldCodigoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoTelefoneKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoTelefone);
        jTextFieldCodigoTelefone.setBounds(30, 530, 60, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Iniciar(){
        this.setSize(900, 600);
        this.setTitle("Lista Telefônica");
        ConsultarTelefoneTipo();
        ConsultarTelefoneOperadora();
        ConsultarTelefoneDDD();
        ConsultarUF();
        jRadioButtonNome.setSelected(true);
        jTextFieldPessoaNome.setEnabled(false);
    }
    
    private void jButtonAddTelDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTelDDDActionPerformed
        // TODO add your handling code here:
        InserirTelefoneDDD();
    }//GEN-LAST:event_jButtonAddTelDDDActionPerformed

    private void jButtonAddTelTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTelTipoActionPerformed
        // TODO add your handling code here:
        InserirTelefoneTipo();
    }//GEN-LAST:event_jButtonAddTelTipoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Sair();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarAlterarActionPerformed
        // TODO add your handling code here:
        //VerificadorPessoa();
        //MododeGravacao();
        //InserirTelefonePessoa();
        VerificarTelefonePessoa();
    }//GEN-LAST:event_jButtonGravarAlterarActionPerformed

    private void jTextFieldPessoaRAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPessoaRAKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            ConsultarVerificadorPessoa();
        }
    }//GEN-LAST:event_jTextFieldPessoaRAKeyPressed

    private void jRadioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNomeActionPerformed
        // TODO add your handling code here:
        jRadioButtonNome.setSelected(true);
        jRadioButtonNumero.setSelected(false);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonNomeActionPerformed

    private void jRadioButtonNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNumeroActionPerformed
        // TODO add your handling code here:
        jRadioButtonNome.setSelected(false);
        jRadioButtonNumero.setSelected(true);
        jTextFieldPesquisa.setText("");
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_jRadioButtonNumeroActionPerformed

    private void jTextFieldPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            Consultar();
        }
    }//GEN-LAST:event_jTextFieldPesquisaKeyPressed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        jTextFieldPesquisa.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void jTextFieldCodigoTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoTelefoneKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            //ConsultarVerificadorPessoa();
            RemoverTelefonePessoa();
        }
    }//GEN-LAST:event_jTextFieldCodigoTelefoneKeyPressed

    public void VerificarTelefonePessoa(){
    try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.VerificarTelefonePessoa(jComboBoxUF.getSelectedItem().toString(), jTextFieldPessoaRA.getText().toUpperCase().replace(".", "").replace("-", ""), jComboBoxTelDDD.getSelectedItem().toString(), jTextFieldTelNumero.getText().toUpperCase().replace(".", "").replace("-", ""), jTextFieldTelRamal.getText());
            int v = 0;
            while(rs.next()){       
                v = (rs.getInt("verificador"));  
            }
            if (v == 0){
                InserirTelefonePessoa();
            }else{
                RecuperarTelefonePessoa();
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }    
    }
    
    public void RemoverTelefonePessoa(){
        try{
            BaseCTR biblioteca = new BaseCTR();	
            if ("".equals(jTextFieldCodigoTelefone.getText())){
               JOptionPane.showMessageDialog(null,"Campo Código está Vazio, Verifique!. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);   
               jTextFieldCodigoTelefone.requestFocus();
            }else{
                int i = JOptionPane.showConfirmDialog(null, "Deseja Retirar este Telefone dos Contatos? ","Informação: ", JOptionPane.YES_NO_OPTION);
                if(i == JOptionPane.YES_OPTION){
                    biblioteca.RemoverTelefonePessoa(Integer.parseInt(jTextFieldCodigoTelefone.getText()));
                    JOptionPane.showMessageDialog(null,"Foi Retirado com Sucesso dos Contatos. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                    //ConsultarRelatarAcervo();
                    //LimparCampos();
                    Consultar();
                    jTextFieldCodigoTelefone.setText("");
                    jTextFieldPesquisa.requestFocus();
                }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Campos de Dados em Branco... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
		System.out.println(e.getMessage());
	}
    }
    
    public void RecuperarTelefonePessoa(){
    try{
            BaseCTR inserirCTR = new BaseCTR();	
            int i = JOptionPane.showConfirmDialog(null, "Deseja Recuperar este Número de Telefone? ","Informação: ", JOptionPane.YES_NO_OPTION);
            if(i == JOptionPane.YES_OPTION){
                inserirCTR.RecuperarTelefonePessoa(jComboBoxUF.getSelectedItem().toString(), jTextFieldPessoaRA.getText().toUpperCase().replace(".", "").replace("-", ""), jComboBoxTelDDD.getSelectedItem().toString(), jTextFieldTelNumero.getText().toUpperCase().replace(".", "").replace("-", ""), jTextFieldTelRamal.getText());
                JOptionPane.showMessageDialog(null,"Número de Telefone Recuperado com Sucesso. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                Consultar();
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Campos de Dados em Branco... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
		System.out.println(e.getMessage());
	}    
    }
    
    public void InserirTelefonePessoa(){
    try{
            BaseCTR inserirCTR = new BaseCTR();	
            if ("".equals(jComboBoxUF.getSelectedItem()) || "".equals(jTextFieldPessoaRA.getText()) || "".equals(jComboBoxTelTipo.getSelectedItem()) || "".equals(operadora) || "".equals(jComboBoxTelDDD.getSelectedItem()) || "".equals(jTextFieldTelNumero.getText())){
               JOptionPane.showMessageDialog(null,"Campos de Dados em Branco, Verifique...","Informação: ",JOptionPane.INFORMATION_MESSAGE);   
               jTextFieldPessoaRA.requestFocus();
            }else{
                int i = JOptionPane.showConfirmDialog(null, "Deseja Inserir este Número de Telefone? ","Informação: ", JOptionPane.YES_NO_OPTION);
                if(i == JOptionPane.YES_OPTION){
                    inserirCTR.InserirTelefonePessoa(jComboBoxUF.getSelectedItem().toString(), jTextFieldPessoaRA.getText().toUpperCase().replace(".", "").replace("-", ""), jComboBoxTelTipo.getSelectedItem().toString(), operadora, jComboBoxTelDDD.getSelectedItem().toString(), jTextFieldTelNumero.getText().replace(".", "").replace("-", ""), jTextFieldTelRamal.getText(), jTextFieldTelObs.getText().toUpperCase());
                    JOptionPane.showMessageDialog(null,"Número de Telefone Inserido com Sucesso. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                    //LimparCampos();
                    Consultar();
                    jTextFieldTelNumero.setText("");
                    jTextFieldTelRamal.setText("");
                    jTextFieldTelObs.setText("");
                    //MostrarDadosTabelaTelefone();
                    jTextFieldPessoaRA.setText("");
                    jTextFieldPessoaNome.setText("");
                }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Campos de Dados em Branco... ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
		System.out.println(e.getMessage());
	}    
    }
    
    public void ConsultarVerificadorPessoa(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.VerificadorRelatarPessoa(jComboBoxUF.getSelectedItem().toString(), jTextFieldPessoaRA.getText().toUpperCase().replace(".", "").replace("-", ""));
            int v = 0;
            while(rs.next()){       
                v = (rs.getInt("verificador"));  
            }
            if (v == 0){
                JOptionPane.showMessageDialog(null,"RG/RA não encontrado ou não existente. Verifique...","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                jTextFieldPessoaRA.setText("");
                jTextFieldPessoaNome.setText("");
                jTextFieldPessoaRA.requestFocus();
                
                AlunoConsultaDIALOG  jDialog = new AlunoConsultaDIALOG(null, true);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                jComboBoxUF.setSelectedItem(jDialog.getGetuf());
                jTextFieldPessoaRA.setText(jDialog.getGetid());
                jTextFieldPessoaNome.setText(jDialog.getGetnome());
            }else{
                ConsultarRelatarPessoaNome();
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
         }
    }
    
    public void ConsultarRelatarPessoaNome(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            rs=consultar.ConsultarRelatarPessoaNome(jComboBoxUF.getSelectedItem().toString(), jTextFieldPessoaRA.getText().toUpperCase().replace(".", "").replace("-", ""));
            while (rs.next()){
                jTextFieldPessoaNome.setText((rs.getString("pessoa_nome")));
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
            jComboBoxUF.removeAllItems();
            while(rs.next()){       
                jComboBoxUF.addItem(rs.getString("uf_nome"));       
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void Consultar() {
        if (jRadioButtonNome.isSelected()){
            ConsultarListaTelefonicaNome();
        }
        if (jRadioButtonNumero.isSelected()){
            //ConsultarBibliotecaAutor();
            ConsultarListaTelefonicaNumero();
        }
    }
    
    public void ConsultarListaTelefonicaNome(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            rs=consultar.ConsultarListaTelefonicaNome(jTextFieldPesquisa.getText().toUpperCase().replace("Á", "A").replace("á", "A").replace("É", "E").replace("é", "E").replace("Í", "I").replace("í", "I").replace("ã", "A").replace("Ã", "A").replace("Ó", "O").replace("ó", "O"));
            DefaultTableModel modelo = (DefaultTableModel) jTableListaTelefonica.getModel();
            modelo.setNumRows(0);
            while (rs.next()){
                Object[] novaLinha = new Object[9];
                novaLinha[0] = rs.getString("tel_id");
                novaLinha[1] = rs.getString("tel_data");
                novaLinha[2] = rs.getString("tel_tipo");
                novaLinha[3] = rs.getString("tel_operadora");
                novaLinha[4] = rs.getString("tel_ddd_numero");
                novaLinha[5] = rs.getString("tel_numero");
                novaLinha[6] = rs.getString("tel_ramal");
                novaLinha[7] = rs.getString("pessoa_nome");
                novaLinha[8] = rs.getString("tel_obs");
                modelo.addRow(novaLinha);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void ConsultarListaTelefonicaNumero(){
        try{
            BaseCTR consultar = new BaseCTR();
            ResultSet rs=null;
            rs=consultar.ConsultarListaTelefonicaNumero(jTextFieldPesquisa.getText().toUpperCase().replace(".", "").replace("-", ""));
            DefaultTableModel modelo = (DefaultTableModel) jTableListaTelefonica.getModel();
            modelo.setNumRows(0);
            while (rs.next()){
                Object[] novaLinha = new Object[9];
                novaLinha[0] = rs.getString("tel_id");
                novaLinha[1] = rs.getString("tel_data");
                novaLinha[2] = rs.getString("tel_tipo");
                novaLinha[3] = rs.getString("tel_operadora");
                novaLinha[4] = rs.getString("tel_ddd_numero");
                novaLinha[5] = rs.getString("tel_numero");
                novaLinha[6] = rs.getString("tel_ramal");
                novaLinha[7] = rs.getString("pessoa_nome");
                novaLinha[8] = rs.getString("tel_obs");
                modelo.addRow(novaLinha);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void Sair(){
        this.dispose();
    }
    
    public void ConsultarRelatarPessoaRA(ResultSet rs){
        try {
            
            if (rs.next()){
                jComboBoxUF.setSelectedItem(String.valueOf(rs.getString("pessoa_ci_uf")));
                jTextFieldPessoaRA.setText(String.valueOf(rs.getString("pessoa_ci_numero")));
                jTextFieldPessoaNome.setText(String.valueOf(rs.getString("pessoa_nome")));
                
            }else{
                JOptionPane.showMessageDialog(null,"RG/RA não encontrado! ","Informação",JOptionPane.INFORMATION_MESSAGE);
               }
            } 
        catch (Exception e){
            System.out.println(e.getMessage());    
         }
    }
    
    public void InserirTelefoneTipo(){
        try{
            BaseCTR inserirCTR = new BaseCTR();
            String tipo = JOptionPane.showInputDialog("Informe o Tipo de Telefone:","");
            if ("".equals(tipo)){
                JOptionPane.showMessageDialog(null,"Campo em Branco. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                inserirCTR.InserirTelefoneTipo(tipo.toUpperCase());
		JOptionPane.showMessageDialog(null,""+tipo+" Inserido com Sucesso. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                ConsultarTelefoneTipo();
            }
	}
            catch(Exception e){
		System.out.println(e.getMessage());
	}
    }
    
    public void ConsultarTelefoneTipo(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.ConsultarTelefoneTipo();
            jComboBoxTelTipo.removeAllItems();
            while(rs.next()){       
                jComboBoxTelTipo.addItem(rs.getString("tel_tipo"));    
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void InserirTelefoneOperadora(){
        try{
            BaseCTR inserirCTR = new BaseCTR();
            String operadora = JOptionPane.showInputDialog("Informe a Operadora do Telefone:","");
            if ("".equals(operadora)){
                JOptionPane.showMessageDialog(null,"Campo em Branco. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                inserirCTR.InserirTelefoneOperadora(operadora.toUpperCase());
		JOptionPane.showMessageDialog(null,""+operadora+" Inserido com Sucesso. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                ConsultarTelefoneOperadora();
            }
	}
            catch(HeadlessException e){
		System.out.println(e.getMessage());
	}
    }
    
    public void ConsultarTelefoneOperadora(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.ConsultarTelefoneOperadora();
            //jComboBoxTelOperadora.removeAllItems();
            while(rs.next()){       
                //jComboBoxTelOperadora.addItem(rs.getString("tel_operadora"));    
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    public void InserirTelefoneDDD(){
        try{
            BaseCTR inserirCTR = new BaseCTR();
            String ddd = JOptionPane.showInputDialog("Informe o DDD do Telefone:","");
            if ("".equals(ddd)){
                JOptionPane.showMessageDialog(null,"Campo em Branco. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                inserirCTR.InserirTelefoneDDD(ddd.toUpperCase());
		JOptionPane.showMessageDialog(null,""+ddd+" Inserido com Sucesso. ","Informação: ",JOptionPane.INFORMATION_MESSAGE);
                ConsultarTelefoneDDD();
            }
	}
            catch(Exception e){
		System.out.println(e.getMessage());
	}
    }
    
    public void ConsultarTelefoneDDD(){
        try{
            BaseCTR consultarCTR = new BaseCTR();
            ResultSet rs=null;
            rs=consultarCTR.ConsultarTelefoneDDD();
            jComboBoxTelDDD.removeAllItems();
            while(rs.next()){       
                jComboBoxTelDDD.addItem(rs.getString("tel_ddd_numero"));    
            }
         }
         catch (Exception e){
            System.out.println(e.getMessage());    
            }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddTelDDD;
    private javax.swing.JButton jButtonAddTelTipo;
    private javax.swing.JButton jButtonGravarAlterar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxTelDDD;
    private javax.swing.JComboBox jComboBoxTelTipo;
    private javax.swing.JComboBox jComboBoxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JRadioButton jRadioButtonNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaTelefonica;
    private javax.swing.JTextField jTextFieldCodigoTelefone;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldPessoaNome;
    private javax.swing.JTextField jTextFieldPessoaRA;
    private javax.swing.JTextField jTextFieldTelNumero;
    private javax.swing.JTextField jTextFieldTelObs;
    private javax.swing.JTextField jTextFieldTelRamal;
    // End of variables declaration//GEN-END:variables

    
}
