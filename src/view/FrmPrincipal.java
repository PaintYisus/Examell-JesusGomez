/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import base.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    ArrayList<Empleado> listaEmpleado = new ArrayList();

    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGestionEmpleados = new javax.swing.JButton();
        btnTablaSalarios = new javax.swing.JButton();
        btnPromedioSalariosGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGestionEmpleados.setText("Gestion Empleados");
        btnGestionEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEmpleadosActionPerformed(evt);
            }
        });

        btnTablaSalarios.setText("Tabla de salarios");
        btnTablaSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaSalariosActionPerformed(evt);
            }
        });

        btnPromedioSalariosGenero.setText("Promedio Salios por Genero");
        btnPromedioSalariosGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioSalariosGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGestionEmpleados)
                .addGap(24, 24, 24)
                .addComponent(btnTablaSalarios)
                .addGap(13, 13, 13)
                .addComponent(btnPromedioSalariosGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTablaSalarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromedioSalariosGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEmpleadosActionPerformed
        DlgGestionEmpleados Gestion = new DlgGestionEmpleados(this, false, listaEmpleado);
        Gestion.setVisible(true);
        this.listaEmpleado = Gestion.listaEmpleado;
    }//GEN-LAST:event_btnGestionEmpleadosActionPerformed

    private void btnPromedioSalariosGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioSalariosGeneroActionPerformed
        DlgSalarioPromedioGenero promedioSalarios = new DlgSalarioPromedioGenero(this, rootPaneCheckingEnabled, listaEmpleado);
        promedioSalarios.setVisible(true);
        this.listaEmpleado = promedioSalarios.listaEmpleado;
    }//GEN-LAST:event_btnPromedioSalariosGeneroActionPerformed

    private void btnTablaSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaSalariosActionPerformed
        DlgListaSalarios listaSalarios = new DlgListaSalarios(this, rootPaneCheckingEnabled, listaEmpleado);
        listaSalarios.setVisible(true);
        this.listaEmpleado = listaSalarios.listaEmpleado;
    }//GEN-LAST:event_btnTablaSalariosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionEmpleados;
    private javax.swing.JButton btnPromedioSalariosGenero;
    private javax.swing.JButton btnTablaSalarios;
    // End of variables declaration//GEN-END:variables
}
