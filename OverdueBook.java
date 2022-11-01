/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibraryManager;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah
 */
public class OverdueBook extends javax.swing.JFrame {

    /**
     * Creates new form OverdueBook
     */
    public OverdueBook() {
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

        logoutButton = new javax.swing.JButton();
        newBook = new javax.swing.JButton();
        returnBook = new javax.swing.JButton();
        overdueBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setText("Logout");
        logoutButton.setSelected(true);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, 40));

        newBook.setText("New Book...");
        newBook.setSelected(true);
        newBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookActionPerformed(evt);
            }
        });
        getContentPane().add(newBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        returnBook.setText("Return Book");
        returnBook.setSelected(true);
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });
        getContentPane().add(returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 100, 40));

        overdueBook.setBackground(new java.awt.Color(51, 102, 255));
        overdueBook.setForeground(new java.awt.Color(0, 0, 0));
        overdueBook.setText("Overdue");
        overdueBook.setSelected(true);
        overdueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overdueBookActionPerformed(evt);
            }
        });
        getContentPane().add(overdueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, 40));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog( null, "We're sad to see you go");
        this.setVisible(false);
        new LoginPage().setVisible(true);

    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookActionPerformed
        // TODO add your handling code here:
        NewBook frame = new NewBook();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_newBookActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        // TODO add your handling code here:
        ReturnBook frame = new ReturnBook();
        frame.setVisible(true);
        dispose();

    }//GEN-LAST:event_returnBookActionPerformed

    private void overdueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overdueBookActionPerformed
        // TODO add your handling code here:
        OverdueBook frame = new OverdueBook();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_overdueBookActionPerformed

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
            java.util.logging.Logger.getLogger(OverdueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OverdueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OverdueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OverdueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OverdueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newBook;
    private javax.swing.JButton overdueBook;
    private javax.swing.JButton returnBook;
    // End of variables declaration//GEN-END:variables
}
