/*
 * exdispTest.java
 *
 * Created on January 2, 2007, 10:42 AM
 */

package com.blazartech.util.gui.exception;

import javax.swing.JOptionPane;

/**
 *
 * @author  aar1069
 */
public class exdispTest extends javax.swing.JFrame {
    
    /** Creates new form exdispTest */
    public exdispTest() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        runTest();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void functionLevel1() {
        try {
            functionLevel2();
        } catch (Exception e) {
            throw new RuntimeException("functionLevel1 failed, with a suuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuper long message", e);
        }
    }
    
    private void functionLevel2() {
        try {
            functionLevel3();
        } catch (Exception e) {
            throw new RuntimeException("functionLevel2 failed", e);
        }
    }
    
    private void functionLevel3() {
        throw new RuntimeException("functionLevel failed, and this is a reallllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllly long message");
    }
    
    private void runTest() {
        try {
            functionLevel1();
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionDisplayPanel p = new ExceptionDisplayPanel();
            p.setException(e);
            JOptionPane.showMessageDialog(this, p, "Exception", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exdispTest().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
    
}
