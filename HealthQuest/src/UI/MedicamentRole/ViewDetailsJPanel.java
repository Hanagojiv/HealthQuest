/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MedicamentRole;


import Health.Enterprise.Enterprise;
import Health.MedicalInventory.MedicalInventory;
import Health.MedicalInventory.MedicalInventoryList;
import Health.Organization.Organization;
import Health.Organization.MedicamentOrganization;
import Health.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author vivekhanagoji
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsJPanel
     */
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private MedicalInventoryList mil;
    private Organization org;
    private MedicamentOrganization pharmorg;
    private MedicalInventory mi;
    private static Logger log = Logger.getLogger(ViewDetailsJPanel.class);
    private static final String CLASS_NAME = ViewDetailsJPanel.class.getName();

    public ViewDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, MedicalInventory mi) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.pharmorg = pharmorg;
        this.mi = mi;

        serialNumTxtField.setText(String.valueOf(mi.getSerialNumber()));
        availQuantityTxtField.setText(String.valueOf(mi.getAvailQuantity()));
        BioTechnologyNameTxtField.setText(mi.getMedicineName());
        saveButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialNumLbl = new javax.swing.JLabel();
        serialNumTxtField = new javax.swing.JTextField();
        drugLbl = new javax.swing.JLabel();
        BioTechnologyNameTxtField = new javax.swing.JTextField();
        availLbl = new javax.swing.JLabel();
        availQuantityTxtField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        medicineLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setLayout(null);

        serialNumLbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        serialNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        serialNumLbl.setText("SERIAL NUMBER:");
        add(serialNumLbl);
        serialNumLbl.setBounds(288, 281, 202, 30);

        serialNumTxtField.setEditable(false);
        serialNumTxtField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        serialNumTxtField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(serialNumTxtField);
        serialNumTxtField.setBounds(489, 283, 207, 33);

        drugLbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        drugLbl.setForeground(new java.awt.Color(255, 255, 255));
        drugLbl.setText("Medicine Name:");
        add(drugLbl);
        drugLbl.setBounds(295, 379, 166, 30);

        BioTechnologyNameTxtField.setEditable(false);
        BioTechnologyNameTxtField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        BioTechnologyNameTxtField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(BioTechnologyNameTxtField);
        BioTechnologyNameTxtField.setBounds(489, 383, 207, 33);

        availLbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        availLbl.setForeground(new java.awt.Color(255, 255, 255));
        availLbl.setText("Availability:");
        add(availLbl);
        availLbl.setBounds(338, 476, 124, 30);

        availQuantityTxtField.setEditable(false);
        availQuantityTxtField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        availQuantityTxtField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        availQuantityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availQuantityTxtFieldActionPerformed(evt);
            }
        });
        add(availQuantityTxtField);
        availQuantityTxtField.setBounds(489, 479, 207, 33);

        updateButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 102));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(524, 584, 136, 35);

        saveButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 0, 102));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(349, 584, 136, 35);

        backButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 102));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(169, 584, 136, 35);

        medicineLbl.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        medicineLbl.setForeground(new java.awt.Color(0, 0, 102));
        medicineLbl.setText("View Medicine Details");
        add(medicineLbl);
        medicineLbl.setBounds(320, 150, 443, 56);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BioTechnologySupplier/pills.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(140, 240, 720, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void availQuantityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availQuantityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availQuantityTxtFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        BioTechnologyNameTxtField.setEditable(true);
        serialNumTxtField.setEditable(true);
        availQuantityTxtField.setEditable(true);
        updateButton.setEnabled(false);
        saveButton.setEnabled(true);

    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        if(BioTechnologyNameTxtField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"please enter a valid medicine name");
            return;
        }
        mi.setMedicineName(BioTechnologyNameTxtField.getText());
        try{
        int availableQuantity = Integer.parseInt(availQuantityTxtField.getText());
          mi.setAvailQuantity(availableQuantity);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
      try
      {
        int serialNumber = Integer.parseInt(serialNumTxtField.getText());
        mi.setSerialNumber(serialNumber);
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null, "serial number must be integer!");
          return;
      }
        
        BioTechnologyNameTxtField.setEditable(false);
        serialNumTxtField.setEditable(false);
        availQuantityTxtField.setEditable(false);
        saveButton.setEnabled(false);
        updateButton.setEnabled(true);
        log.debug(userAccount+" "+" updated the medicine details");

        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicamentWorkArea me = (MedicamentWorkArea) component;
        me.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BioTechnologyNameTxtField;
    private javax.swing.JLabel availLbl;
    private javax.swing.JTextField availQuantityTxtField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel drugLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel medicineLbl;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel serialNumLbl;
    private javax.swing.JTextField serialNumTxtField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
