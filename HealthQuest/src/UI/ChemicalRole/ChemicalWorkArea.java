/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ChemicalRole;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
import Health.Organization.ChemicalOrganization;
import Health.UserAccount.UserAccount;
import Health.WorkQueue.ChemicalWorkRequest;
import Health.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author vivekhanagoji
 */
public class ChemicalWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ChemicalWorkArea
     *
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ChemicalOrganization chemicalOrganization;
    private Enterprise enterprise;
    private Location network;
    private static Logger log = Logger.getLogger(ChemicalWorkArea.class);
    private static final String CLASS_NAME = ChemicalWorkArea.class.getName();

    public ChemicalWorkArea(JPanel userProcessContainer, UserAccount userAccount, ChemicalOrganization chemicalOrganization, Enterprise enterprise, EcoSystem business, Location network) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.chemicalOrganization = chemicalOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : chemicalOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = ((ChemicalWorkRequest) request);
            row[1] = ((ChemicalWorkRequest) request).getQuantity();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = ((ChemicalWorkRequest) request).getDeliveryTime();

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

        drugSupplierLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestTbl = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 255));
        setLayout(null);

        drugSupplierLbl.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        drugSupplierLbl.setForeground(new java.awt.Color(0, 0, 102));
        drugSupplierLbl.setText("CHEMICAL SUPPLIER WORK AREA ");
        add(drugSupplierLbl);
        drugSupplierLbl.setBounds(200, 110, 806, 53);

        workRequestTbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        workRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Quantity", "Sender", "Receiver", "Status", "Delivery Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestTbl.setRowHeight(30);
        jScrollPane2.setViewportView(workRequestTbl);

        add(jScrollPane2);
        jScrollPane2.setBounds(50, 260, 1360, 200);

        assignBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(0, 0, 102));
        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn);
        assignBtn.setBounds(180, 490, 157, 35);

        processBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        processBtn.setForeground(new java.awt.Color(0, 0, 102));
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        add(processBtn);
        processBtn.setBounds(580, 490, 189, 35);

        refreshBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 0, 102));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn);
        refreshBtn.setBounds(980, 490, 169, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ChemicalRole/chemical.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(300, -10, 590, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

        int selectedRow = workRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

            if (((workRequestTbl.getValueAt(selectedRow, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
        if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

            if (workRequestTbl.getValueAt(selectedRow, 4).equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        if (workRequestTbl.getValueAt(selectedRow, 3) != null) {

            if (!workRequestTbl.getValueAt(selectedRow, 3).equals(userAccount.getUsername())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }

        int flag = 0;
        for (WorkRequest request : chemicalOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Assigned") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                flag = 1;
            }
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int flag1 = 0;
        for (WorkRequest request : chemicalOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                flag1 = 1;
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) workRequestTbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        populateTable();
        log.debug(userAccount+" "+"assigned a task to himself");
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed

        int selectedRow = workRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        ChemicalWorkRequest request = (ChemicalWorkRequest) workRequestTbl.getValueAt(selectedRow, 0);
        if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

            if (((workRequestTbl.getValueAt(selectedRow, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }

        if (workRequestTbl.getValueAt(selectedRow, 4) == null) {
            JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
            return;
        }
        int flag = 0;

        if (workRequestTbl.getValueAt(selectedRow, 4).equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {

            flag = 1;
        }
        if (flag != 1) {
            if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

                if (!(((workRequestTbl.getValueAt(selectedRow, 4).equals("Assigned"))) && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString()))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing");

        ChemicalProcessRequestJpanel processWorkRequestJPanel = new ChemicalProcessRequestJpanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        log.debug(userAccount+" "+"processes the task");
    }//GEN-LAST:event_processBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed

        //populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel drugSupplierLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable workRequestTbl;
    // End of variables declaration//GEN-END:variables
}
