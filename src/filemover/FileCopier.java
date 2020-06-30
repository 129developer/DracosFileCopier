/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemover;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.GraphiteGlassSkin;

/**
 *
 * @author Admin
 */
public class FileCopier extends javax.swing.JFrame {

    /**
     * Creates new form FileCopier
     */
    public FileCopier() {
        initComponents();
        setTitle("Dracos File Copier");
        try {
//            ImageIcon img = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\FileMover\\dist\\draco.png");
//            this.setIconImage(img.getImage());
            SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.GraphiteGlassSkin");
            JFrame.setDefaultLookAndFeelDecorated(true);
//            UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.BusinessBlueSteelSkin");
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        
//            UIManager.setLookAndFeel();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(FileCopier.class.getName()).log(Level.SEVERE, null, ex);
        }
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }
        };

        class JTextFieldPrintStream extends PrintStream {

            public JTextFieldPrintStream(OutputStream out) {
                super(out);
            }

            @Override
            public void println(String x) {
                txa_files1.append("\n" + x);
            }

            @Override
            public void print(String x) {
                txa_files1.append(x);
            }

        };
        JTextFieldPrintStream print = new JTextFieldPrintStream(out);
        System.setOut(print);
        System.setErr(print);
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
        txt_from = new javax.swing.JTextField();
        txt_to = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_files = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btn_browseFrm = new javax.swing.JButton();
        btn_browseTo = new javax.swing.JButton();
        btn_copy = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_files1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("From");

        jLabel2.setText("To");

        txa_files.setColumns(20);
        txa_files.setRows(5);
        jScrollPane1.setViewportView(txa_files);

        jLabel3.setText("Files");

        btn_browseFrm.setText("Browse");
        btn_browseFrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseFrmActionPerformed(evt);
            }
        });

        btn_browseTo.setText("Browse");
        btn_browseTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseToActionPerformed(evt);
            }
        });

        btn_copy.setText("Copy");
        btn_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copyActionPerformed(evt);
            }
        });

        txa_files1.setEditable(false);
        txa_files1.setColumns(20);
        txa_files1.setRows(5);
        jScrollPane2.setViewportView(txa_files1);

        jLabel4.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_from, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(txt_to))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_copy)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_browseTo)
                                    .addComponent(btn_browseFrm))
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_browseFrm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_browseTo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(btn_copy)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copyActionPerformed
        String from = txt_from.getText();
        String to = txt_to.getText();
        String files = txa_files.getText();
        FileMover.copyFiles(from, to, files.split("\n"));
    }//GEN-LAST:event_btn_copyActionPerformed

    private void btn_browseFrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseFrmActionPerformed
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        Integer opt = j.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File yourFolder = j.getSelectedFile();
            txt_from.setText(yourFolder.getAbsolutePath()+File.separator);
        }


    }//GEN-LAST:event_btn_browseFrmActionPerformed

    private void btn_browseToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseToActionPerformed
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        Integer opt = j.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File yourFolder = j.getSelectedFile();
            txt_to.setText(yourFolder.getAbsolutePath()+File.separator);
        }
    }//GEN-LAST:event_btn_browseToActionPerformed

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
            java.util.logging.Logger.getLogger(FileCopier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileCopier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileCopier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileCopier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileCopier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_browseFrm;
    private javax.swing.JButton btn_browseTo;
    private javax.swing.JButton btn_copy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txa_files;
    private javax.swing.JTextArea txa_files1;
    private javax.swing.JTextField txt_from;
    private javax.swing.JTextField txt_to;
    // End of variables declaration//GEN-END:variables
}