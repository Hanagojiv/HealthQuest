/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BioTechnologySupplier;

import UI.BioTechnologySupplier.*;
import Health.ChemicalInventory.ChemicalCompound;
import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.MedicalInventory.MedicalInventory;
import Health.Location.Location;
import Health.Organization.BioTechnologyOrganization;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import Health.WorkQueue.ChemicalWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;


/**
 *
 * @author vivekhanagoji
 */
public class ViewChemicalRequestsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private BioTechnologyOrganization BioTechnologyOrganization ;
    private Enterprise enterprise;
    private Location network;
    private static Logger log = Logger.getLogger(ViewChemicalRequestsJPanel.class);
    private static final String CLASS_NAME = ViewChemicalRequestsJPanel.class.getName();

    /**
     * Creates new form ViewChemicalRequestsJPanel
     */
    public ViewChemicalRequestsJPanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise, BioTechnologyOrganization BioTechnologyOrganization,Location network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.BioTechnologyOrganization = BioTechnologyOrganization;
        this.enterprise = enterprise;
        this.network = network;
        reorderTable();
    }
   
    public void reorderTable(){
        int rowCount = reorderTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)reorderTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
      for(ChemicalCompound mi : BioTechnologyOrganization.getChemList()){
            Object row[] = new Object[6];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2]= mi.getAvailQuantity();
            row[3]=mi.getRequiredQuantity();
            row[4]= mi.getReorderStatus();
            //row[5]=mi.getReorderStatus();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        reorderTable = new javax.swing.JTable();
        addMedicineButton = new javax.swing.JButton();
        viewRequestsButton = new javax.swing.JButton();
        viewDetailsButton1 = new javax.swing.JButton();
        statusCheckButton = new javax.swing.JButton();
        serialNumLabel = new javax.swing.JLabel();
        serialNumberTextField = new javax.swing.JTextField();
        medicineNameLabel = new javax.swing.JLabel();
        chemicalNameTextField = new javax.swing.JTextField();
        availQuantityLabel = new javax.swing.JLabel();
        availQuantityTextField = new javax.swing.JTextField();
        reqQuantityLabel = new javax.swing.JLabel();
        reqQuantityTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        reorderTable.setBorder(new javax.swing.border.MatteBorder(null));
        reorderTable.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        reorderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHEMICAL NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reorderTable.setRowHeight(30);
        jScrollPane1.setViewportView(reorderTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 149, 950, 238);

        addMedicineButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        addMedicineButton.setForeground(new java.awt.Color(0, 0, 102));
        addMedicineButton.setText("ADD CHEMICAL");
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });
        add(addMedicineButton);
        addMedicineButton.setBounds(394, 616, 251, 35);

        viewRequestsButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        viewRequestsButton.setText("VIEW REQUESTS");
        viewRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsButtonActionPerformed(evt);
            }
        });
        add(viewRequestsButton);
        viewRequestsButton.setBounds(820, 410, 180, 27);

        viewDetailsButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        viewDetailsButton1.setText("VIEW DETAILS");
        viewDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsButton1ActionPerformed(evt);
            }
        });
        add(viewDetailsButton1);
        viewDetailsButton1.setBounds(820, 450, 180, 27);

        statusCheckButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        statusCheckButton.setText("Order");
        statusCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCheckButtonActionPerformed(evt);
            }
        });
        add(statusCheckButton);
        statusCheckButton.setBounds(810, 490, 190, 27);

        serialNumLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        serialNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        serialNumLabel.setText("SERIAL NUMBER: ");
        add(serialNumLabel);
        serialNumLabel.setBounds(220, 409, 208, 20);

        serialNumberTextField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(serialNumberTextField);
        serialNumberTextField.setBounds(520, 399, 270, 31);

        medicineNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        medicineNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        medicineNameLabel.setText("CHEMICAL NAME: ");
        add(medicineNameLabel);
        medicineNameLabel.setBounds(204, 447, 218, 29);

        chemicalNameTextField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(chemicalNameTextField);
        chemicalNameTextField.setBounds(520, 445, 270, 31);

        availQuantityLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        availQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        availQuantityLabel.setText("AVAILABLE QUANTITY:");
        add(availQuantityLabel);
        availQuantityLabel.setBounds(145, 492, 282, 20);

        availQuantityTextField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(availQuantityTextField);
        availQuantityTextField.setBounds(520, 492, 270, 31);

        reqQuantityLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        reqQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        reqQuantityLabel.setText("REQUIRED QUANTITY:");
        add(reqQuantityLabel);
        reqQuantityLabel.setBounds(157, 544, 280, 20);

        reqQuantityTextField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        reqQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqQuantityTextFieldActionPerformed(evt);
            }
        });
        add(reqQuantityTextField);
        reqQuantityTextField.setBounds(520, 539, 270, 31);

        backBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(100, 620, 94, 35);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chemical Request");
        add(jLabel1);
        jLabel1.setBounds(270, 20, 357, 53);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BioTechnologySupplier/chemical.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(730, 440, 260, 350);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BioTechnologySupplier/chemical101.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(-130, -20, 1370, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        // TODO add your handling code here:

        ChemicalCompound m=new ChemicalCompound();
        String name=chemicalNameTextField.getText().trim();      
        if(name.isEmpty())
        {
         JOptionPane.showMessageDialog(null,"Chemical Name is empty");
            return;   
        }
        m.setChemicalName(chemicalNameTextField.getText());
        try
        {
        int availableQuantity= Integer.parseInt(availQuantityTextField.getText());
        m.setAvailQuantity(availableQuantity);
        }
        catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null,"available quantity must be a integer");
            return;   
        }
        try
        {
        int serialNumber= Integer.parseInt(serialNumberTextField.getText());
        m.setSerialNumber(serialNumber);
        }
         catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null,"Serial number  must be a integer");
            return;   
        }
        try{
        int requiredQuantity= Integer.parseInt(reqQuantityTextField.getText());
        m.setRequiredQuantity(requiredQuantity);
        }
         catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null,"Required quantity must be integer!");
            return;
        }
//        ArrayList<String> chemicalCheck = new ArrayList<>();
//        for(ChemicalCompound mi : BioTechnologyOrganization.getChemList())
//        {
//            chemicalCheck.add(mi.getChemicalName().toLowerCase());
//        }
//        if(chemicalCheck.contains(name.toLowerCase()))
//        {
//            JOptionPane.showMessageDialog(null, "chemical name already existed please update the quantity by clicking on view details");
//            return;
//        }
        BioTechnologyOrganization.addChemical(m);
        m.setReorderStatus("N");

        DefaultTableModel dtm =(DefaultTableModel) reorderTable.getModel();

        dtm.setRowCount(0);
        for(ChemicalCompound mi : BioTechnologyOrganization.getChemList()){
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2]= mi.getAvailQuantity();
            row[3]=mi.getRequiredQuantity();
            row[4]= mi.getReorderStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Chemical Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        serialNumberTextField.setText("");
        chemicalNameTextField.setText("");
        availQuantityTextField.setText("");
        reqQuantityTextField.setText("");
        log.debug(userAccount+" "+"added chemical"+name);
        
    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void viewRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       userProcessContainer.add("ViewRequestJPanel", new ViewRequestsJPanel( userProcessContainer, userAccount, enterprise, BioTechnologyOrganization));
        layout.next(userProcessContainer);
        log.debug("entering view chemical requests page");

    }//GEN-LAST:event_viewRequestsButtonActionPerformed

    private void viewDetailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButton1ActionPerformed
        // TODO add your handling code here:
        int row = reorderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ChemicalCompound mi = (ChemicalCompound)reorderTable.getValueAt(row, 0);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateEntryJPanel", new ViewChemicalDetailsJPanel(userProcessContainer, userAccount, enterprise,mi));
        layout.next(userProcessContainer);
        log.debug(userAccount+" "+"entering view chemical details page");
    }//GEN-LAST:event_viewDetailsButton1ActionPerformed

    private void statusCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCheckButtonActionPerformed
        // TODO add your handling code here:
        int i=0;
        for(ChemicalCompound mi : BioTechnologyOrganization.getChemList()){
            i++;
            
        }
        if(i<=0)
        {
            JOptionPane.showMessageDialog(null,"No chemicals are present for invetory check  ");
            return;
        }
      for(ChemicalCompound mi : BioTechnologyOrganization.getChemList()){

            if(mi.getAvailQuantity()<=mi.getRequiredQuantity()){
                if(!mi.getReorderStatus().equals("Y")){
                    ChemicalWorkRequest request=new ChemicalWorkRequest();

                    mi.setReorderStatus("Y");
                    request.setChemicalName(mi.getChemicalName());
                    request.setQuantity(mi.getRequiredQuantity());
                    request.setSender(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList() ){
                        System.out.println("***** Organization Name:" +enterprise.getName());
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            System.out.println("***** Organization Name:" +organization.getName());
                            if(organization.getName().equals("Chemical Organization")){
                                System.out.println("True");

                                System.out.println("***** organization Name"+organization.getName());

                                organization.getWorkQueue().getWorkRequestList().add(request);
                                log.debug("chemical request has been sent to chemical organization");
                            }
                        }

                    }

                }

            }
        } 
        JOptionPane.showMessageDialog(null, "Inventory status checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);
       reorderTable();
    }//GEN-LAST:event_statusCheckButtonActionPerformed

    private void reqQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqQuantityTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BioTechnologySupplierWorkArea dwjp = (BioTechnologySupplierWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JLabel availQuantityLabel;
    private javax.swing.JTextField availQuantityTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField chemicalNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineNameLabel;
    private javax.swing.JTable reorderTable;
    private javax.swing.JLabel reqQuantityLabel;
    private javax.swing.JTextField reqQuantityTextField;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JButton statusCheckButton;
    private javax.swing.JButton viewDetailsButton1;
    private javax.swing.JButton viewRequestsButton;
    // End of variables declaration//GEN-END:variables
}
