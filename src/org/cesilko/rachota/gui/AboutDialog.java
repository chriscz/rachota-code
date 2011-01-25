/*
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at http://rachota.sourceforge.net/license.txt.
 * 
 *
 * When distributing Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://rachota.sourceforge.net/license.txt.
 * If applicable, add the following below the CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * The Original Software is Rachota.
 * The Initial Developer of the Original Software is Jiri Kovalsky
 * Portions created by Jiri Kovalsky are Copyright (C) 2006
 * All Rights Reserved.
 *
 * Contributor(s): Jiri Kovalsky
 * Created on November 2, 2007  7:30 PM
 * AboutDialog.java
 */

package org.cesilko.rachota.gui;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import org.cesilko.rachota.core.Translator;

/** About dialog displaying basic information about Rachota.
 * @author Jiri Kovalsky
 */
public class AboutDialog extends javax.swing.JDialog {
    
    /** Creates new form AboutDialog */
    public AboutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lbLogo.setIcon(new ImageIcon(getClass().getResource("/org/cesilko/rachota/gui/images/logo_name_48.png")));
        lbURL.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setLocationRelativeTo(parent);
        pack();
    }
    
    /** Returns font that should be used for all widgets in this component
     * based on the language preferences specified by user.
     * @return Font to be used in this component.
     */
    public java.awt.Font getFont() {
        return Tools.getFont();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbLogo = new javax.swing.JLabel();
        pnInfo = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        lbURL = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbCopyright = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lbLogo, gridBagConstraints);

        pnInfo.setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(getFont());
        lbTitle.setText(Tools.title + " (build " + Tools.build + ")");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnInfo.add(lbTitle, gridBagConstraints);

        lbDescription.setFont(getFont());
        lbDescription.setText(Translator.getTranslation("INFORMATION.PROGRAM"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnInfo.add(lbDescription, gridBagConstraints);

        lbURL.setFont(getFont());
        lbURL.setText("<html><body><a href=\"http://rachota.sourceforge.net\">http://rachota.sourceforge.net</a></body");
        lbURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbURLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnInfo.add(lbURL, gridBagConstraints);

        lbEmail.setFont(getFont());
        lbEmail.setText("jiri.kovalsky@centrum.cz");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 5, 5, 5);
        pnInfo.add(lbEmail, gridBagConstraints);

        lbCopyright.setFont(getFont());
        lbCopyright.setText("2011 ©");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnInfo.add(lbCopyright, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(pnInfo, gridBagConstraints);

        btOK.setFont(getFont());
        btOK.setText(Translator.getTranslation("DATEDIALOG.BT_OK"));
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });
        btOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btOKKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(btOK, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btOKKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            setVisible(false);
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
            setVisible(false);
    }//GEN-LAST:event_btOKKeyPressed

    private void lbURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbURLMouseClicked
        Tools.showURL("http://rachota.sourceforge.net");
    }//GEN-LAST:event_lbURLMouseClicked

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btOKActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        Tools.recordActivity();
    }//GEN-LAST:event_formMouseEntered
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbURL;
    private javax.swing.JPanel pnInfo;
    // End of variables declaration//GEN-END:variables
    
}