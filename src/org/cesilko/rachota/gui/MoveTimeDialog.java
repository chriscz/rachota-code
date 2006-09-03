/*
 * MoveTimeDialog.java
 *
 * Created on June 9, 2005, 9:05 AM
 */

package org.cesilko.rachota.gui;

import java.util.Date;
import java.util.Iterator;
import org.cesilko.rachota.core.Day;
import org.cesilko.rachota.core.Plan;
import org.cesilko.rachota.core.Settings;
import org.cesilko.rachota.core.Task;
import org.cesilko.rachota.core.Translator;

/** Dialog for user friendly transfer of time from one task to another one.
 * @author Jiri Kovalsky
 */
public class MoveTimeDialog extends javax.swing.JDialog {
    
    /** Creates new dialog for moving time between two tasks.
     * @param task Source task whose time will be transferred to another task.
     */
    public MoveTimeDialog(java.awt.Frame parent, Task task) {
	this.task = task;
	initComponents();
	setLocationRelativeTo(parent);
	Day today = Plan.getDefault().getDay(new Date());
	Iterator iterator = today.getTasks().iterator();
	while (iterator.hasNext()) {
	    task = (Task) iterator.next();
	    if (task.getState() == Task.STATE_DONE) continue;
	    if (task.equals(this.task)) continue;
	    cmbSelectTask.addItem(task);
	}
        pack();
    }
    
    /** Returns font that should be used for all widgets in this component
     * based on the language preferences specified by user.
     * @return Font to be used in this component.
     */
    public java.awt.Font getFont() {
        return new java.awt.Font((String) Settings.getDefault().getSetting("fontName"), java.awt.Font.PLAIN, Integer.parseInt((String) Settings.getDefault().getSetting("fontSize")));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbSelectTask = new javax.swing.JLabel();
        cmbSelectTask = new javax.swing.JComboBox();
        lbSelectTime = new javax.swing.JLabel();
        spHours = new javax.swing.JSpinner();
        lbColumn1 = new javax.swing.JLabel();
        spMinutes = new javax.swing.JSpinner();
        lbColumn2 = new javax.swing.JLabel();
        spSeconds = new javax.swing.JSpinner();
        pnButtons = new javax.swing.JPanel();
        btOK = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Translator.getTranslation("MOVETIMEDIALOG.TITLE"));
        lbSelectTask.setDisplayedMnemonic(Translator.getMnemonic("MOVETIMEDIALOG.SELECT_TASK"));
        lbSelectTask.setFont(getFont());
        lbSelectTask.setLabelFor(cmbSelectTask);
        lbSelectTask.setText(Translator.getTranslation("MOVETIMEDIALOG.SELECT_TASK"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lbSelectTask, gridBagConstraints);

        cmbSelectTask.setFont(getFont());
        cmbSelectTask.setToolTipText(Translator.getTranslation("MOVETIMEDIALOG.SELECT_TASK_TOOLTIP"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cmbSelectTask, gridBagConstraints);

        lbSelectTime.setDisplayedMnemonic(Translator.getMnemonic("MOVETIMEDIALOG.SELECT_TIME"));
        lbSelectTime.setFont(getFont());
        lbSelectTime.setLabelFor(spHours);
        lbSelectTime.setText(Translator.getTranslation("MOVETIMEDIALOG.SELECT_TIME"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lbSelectTime, gridBagConstraints);

        spHours.setToolTipText(Translator.getTranslation("MOVETIMEDIALOG.HOURS_TOOLTIP"));
        spHours.setPreferredSize(new java.awt.Dimension(50, 20));
        spHours.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spHoursStateChanged(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(spHours, gridBagConstraints);

        lbColumn1.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        getContentPane().add(lbColumn1, gridBagConstraints);

        spMinutes.setToolTipText(Translator.getTranslation("MOVETIMEDIALOG.MINUTES_TOOLTIP"));
        spMinutes.setPreferredSize(new java.awt.Dimension(50, 20));
        spMinutes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spMinutesStateChanged(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(spMinutes, gridBagConstraints);

        lbColumn2.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        getContentPane().add(lbColumn2, gridBagConstraints);

        spSeconds.setToolTipText(Translator.getTranslation("MOVETIMEDIALOG.SECONDS_TOOLTIP"));
        spSeconds.setPreferredSize(new java.awt.Dimension(50, 20));
        spSeconds.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spSecondsStateChanged(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(spSeconds, gridBagConstraints);

        btOK.setFont(getFont());
        btOK.setMnemonic(Translator.getMnemonic("MOVETIMEDIALOG.BT_OK"));
        btOK.setText(Translator.getTranslation("MOVETIMEDIALOG.BT_OK"));
        btOK.setToolTipText(Translator.getTranslation("MOVETIMEDIALOG.BT_OK_TOOLTIP"));
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        pnButtons.add(btOK);

        btCancel.setFont(getFont());
        btCancel.setMnemonic(Translator.getMnemonic("MOVETIMEDIALOG.BT_CANCEL"));
        btCancel.setText(Translator.getTranslation("MOVETIMEDIALOG.BT_CANCEL"));
        btCancel.setToolTipText(Translator.getTranslation("MOVETIMEDIALOG.BT_CANCEL_TOOLTIP"));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        pnButtons.add(btCancel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        getContentPane().add(pnButtons, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /** Method called when seconds were be changed.
     * @param evt Event that invoked this method call.
     */
    private void spSecondsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spSecondsStateChanged
	Integer seconds = (Integer) spSeconds.getValue();
	int value = seconds.intValue();
	if ((value < 0) || (value > 59)) spSeconds.setValue(previousSeconds);
	else checkDuration();
    }//GEN-LAST:event_spSecondsStateChanged
    
    /** Method called when minutes were be changed.
     * @param evt Event that invoked this method call.
     */
    private void spMinutesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spMinutesStateChanged
	Integer minutes = (Integer) spMinutes.getValue();
	int value = minutes.intValue();
	if ((value < 0) || (value > 59)) spMinutes.setValue(previousMinutes);
	else checkDuration();
    }//GEN-LAST:event_spMinutesStateChanged
    
    /** Method called when hours were be changed.
     * @param evt Event that invoked this method call.
     */
    private void spHoursStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spHoursStateChanged
	Integer hours = (Integer) spHours.getValue();
	int value = hours.intValue();
	if ((value < 0) || (value > 23)) spHours.setValue(previousHours);
	else checkDuration();
    }//GEN-LAST:event_spHoursStateChanged
    
    /** Method called when cancel button was pressed.
     * @param evt Event that invoked this method call.
     */
    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
	setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed
    
    /** Method called when ok button was pressed.
     * @param evt Event that invoked this method call.
     */
    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
	setVisible(false);
	Task targetTask = (Task) cmbSelectTask.getSelectedItem();
	long duration = previousHours.intValue()*1000*60*60 + previousMinutes.intValue()*1000*60 + previousSeconds.intValue()*1000;
	targetTask.addDuration(duration);
	targetTask.setState(Task.STATE_STARTED);
	task.addDuration(-duration);
        firePropertyChange("time_changed", null, null);
    }//GEN-LAST:event_btOKActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOK;
    private javax.swing.JComboBox cmbSelectTask;
    private javax.swing.JLabel lbColumn1;
    private javax.swing.JLabel lbColumn2;
    private javax.swing.JLabel lbSelectTask;
    private javax.swing.JLabel lbSelectTime;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JSpinner spHours;
    private javax.swing.JSpinner spMinutes;
    private javax.swing.JSpinner spSeconds;
    // End of variables declaration//GEN-END:variables
    /** Task whose time should be transferred to another task. */
    private Task task;
    /** Last correct value of hours specified by user. */
    private Integer previousHours = new Integer(0);
    /** Last correct value of minutes specified by user. */
    private Integer previousMinutes = new Integer(0);
    /** Last correct value of seconds specified by user. */
    private Integer previousSeconds = new Integer(0);
    
    /** Check whether time required for the transfer is not greater than
     * duration of the source task.
     */
    private void checkDuration() {
	Integer seconds = (Integer) spSeconds.getValue();
	Integer minutes = (Integer) spMinutes.getValue();
	Integer hours = (Integer) spHours.getValue();
	long duration = seconds.intValue()*1000 + minutes.intValue()*1000*60 + hours.intValue()*1000*60*60;
	if (duration > task.getDuration()) {
	    spSeconds.setValue(previousSeconds);
	    spMinutes.setValue(previousMinutes);
	    spHours.setValue(previousHours);
	} else {
	    previousSeconds = (Integer) spSeconds.getValue();
	    previousMinutes = (Integer) spMinutes.getValue();
	    previousHours = (Integer) spHours.getValue();
	}
    }
}