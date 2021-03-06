/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.dsi.cookbook.gui;

import br.rj.macae.femass.dsi.cookbook.controle.ClienteControle;
import br.rj.macae.femass.dsi.cookbook.controle.QuartoControle;
import br.rj.macae.femass.dsi.cookbook.jpa.ClienteE;
import br.rj.macae.femass.dsi.cookbook.jpa.QuartoE;
import com.sun.javafx.geom.Quat4f;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hellk
 */
public class GuiQuartos extends javax.swing.JInternalFrame {

    /**
     * Creates new form guiQuartos
     */
    public GuiQuartos() throws SQLException {
        initComponents();
        limparCampos();
        desabilitarCampos();
        atualizarLista();
        btmStartSet();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuartos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btmSalvar = new javax.swing.JButton();
        btmCancelar = new javax.swing.JButton();
        btmNovo = new javax.swing.JButton();
        btmAlterar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtInquilino = new javax.swing.JTextField();
        btmSair = new javax.swing.JButton();

        jLabel1.setText("Numero");

        jLabel2.setText("Tipo");

        jLabel3.setText("Inquilino");

        tblQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Tipo", "Inquilino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuartos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblQuartos);
        tblQuartos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel4.setText("Quartos");

        btmSalvar.setText("Salvar");
        btmSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSalvarActionPerformed(evt);
            }
        });

        btmCancelar.setText("Cancelar");
        btmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCancelarActionPerformed(evt);
            }
        });

        btmNovo.setText("Novo");
        btmNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmNovoActionPerformed(evt);
            }
        });

        btmAlterar.setText("Alterar");
        btmAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAlterarActionPerformed(evt);
            }
        });

        txtNumero.setText("jTextField1");

        txtTipo.setText("jTextField2");

        txtInquilino.setText("jTextField3");

        btmSair.setText("Sair");
        btmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btmSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumero))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmSalvar)
                    .addComponent(btmCancelar)
                    .addComponent(btmNovo)
                    .addComponent(btmAlterar)
                    .addComponent(btmSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btmSairActionPerformed

    private void btmSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSalvarActionPerformed
        // TODO add your handling code here:
        QuartoControle control = new QuartoControle();
        ClienteControle cc = new ClienteControle();
        
        
        
        try {
            QuartoE q = new QuartoE();
            q.setId(Long.parseLong(txtNumero.getText()));
            if(txtInquilino.getText().equals("")){
                q.setInquilino(null);
            }else{
                if((cc.getCategoriaPorId(Long.parseLong(txtInquilino.getText())))!=null){
                    q.setInquilino(cc.getCategoriaPorId(Long.parseLong(txtInquilino.getText())));
                }else {
                    JOptionPane.showConfirmDialog(this, "Cliente Inexistente");
                }
                    
                    
                    }
            q.setTipo(txtTipo.getText());
            control.gravar(q);
            atualizarLista();
        } catch (SQLException ex) {
            Logger.getLogger(GuiQuartos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
        desabilitarCampos();
        btmStartSet();
        
        
        
    }//GEN-LAST:event_btmSalvarActionPerformed

    private void btmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCancelarActionPerformed
        try {
            // TODO add your handling code here:
            atualizarLista();
        } catch (SQLException ex) {
            Logger.getLogger(GuiQuartos.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
        desabilitarCampos();
        btmStartSet();
    }//GEN-LAST:event_btmCancelarActionPerformed

    private void btmNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmNovoActionPerformed
        // TODO add your handling code here:
        limparCampos();
        habilitarCampos();
        btmEditSet();
    }//GEN-LAST:event_btmNovoActionPerformed

    private void btmAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAlterarActionPerformed
        // TODO add your handling code here:
        if(tblQuartos.getSelectedRowCount()>0){
            QuartoControle controle = new QuartoControle();

            Long valor = (Long)((DefaultTableModel)tblQuartos.getModel()).getValueAt(tblQuartos.getSelectedRow(), 0);
            
           try {
               limparCampos();
               habilitarCampos();
            
                QuartoE q = controle.getCategoriaPorId(valor);
                if(q.getInquilino()!=null){
                    ClienteE i = q.getInquilino();
                    txtInquilino.setText(i.getId().toString());
                }else txtInquilino.setText("VAGO");
                
                txtNumero.setText(q.getId().toString());
                txtTipo.setText(q.getTipo());
                
                
            } catch (SQLException ex) {
                Logger.getLogger(GuiQuartos.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            btmEditSet();
            
        }
    }//GEN-LAST:event_btmAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAlterar;
    private javax.swing.JButton btmCancelar;
    private javax.swing.JButton btmNovo;
    private javax.swing.JButton btmSair;
    private javax.swing.JButton btmSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQuartos;
    private javax.swing.JTextField txtInquilino;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    private void atualizarLista() throws SQLException {
        QuartoControle controle = new QuartoControle();
        controle.atualizarLista(tblQuartos);
        
    
    }

    private void limparCampos() {
     txtInquilino.setText("");
    txtNumero.setText("");
    txtTipo.setText("");
    }

    private void desabilitarCampos() {
    txtInquilino.setEnabled(false);
    txtNumero.setEnabled(false);
    txtTipo.setEnabled(false);
    }

    private void habilitarCampos() {
    txtInquilino.setEnabled(true);
    txtNumero.setEnabled(true);
    txtTipo.setEnabled(true);
    }

    private void btmEditSet() {
    btmAlterar.setEnabled(false);
    btmNovo.setEnabled(false);
    btmCancelar.setEnabled(true);
    btmSair.setEnabled(true);
    btmSalvar.setEnabled(true);
    }
    
    private void btmStartSet(){
    btmAlterar.setEnabled(true);
    btmNovo.setEnabled(true);
    btmCancelar.setEnabled(true);
    btmSair.setEnabled(true);
    btmSalvar.setEnabled(false);
    
}
}
