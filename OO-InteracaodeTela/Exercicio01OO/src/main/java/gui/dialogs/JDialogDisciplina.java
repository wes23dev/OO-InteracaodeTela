/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.dialogs;

import classe.Disciplina;
import gerenciador.gerenciadorDisciplina;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class JDialogDisciplina extends javax.swing.JDialog {
    
    private boolean editando;
    private String nomeEscolhido;
    private Disciplina discEditando;
    private gerenciadorDisciplina gerenciaDisc;

     public JDialogDisciplina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.editando= false;
        this.nomeEscolhido = "";
        this.discEditando = new Disciplina();
        this.gerenciaDisc = new gerenciadorDisciplina();
        
        
    
    
        
        this.habilitarCampos(false);
        this.limparCampos();

        this.gerenciaDisc.carregarDoArquivo("ListagemDisciplina.csv");
        String listagem = this.gerenciaDisc.toString();
        txtImprimir.setText(listagem);
    }
    public void habilitarCampos(boolean flag) {
        
        txtNome.setEnabled(flag);
        txtSemestre.setEnabled(flag);
        txtHorario.setEnabled(flag);
        txtProfMin.setEnabled(flag);
    }

    public void limparCampos() {
        txtNome.setText("");
        txtSemestre.setText("");
        txtHorario.setText("");
        txtProfMin.setText("");
    }

    public void objetoParaCampos(Disciplina p) {
      
       txtNome.setText(p.getNome());
       txtSemestre.setText(p.getSemestre()+ "");
       txtHorario.setText(p.getHorario());
       txtProfMin.setText(p.getProfMinistrante()+"");

    }
    public Disciplina camposParaObjeto() {
        Disciplina p = new Disciplina();
        p.setNome(txtNome.getText());
        //copia o conteudo da caixaDeTexto
        String semestreTexto = txtSemestre.getText();
        int a = 0;
        if (!semestreTexto.isEmpty()) {
            a = Integer.parseInt(semestreTexto);
        }
        p.setSemestre(a);
        p.setHorario(txtHorario.getText());
        p.setProfMinistrante(txtProfMin.getText());
        
        return p;
    }


    /**
     * Creates new form JDialogDisciplina
     */
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelDisciplina = new javax.swing.JPanel();
        jlbDisciplina = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEdt = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtImprimir = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSemestre = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        lblHorario = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        lblProfMin = new javax.swing.JLabel();
        txtProfMin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanelDisciplina.setBackground(new java.awt.Color(255, 255, 255));

        jlbDisciplina.setFont(new java.awt.Font("Edwardian Script ITC", 2, 48)); // NOI18N
        jlbDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        jlbDisciplina.setText("Disciplina ");
        JPanelDisciplina.add(jlbDisciplina);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo);

        btnEdt.setForeground(new java.awt.Color(255, 255, 255));
        btnEdt.setText("Editar");
        btnEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdtActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdt);

        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);

        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir);

        txtImprimir.setBackground(new java.awt.Color(255, 255, 255));
        txtImprimir.setColumns(20);
        txtImprimir.setForeground(new java.awt.Color(0, 0, 0));
        txtImprimir.setRows(5);
        jScrollPane1.setViewportView(txtImprimir);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblSemestre.setForeground(new java.awt.Color(0, 0, 0));
        lblSemestre.setText("Semestre");

        lblHorario.setForeground(new java.awt.Color(0, 0, 0));
        lblHorario.setText("Horario");

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        lblProfMin.setForeground(new java.awt.Color(0, 0, 0));
        lblProfMin.setText("Prof. Ministrante");

        txtProfMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfMinActionPerformed(evt);
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
                        .addGap(6, 6, 6)
                        .addComponent(lblHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProfMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProfMin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSemestre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemestre)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfMin)
                    .addComponent(txtProfMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelDisciplina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.limparCampos();
       this.habilitarCampos(false);
       this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Disciplina novoDisc = this.camposParaObjeto();

        if (this.editando == true) {
            this.gerenciaDisc.atualizarDisciplina(nomeEscolhido, novoDisc);
        } else { //Estou inserindo
            this.gerenciaDisc.addDisciplina(novoDisc);
        }

        this.limparCampos();
        this.habilitarCampos(false);

        String listagem = gerenciaDisc.toString();
        txtImprimir.setText(listagem);

        this.gerenciaDisc.salvarNoArquivo("ListagemDisciplina.csv");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void txtProfMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfMinActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
      this.limparCampos();
      this.habilitarCampos(true);
      this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdtActionPerformed
        String nomeEscolhido = JOptionPane.showInputDialog("Informe o nome que deseja EDITAR:", "");

        this.discEditando = this.gerenciaDisc.buscarDisciplina(nomeEscolhido);

        if (discEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe este nome.");
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(discEditando);
            this.editando = true;
        }

    }//GEN-LAST:event_btnEdtActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         String nomeEscolhido = JOptionPane.showInputDialog("Informe o nome que deseja excluir:", "");

        Disciplina p = this.gerenciaDisc.buscarDisciplina(nomeEscolhido);

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Não existe este nome.");
        } else {
            this.gerenciaDisc.removeDisciplina(nomeEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }

        txtImprimir.setText(this.gerenciaDisc.toString());

        //Salvando no arquivo
        this.gerenciaDisc.salvarNoArquivo("ListagemDisciplina.csv");

    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogDisciplina dialog = new JDialogDisciplina(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel JPanelDisciplina;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdt;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbDisciplina;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProfMin;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextArea txtImprimir;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProfMin;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
