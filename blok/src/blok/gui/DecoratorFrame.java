/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import blok.controller.PluginController;
import decorator.Decorator;
import decorator.IComponent;
import decorator.Player;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex
 */
public class DecoratorFrame extends javax.swing.JFrame {

    private PluginController plugins;
    private Map<String, Decorator> decorators = new HashMap<>();
    DefaultTableModel linhaDecoratorsSelecionados;
    DefaultTableModel linhaDecoratorsDisponiveis;

    /**
     * Creates new form DecoratorFrame
     */
    public DecoratorFrame() {
        initComponents();
        plugins = PluginController.getInstance();
        plugins.initialize();
        linhaDecoratorsSelecionados = (DefaultTableModel) jtbDecoratorsSelecionados.getModel();
        linhaDecoratorsDisponiveis = (DefaultTableModel) jtbDecoratorsDisponiveis.getModel();
        lerPlugins();
    }

    public void lerPlugins() {
        for (Object x : this.plugins.getLoadedPluginsByType(Decorator.class)) {
            String text = x.getClass().getName().split("\\.")[1];
            linhaDecoratorsDisponiveis.addRow(new String[]{text});
            decorators.put(text, (Decorator) x);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubir = new javax.swing.JButton();
        btnDescer = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDecoratorsSelecionados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbDecoratorsDisponiveis = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubir.setText("Subir");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnDescer.setText("Descer");
        btnDescer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescerActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnCarregar.setText(">");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        jtbDecoratorsSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Decorators Selecionados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbDecoratorsSelecionados);

        jtbDecoratorsDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Decorators Disponíveis"
            }
        ));
        jScrollPane3.setViewportView(jtbDecoratorsDisponiveis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDescer)
                            .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubir)
                        .addGap(12, 12, 12)
                        .addComponent(btnDescer)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOk)
                            .addComponent(jButton5)))
                    .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        String texto = linhaDecoratorsDisponiveis.getValueAt(jtbDecoratorsDisponiveis.getSelectedRow(), 0).toString();
        linhaDecoratorsSelecionados.addRow(new String[]{texto});
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        //tentar implementar iterator
        try{
        String texto = jtbDecoratorsSelecionados.getValueAt(jtbDecoratorsSelecionados.getSelectedRow(), 0).toString();
        String texto2 = jtbDecoratorsSelecionados.getValueAt(jtbDecoratorsSelecionados.getSelectedRow() - 1, 0).toString();
        jtbDecoratorsSelecionados.setValueAt(texto2, jtbDecoratorsSelecionados.getSelectedRow(), 0);
        jtbDecoratorsSelecionados.setValueAt(texto, jtbDecoratorsSelecionados.getSelectedRow() - 1, 0);
        jtbDecoratorsSelecionados.setRowSelectionInterval(jtbDecoratorsSelecionados.getSelectedRow() - 1, jtbDecoratorsSelecionados.getSelectedRow() - 1);
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnDescerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescerActionPerformed
        try{
        String texto = jtbDecoratorsSelecionados.getValueAt(jtbDecoratorsSelecionados.getSelectedRow(), 0).toString();
        String texto2 = jtbDecoratorsSelecionados.getValueAt(jtbDecoratorsSelecionados.getSelectedRow() + 1, 0).toString();
        jtbDecoratorsSelecionados.setValueAt(texto2, jtbDecoratorsSelecionados.getSelectedRow(), 0);
        jtbDecoratorsSelecionados.setValueAt(texto, jtbDecoratorsSelecionados.getSelectedRow() + 1, 0);
        jtbDecoratorsSelecionados.setRowSelectionInterval(jtbDecoratorsSelecionados.getSelectedRow() + 1, jtbDecoratorsSelecionados.getSelectedRow() + 1);
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }//GEN-LAST:event_btnDescerActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        linhaDecoratorsSelecionados.removeRow(jtbDecoratorsSelecionados.getSelectedRow());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        IComponent component = new Player();

        for (int i = 0; i < jtbDecoratorsSelecionados.getRowCount(); i++) {
            Decorator decorator;
            try {
                decorator = decorators.get(linhaDecoratorsSelecionados.getValueAt(i, 0)).getClass().newInstance();
                decorator.setDecorator(component);
                component = decorator;
            } catch (InstantiationException ex) {
                Logger.getLogger(DecoratorFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(DecoratorFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        component.desenhar();
    }//GEN-LAST:event_btnOkActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(DecoratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecoratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecoratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecoratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecoratorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnDescer;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSubir;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbDecoratorsDisponiveis;
    private javax.swing.JTable jtbDecoratorsSelecionados;
    // End of variables declaration//GEN-END:variables
}
