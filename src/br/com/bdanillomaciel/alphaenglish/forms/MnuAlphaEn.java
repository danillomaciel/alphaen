/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MnuAlphaEn.java
 *
 * Created on 26/06/2011, 18:53:13
 */
package br.com.bdanillomaciel.alphaenglish.forms;

import br.com.danillomaciel.alphaenglish.visao.Principal;
import br.com.danillomaciel.alphaenglish.modelo.Frase;
import br.com.danillomaciel.alphaenglish.persistencia.Dao;
import br.com.danillomaciel.alphaenglish.persistencia.FraseDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danillo
 */
public class MnuAlphaEn extends javax.swing.JInternalFrame {

    DefaultTableModel tmFrase = new DefaultTableModel(null, new String[]{"Id", "Português", "Inglês", "Nome do Livro", "Lição ou Unidade", "Tipo da Frase"});
    List<Frase> frases;
    ListSelectionModel lsmFrase;

    /** Creates new form MnuAlphaEn */
    public MnuAlphaEn() {
        initComponents();
        adicionaItensCombo();
          
        //  listaLivros();
        desabilitaDados();

    }
    public final void adicionaItensCombo(){
          FraseDao fraseDao = new FraseDao();  

        try {
            cbNomeLivro.setSelectedItem(fraseDao.getLista());
            
        } catch (Exception ex) {
            Logger.getLogger(MnuAlphaEn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPt = new javax.swing.JLabel();
        lblEn = new javax.swing.JLabel();
        txtPt = new javax.swing.JTextField();
        txtEn = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblNomeLivro = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        lblUnidLivro = new javax.swing.JLabel();
        txtUnidLivro = new javax.swing.JTextField();
        cbTipoFrase = new javax.swing.JComboBox();
        lblNomeLivro1 = new javax.swing.JLabel();
        cbNomeLivro = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(java.awt.Color.white);
        setTitle("Cadastrar Frase");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Frase"));

        lblPt.setText("Digite a Frase em Português:");

        lblEn.setText("Digite a frase em Inglês:");

        txtPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtActionPerformed(evt);
            }
        });

        txtEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setVisible(false);
        txtId.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtIdComponentShown(evt);
            }
        });

        lblNomeLivro.setText("Digite o nome do livro:");

        txtNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLivroActionPerformed(evt);
            }
        });

        lblUnidLivro.setText("Digite a unidade ou lesson do livro:");

        txtUnidLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidLivroActionPerformed(evt);
            }
        });

        cbTipoFrase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afirmativa", "Interrogativa", "Negativa", "Palavra" }));
        cbTipoFrase.setName("cbTipoFrase"); // NOI18N
        cbTipoFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoFraseActionPerformed(evt);
            }
        });

        lblNomeLivro1.setText("Escolha o tipo da frase:");
        lblNomeLivro1.setName("lblTipoFrase"); // NOI18N

        cbNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeLivroActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPt)
                            .addComponent(lblEn)
                            .addComponent(lblNomeLivro))
                        .addGap(3, 3, 3)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNomeLivro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPt, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addComponent(txtEn, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTipoFrase, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE)
                            .addComponent(txtNomeLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUnidLivro)
                                .addGap(18, 18, 18)
                                .addComponent(txtUnidLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbNomeLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPt)
                        .addGap(18, 18, 18)
                        .addComponent(lblEn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeLivro)
                    .addComponent(txtUnidLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidLivro))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeLivro1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbTipoFrase.getAccessibleContext().setAccessibleName("");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovoKeyPressed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        btnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarKeyPressed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExcluirKeyPressed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSairKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnNovo, btnSair, btnSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnNovo, btnSair, btnSalvar});

        Tabela.setModel(tmFrase);
        Tabela.setAutoscrolls(false);
        Tabela.setFocusable(false);
        Tabela.setMaximumSize(new java.awt.Dimension(2, 0));
        Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmFrase = Tabela.getSelectionModel();
        lsmFrase.addListSelectionListener(new ListSelectionListener() { 

            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){ tbLinhaSelecionada(Tabela); }
            }
        });

        jScrollPane1.setViewportView(Tabela);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyPressed(evt);
            }
        });

        lblPesquisar.setText("Pesquisar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisar)
                        .addGap(38, 38, 38)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisar)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtActionPerformed

    private void txtEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed

    public void novo() {
        habilitaDados();
        txtEn.setText("");
        txtPt.setText("");
        txtNomeLivro.setText("");
        txtUnidLivro.setText("");
        txtPt.requestFocus();
    }

    public boolean verDados() {
        if (!txtPt.getText().equals("") && (!txtEn.getText().equals("")) && (!txtNomeLivro.getText().equals("")) && (!txtUnidLivro.getText().equals(""))) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Um campo não está preenchido!");
            return false;
        }

    }

    private void tbLinhaSelecionada(JTable tabela) {
        if (Tabela.getSelectedRow() != -1) {
            habilitaDados();
            txtId.setText(String.valueOf(frases.get(tabela.getSelectedRow()).getId()));
            txtPt.setText(frases.get(tabela.getSelectedRow()).getfPortugues());
            txtEn.setText(frases.get(tabela.getSelectedRow()).getfIngles());
            txtNomeLivro.setText(frases.get(tabela.getSelectedRow()).getNomeLivro());
            txtUnidLivro.setText(frases.get(tabela.getSelectedRow()).getUnidLivro());
            cbTipoFrase.setSelectedItem(frases.get(tabela.getSelectedRow()).getTipoFrase());



        } else {
            txtId.setText("");
            txtPt.setText("");
            txtEn.setText("");
            txtNomeLivro.setText("");
            txtUnidLivro.setText("");




        }


    }

    public void listarFrases() {
        try {
            FraseDao fd = new FraseDao();
            frases = fd.getLista("%" + txtPesquisar.getText() + "%");
            mostraPesquisa(frases);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }






    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        listarFrases();




    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();


    }//GEN-LAST:event_btnExcluirActionPerformed

    public void excluir() {
        try {
            excluirFrase();
            listarFrases();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema no excluir!");
        }
    }
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed
    public void alterar() {
        try {
            alteraFrase();
            //listarFrases();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema no alterar!");
        }
    }
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLivroActionPerformed

    private void txtUnidLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidLivroActionPerformed

    private void txtIdComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtIdComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdComponentShown

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        salvar();
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyPressed
        novo();
    }//GEN-LAST:event_btnNovoKeyPressed

    private void btnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyPressed
        alterar();// TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarKeyPressed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
        excluir();
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        this.dispose();
    }//GEN-LAST:event_btnSairKeyPressed

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        listarFrases();
    }//GEN-LAST:event_btnPesquisarKeyPressed

private void cbTipoFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoFraseActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cbTipoFraseActionPerformed

private void cbNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeLivroActionPerformed

    
}//GEN-LAST:event_cbNomeLivroActionPerformed

   

    public void salvar() {
        if (verDados()) {
            cadastrar();
            desabilitaDados();
            listarFrases();

        }

    }

    public void excluirFrase() throws Exception {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir essa Frase?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            FraseDao fd = new FraseDao();
            fd.deletar(frases.get(Tabela.getSelectedRow()));
            mostraPesquisa(frases);



        }
    }

    private void desabilitaDados() {
        txtPt.setEditable(false);
        txtEn.setEditable(false);
        txtNomeLivro.setEditable(false);
        txtUnidLivro.setEditable(false);
        cbTipoFrase.enable(false);
    }

    private void habilitaDados() {
        txtPt.setEditable(true);
        txtEn.setEditable(true);
        txtNomeLivro.setEditable(true);
        txtUnidLivro.setEditable(true);
        cbTipoFrase.enable(true);
    }

    public void cadastrar() {
        try {
            Frase f = new Frase();
            f.setfPortugues(txtPt.getText());
            f.setfIngles(txtEn.getText());
            f.setNomeLivro(txtNomeLivro.getText());
            f.setUnidLivro(txtUnidLivro.getText());
            f.setTipoFrase((String) (cbTipoFrase.getSelectedItem()));
            FraseDao fd = new FraseDao();
            fd.gravar(f);
        } catch (Exception ex) {
            Logger.getLogger(MnuAlphaEn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                // GuiIF guiif = new GuiIF();

                //new MnuAlphaEn().setVisible(true);
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbNomeLivro;
    private javax.swing.JComboBox cbTipoFrase;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEn;
    private javax.swing.JLabel lblNomeLivro;
    private javax.swing.JLabel lblNomeLivro1;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblPt;
    private javax.swing.JLabel lblUnidLivro;
    private javax.swing.JTextField txtEn;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeLivro;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPt;
    private javax.swing.JTextField txtUnidLivro;
    // End of variables declaration//GEN-END:variables

    public void mostraPesquisa(List<Frase> frases) {
        while (tmFrase.getRowCount() > 0) {
            tmFrase.removeRow(0);

        }
        if (frases.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado!");
        } else {
            String[] linha = new String[]{null, null, null};
            for (int i = 0; i < frases.size(); i++) {
                tmFrase.addRow(linha);
                tmFrase.setValueAt(frases.get(i).getId(), i, 0);
                tmFrase.setValueAt(frases.get(i).getfPortugues(), i, 1);
                tmFrase.setValueAt(frases.get(i).getfIngles(), i, 2);
                tmFrase.setValueAt(frases.get(i).getNomeLivro(), i, 3);
                tmFrase.setValueAt(frases.get(i).getUnidLivro(), i, 4);
                tmFrase.setValueAt(frases.get(i).getTipoFrase(), i, 5);




            }

        }
    }

    private void alteraFrase() throws Exception {
        if (Tabela.getSelectedRow() != -1) {
            if (verDados()) {
                Frase f = new Frase();
                FraseDao fd = new FraseDao();
                int a = Integer.parseInt(txtId.getText());
                f.setId(a);

                f.setfPortugues(txtPt.getText());
                f.setfIngles(txtEn.getText());
                f.setNomeLivro(txtNomeLivro.getText());
                f.setUnidLivro(txtUnidLivro.getText());
                f.setTipoFrase(cbTipoFrase.getToolTipText());
                fd.altera(f);
                JOptionPane.showMessageDialog(null, "Contato alterado com sucesso!");
            }

        }

    }
}
