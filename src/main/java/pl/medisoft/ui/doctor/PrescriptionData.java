/*
 * The GNU GPL License 
 * Copyright (c) 2015-2016 IT Students of 5th year 
 * at the University of Maria Curie-Sklodowska in Lublin 
 */
package pl.medisoft.ui.doctor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import pl.medisoft.domain.Patient.Prescription;
import pl.medisoft.infrastructure.doctor.PrescriptionDBManager;
import pl.medisoft.ui.doctor.DoctorFrame;


/**
 *
 * @author michal.zahir
 */
public class PrescriptionData extends javax.swing.JFrame {

    /**
     * Creates new form DoctorData
     */
    Prescription pre;
    
    public PrescriptionData() {
        initComponents();
        UpdateButton.setVisible(false);
        DeleteButton.setVisible(false);
        InsertButton.setVisible(true);
    }

    public PrescriptionData(Prescription d) {
        initComponents();
        this.pre = d;
        PatientNameTextField.setText(d.getPatientName());
        jTextArea1.setText(d.getDescription());
        QuantityTextField.setText(d.getQuantityValue().toString());
        DrIdTextField.setText(d.getDoctorId().toString());
        ValidDateTextField.setText(d.getValidDate().toString());

        //
        UpdateButton.setVisible(true);
        DeleteButton.setVisible(true);
        InsertButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        NameLabel = new javax.swing.JLabel();
        PatientNameTextField = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        DrIdTextField = new javax.swing.JTextField();
        OfficeAddressLabel = new javax.swing.JLabel();
        ValidDateTextField = new javax.swing.JTextField();
        QuantityTextField = new javax.swing.JTextField();
        SpecialtyLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        ExperenieceYearsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        InsertButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        NameLabel.setText("Patient Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(NameLabel, gridBagConstraints);

        PatientNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(PatientNameTextField, gridBagConstraints);

        LastNameLabel.setText("Doctor ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(LastNameLabel, gridBagConstraints);

        DrIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrIdTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(DrIdTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(OfficeAddressLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(ValidDateTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(QuantityTextField, gridBagConstraints);

        SpecialtyLabel.setText("Valid Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(SpecialtyLabel, gridBagConstraints);

        TitleLabel.setText("Quantity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(TitleLabel, gridBagConstraints);

        ExperenieceYearsLabel.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(ExperenieceYearsLabel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Prescription Info");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(jSeparator2, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel1.add(InsertButton, gridBagConstraints);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel1.add(UpdateButton, gridBagConstraints);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel1.add(DeleteButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMargin(new java.awt.Insets(7, 7, 7, 7));
        jTextArea1.setMinimumSize(new java.awt.Dimension(10, 16));
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.5;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(2, 35, 2, 35);
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameTextFieldActionPerformed

    private void DrIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrIdTextFieldActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed

        Calendar cal = Calendar.getInstance();
        Prescription p = new Prescription();
        Number number = 12;

        BigDecimal big = new BigDecimal(number.toString());
        //p.setId(big);
        p.setPatientName(PatientNameTextField.getText());
        p.setDescription(jTextArea1.getText());
        String x = QuantityTextField.getText();
        String y = DrIdTextField.getText();
        p.setQuantityValue(new BigInteger(x));
        p.setDateOfIssue(cal.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date date = null;
        try {
            date = formatter.parse(ValidDateTextField.getText());
        } catch (ParseException ex) {
            Logger.getLogger(PrescriptionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setValidDate(date);
        p.setDoctorId(new BigInteger(y));
        
        //PrescriptionDBManager dbm = new PrescriptionDBManager();
//        Doctor d  = new Doctor();
//        //d.setId(8L);
//        d.PatientNameTextFieldextField.getText());
//        d.setLastName(DrIdTextField.getText());
//        d.setSpecialty(ValidDateTextField.getText());
//        d.setTitle(QuantityTextField.getText());
//        d.setEmail(EmailTextField.getText());
//        //d.setDateOfBirth(jXDatePicker1.getDate());
//        String x = OfficePhoneTextField.getText();
//        String y = ExperienceYearsTextField.getText();
//        d.setOfficeAddress(OfficeAddressTextField.getText());
//        d.setOfficePhone(new BigInteger(x));
//        d.setExperienceYears(new Short(y));
//        d.setPhoneNumber(PhonNumberTextField.getText());
//        DBManager dbm = new DBManager();
        DoctorFrame.dbm.insert(p);
        //dbm.close();
        setVisible(false);
        dispose();
        DoctorFrame Df = new DoctorFrame(this);
        Df.setVisible(true);
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        Prescription p = this.pre;
        Calendar cal = Calendar.getInstance();
        Number number = 12;

        BigDecimal big = new BigDecimal(number.toString());
        //p.setId(big);
        p.setPatientName(PatientNameTextField.getText());
        p.setDescription(jTextArea1.getText());
        String x = QuantityTextField.getText();
        String y = DrIdTextField.getText();
        p.setQuantityValue(new BigInteger(x));
        p.setDateOfIssue(cal.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date date = null;
        try {
            date = formatter.parse(ValidDateTextField.getText());
        } catch (ParseException ex) {
            Logger.getLogger(PrescriptionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setValidDate(date);
        p.setDoctorId(new BigInteger(y));
       // PrescriptionDBManager dbm = new PrescriptionDBManager();
        DoctorFrame.dbm.update(p);
        setVisible(false);
        dispose();
        DoctorFrame Df = new DoctorFrame(this);
        Df.setVisible(true);
        //dbm.close();

    }//GEN-LAST:event_UpdateButtonActionPerformed
  
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        //PrescriptionDBManager dbm = new PrescriptionDBManager();
        DoctorFrame.dbm.delete(this.pre);
        //dbm.close();
        setVisible(false);
        dispose();
        DoctorFrame Df = new DoctorFrame(this);
        Df.setVisible(true);
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PrescriptionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescriptionData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField DrIdTextField;
    private javax.swing.JLabel ExperenieceYearsLabel;
    private javax.swing.JButton InsertButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel OfficeAddressLabel;
    private javax.swing.JTextField PatientNameTextField;
    private javax.swing.JTextField QuantityTextField;
    private javax.swing.JLabel SpecialtyLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField ValidDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
