/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tmvendas.gui;

import br.com.tmvendas.dao.FuncionarioDAO;
import br.com.tmvendas.modelo.Funcionario;
import javax.swing.JOptionPane;



public class AddFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form AddFuncionario
     */
    private boolean flag;
    private Funcionario funcionario;

    public AddFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(this);
        initComponents();
        this.flag = false;
    }

    public AddFuncionario(java.awt.Frame parent, boolean modal, Funcionario funcionario) {
        super(parent, modal);
        setLocationRelativeTo(this);
        initComponents();
        this.funcionario = funcionario;
        campoNome.setText(funcionario.getNome());
        campoUsuario.setText(funcionario.getUsuario());
        campoCpf.setText(funcionario.getCpf());
        campoEndereço.setText(funcionario.getEndereco());
        campoCargaHoraria.setText(funcionario.getCargaHoraria() + "");
        campoSalario.setText(funcionario.getSalario() + "");
        this.flag = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        campoEndereço = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoSalario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCargaHoraria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Funcionario");
        setResizable(false);

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1294_16x16.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        labelEndereco.setText("Endereço:");

        labelCpf.setText("Cpf:");

        labelNome.setText("Nome:");

        labelUsuario.setText("Usuario:");

        jLabel1.setText("Salario:");

        jLabel2.setText("Carga Horaria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCpf)
                    .addComponent(labelEndereco)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(botaoSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoCancelar))
                                .addComponent(jLabel2)
                                .addComponent(campoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoEndereço, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelUsuario))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionarioAdd = new Funcionario();
        if (!flag) {
            funcionarioAdd.setNome(campoNome.getText());
            funcionarioAdd.setUsuario(campoUsuario.getText());
            funcionarioAdd.setCpf(campoCpf.getText());
            funcionarioAdd.setEndereco(campoEndereço.getText());
            funcionarioAdd.setCargaHoraria(Integer.valueOf(campoCargaHoraria.getText()));
            funcionarioAdd.setSalario(Double.valueOf(campoSalario.getText()));
            dao.add(funcionarioAdd);
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso.", "Ok", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            funcionario.setNome(campoNome.getText());
            funcionario.setUsuario(campoUsuario.getText());
            funcionario.setCpf(campoCpf.getText());
            funcionario.setEndereco(campoEndereço.getText());
            funcionario.setCargaHoraria(Integer.valueOf(campoCargaHoraria.getText()));
            funcionario.setSalario(Double.valueOf(campoSalario.getText()));
            dao.update(funcionario);
            JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso.", "Ok", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddFuncionario dialog = new AddFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCargaHoraria;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEndereço;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
