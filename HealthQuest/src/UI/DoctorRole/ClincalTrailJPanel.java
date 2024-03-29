/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Health.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author vivekhanagoji
 */
public class ClincalTrailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClincalTrailJPanel
     */
    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private static Logger log = Logger.getLogger(ClincalTrailJPanel.class);
    private static final String CLASS_NAME = ClincalTrailJPanel.class.getName();
    public ClincalTrailJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        patientTxtField.setText(request.getPatientName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientLbl = new javax.swing.JLabel();
        patientTxtField = new javax.swing.JTextField();
        LabTestLbl = new javax.swing.JLabel();
        sexcomboBox = new javax.swing.JComboBox<>();
        patientLbl1 = new javax.swing.JLabel();
        statusUpdate = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        patientLbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        patientLbl.setForeground(new java.awt.Color(0, 0, 102));
        patientLbl.setText("Patient Name :");
        add(patientLbl);
        patientLbl.setBounds(326, 226, 180, 30);

        patientTxtField.setEditable(false);
        add(patientTxtField);
        patientTxtField.setBounds(536, 226, 200, 30);

        LabTestLbl.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        LabTestLbl.setForeground(new java.awt.Color(0, 0, 102));
        LabTestLbl.setText(" CLINICAL TRAIL STATUS");
        add(LabTestLbl);
        LabTestLbl.setBounds(221, 34, 650, 52);

        sexcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please select--", "Success", "Failure" }));
        sexcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexcomboBoxActionPerformed(evt);
            }
        });
        add(sexcomboBox);
        sexcomboBox.setBounds(536, 311, 200, 23);

        patientLbl1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        patientLbl1.setForeground(new java.awt.Color(0, 0, 102));
        patientLbl1.setText("Status");
        add(patientLbl1);
        patientLbl1.setBounds(326, 303, 180, 30);

        statusUpdate.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        statusUpdate.setForeground(new java.awt.Color(0, 0, 102));
        statusUpdate.setText("SUBMIT");
        statusUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusUpdateActionPerformed(evt);
            }
        });
        add(statusUpdate);
        statusUpdate.setBounds(601, 405, 135, 41);

        backBtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(221, 401, 170, 36);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/doc14.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void statusUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusUpdateActionPerformed
        // TODO add your handling code here:
        
         
        String clinicalStatus = sexcomboBox.getSelectedItem().toString();
        
        if((clinicalStatus == "") || (!clinicalStatus.equalsIgnoreCase("--Please select--"))){
            
            request.getPatient().setClinicalStatus(clinicalStatus);
            log.debug("updated patient status to"+" "+request.getPatient().getClinicalStatus());
            JOptionPane.showMessageDialog(null, "Status has been updated successfully");
    }
        
        else{
            JOptionPane.showMessageDialog(null, "Please select clincal Status");
            log.error("clinical status has not been selected");
        }
    }//GEN-LAST:event_statusUpdateActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorRequestJpanel dwjp = (DoctorRequestJpanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sexcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexcomboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabTestLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel patientLbl;
    private javax.swing.JLabel patientLbl1;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JComboBox<String> sexcomboBox;
    private javax.swing.JButton statusUpdate;
    // End of variables declaration//GEN-END:variables
}
