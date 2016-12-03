/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotcc;

import controle.funcionarioDAO;
import entidade.Cargo;
import entidade.Funcionario;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bieuu
 */
public class Cadastro_funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_funcionario
     */
    public Cadastro_funcionario() {
        initComponents();
    }
    Funcionario funcionario;
    List<Funcionario> vetorFuncionario = new ArrayList<>();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lblrg = new javax.swing.JLabel();
        lblcpf = new javax.swing.JLabel();
        lblsexo = new javax.swing.JLabel();
        lblcnh = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEnviarFuncionario = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        txtcpf = new javax.swing.JFormattedTextField();
        txtcnh = new javax.swing.JFormattedTextField();
        txtrg = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidfuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Funcionário");

        lblnome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnome.setText("Nome:");

        lblrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblrg.setText("RG:");

        lblcpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcpf.setText("CPF:");

        lblsexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsexo.setText("Sexo:");

        lblcnh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcnh.setText("CNH:");

        lblcargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcargo.setText("Cargo:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1474678595_Human.png"))); // NOI18N
        jButton1.setText("Cadastro CLiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1474678780_3d_box.png"))); // NOI18N
        jButton3.setText("Produtos");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1474678699_square-calendar.png"))); // NOI18N
        jButton4.setText("Agenda");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1474678573_Document.png"))); // NOI18N
        jButton5.setText("Pedidos");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1474678654_Technology_Mix_-_Final-16.png"))); // NOI18N
        jButton6.setText("Cadastro Funcionarios");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1474678836_architecture-interior-14.png"))); // NOI18N
        jButton2.setText("Estoque");

        btnEnviarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1476343190_sent.png"))); // NOI18N
        btnEnviarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarFuncionarioActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1476343275_office-46.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1476343200_cross-24.png"))); // NOI18N
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1476486939_pen-checkbox.png"))); // NOI18N
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnEnviarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnLimpar)
                .addGap(15, 15, 15)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Id Funcionario:");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblsexo)
                        .addGap(10, 10, 10)
                        .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblcnh)
                        .addGap(10, 10, 10)
                        .addComponent(txtcnh, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblcargo)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblnome)
                                .addGap(18, 18, 18)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblrg)
                                .addGap(25, 25, 25)
                                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcpf)
                                .addGap(18, 18, 18)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnome)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblrg)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcpf)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsexo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcnh)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtcnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcargo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEnviarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarFuncionarioActionPerformed
       Funcionario fun = new Funcionario();
       fun.setNome(txtnome.getText());
       fun.setCpf(txtcpf.getText());
       fun.setCnh(txtcnh.getText());
       fun.setRg(txtrg.getText());
       fun.setSexo(txtsexo.getText());
       String codigo = txtidfuncionario.getText();
       if (!codigo.isEmpty()){
           fun.setIdfuncionario(Integer.valueOf(codigo));
           
            JOptionPane.showMessageDialog(null, "Enviado com Sucesso");
       }
    }//GEN-LAST:event_btnEnviarFuncionarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtnome.setText("");
        txtcnh.setText("");
        txtcpf.setText("");
        txtCargo.setText("");
        txtsexo.setText("");
        txtrg.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

    }//GEN-LAST:event_btnFecharActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Funcionario fun = new Funcionario();
        fun.setNome(txtnome.getText());
        fun.setCnh(txtcnh.getText());
        fun.setCpf(txtcpf.getText());
        
        fun.setSexo(txtsexo.getText());
        String codigo = txtidfuncionario.getText();
        fun.setIdfuncionario(Integer.valueOf(codigo));

       

       funcionarioDAO fdao = new funcionarioDAO();
        fdao.salvar(fun);

        txtnome.setEnabled(false);
        txtcnh.setEnabled(false);
        txtcpf.setEnabled(false);
        txtCargo.setEnabled(false);
        txtsexo.setEnabled(false);
      

        btneditar.setEnabled(true);
        btnEnviarFuncionario.setEnabled(true);

        txtnome.setText("");
        txtcnh.setText("");
        txtcpf.setText("");
        txtCargo.setText("");
        txtsexo.setText("");
        txtidfuncionario.setText("");
        txtnome.requestFocus();

        JOptionPane.showMessageDialog(null, "Enviado com Sucesso");
    }//GEN-LAST:event_btneditarActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        int linha = jList1.getSelectedIndex();
        Funcionario funcionarios = (Funcionario) vetorFuncionario.get(linha);
        preencheFuncionario(String.valueOf(funcionarios.getIdfuncionario()));
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarFuncionario;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lblcnh;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblrg;
    private javax.swing.JLabel lblsexo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtcnh;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtidfuncionario;
    private javax.swing.JTextField txtnome;
    private javax.swing.JFormattedTextField txtrg;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables

private void preencheFuncionario(String codigo){
    funcionarioDAO fDao = new funcionarioDAO();
    funcionario = fDao.buscaFuncionario(Integer.valueOf(codigo));
    txtCargo.setText(funcionario.getCargo().getNome());
    txtcnh.setText(funcionario.getCnh());
    txtcpf.setText(funcionario.getCpf());
    txtidfuncionario.setText(String.valueOf(funcionario.getIdfuncionario()));
    txtnome.setText(funcionario.getNome());
    txtrg.setText(funcionario.getRg());
    txtsexo.setText(funcionario.getSexo());
}
}
