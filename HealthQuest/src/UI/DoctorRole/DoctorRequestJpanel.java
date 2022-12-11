/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Health.Doctor.Patient;
import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
import Health.Organization.DoctorOrganization;
import Health.Organization.LabOrganization;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import Health.WorkQueue.LabTestWorkRequest;
import Health.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author vivekhanagoji
 */
public class DoctorRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRequestJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private DoctorOrganization organization;
    private Enterprise enterprise;

    private Location network;
    private EcoSystem system;
    private Enterprise.EnterpriseType enterpriseType;
    private static Logger log = Logger.getLogger(DoctorRequestJpanel.class);
    private static final String CLASS_NAME = DoctorRequestJpanel.class.getName();

    public DoctorRequestJpanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem system, Location network) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        valueLbl.setText(enterprise.getName());
        populateRequestTable();

    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) doctorRequestTbl.getModel();

        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request instanceof LabTestWorkRequest) {
                Object[] row = new Object[8];
                row[0] = ((LabTestWorkRequest) request);
                row[1] = ((LabTestWorkRequest) request).getPatient().getAge();
                row[2] = ((LabTestWorkRequest) request).getPatient().getSex();
                row[3] = request.getMessage();

                row[4] = request.getReceiver();
                row[5] = request.getStatus();
                String result = ((LabTestWorkRequest) request).getPatient().getNewBioTechnology();
                if(request.getReceiver()==null||request.getReceiver().equals("Processing"))
                {
                     row[6]=null;
                }else
                {
                row[6] = result == null ? "N/A(BioTechnology Exists)" : result;
                }
                row[7] = ((LabTestWorkRequest) request).getPatient().getClinicalStatus();

                model.addRow(row);
            }
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

        resultsLbl = new javax.swing.JLabel();
        enterpriseLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        refreshbtn = new javax.swing.JButton();
        requestTestBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorRequestTbl = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        sexLbl = new javax.swing.JLabel();
        testTxtField = new javax.swing.JTextField();
        diagnosisLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        viewResultsbtn = new javax.swing.JButton();
        clincalTrail = new javax.swing.JButton();
        sexcomboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultsLbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        resultsLbl.setForeground(new java.awt.Color(0, 0, 102));
        resultsLbl.setText("Lab Results ");
        add(resultsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 150, 60));

        enterpriseLbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        enterpriseLbl.setForeground(new java.awt.Color(0, 0, 102));
        enterpriseLbl.setText("EnterPrise :");
        add(enterpriseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        valueLbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        valueLbl.setForeground(new java.awt.Color(0, 0, 102));
        valueLbl.setText("<value>");
        add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 40));

        refreshbtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(0, 0, 102));
        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });
        add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 120, 40));

        requestTestBtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        requestTestBtn.setForeground(new java.awt.Color(0, 0, 102));
        requestTestBtn.setText("Request Test");
        requestTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestBtnActionPerformed(evt);
            }
        });
        add(requestTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, 40));

        doctorRequestTbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        doctorRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Receiver", "Status", "New Drug", "Clinical Trail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorRequestTbl.setRowHeight(25);
        jScrollPane1.setViewportView(doctorRequestTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 970, 170));

        backJButton.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 0, 102));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        nameLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 0, 102));
        nameLbl.setText("Name:");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 287, -1));

        sexLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        sexLbl.setForeground(new java.awt.Color(0, 0, 102));
        sexLbl.setText("Sex:");
        add(sexLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));
        add(testTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 287, 60));

        diagnosisLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        diagnosisLbl.setForeground(new java.awt.Color(0, 0, 102));
        diagnosisLbl.setText("Test Required");
        add(diagnosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        ageLbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(0, 0, 102));
        ageLbl.setText("Age:");
        add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 287, -1));

        viewResultsbtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        viewResultsbtn.setForeground(new java.awt.Color(0, 0, 102));
        viewResultsbtn.setText("View Results");
        viewResultsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultsbtnActionPerformed(evt);
            }
        });
        add(viewResultsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 700, -1, -1));

        clincalTrail.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 24)); // NOI18N
        clincalTrail.setForeground(new java.awt.Color(0, 0, 102));
        clincalTrail.setText("Clincal Trail");
        clincalTrail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clincalTrailActionPerformed(evt);
            }
        });
        add(clincalTrail, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 700, 190, 40));

        sexcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please select--", "Male", "Female" }));
        sexcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexcomboBoxActionPerformed(evt);
            }
        });
        add(sexcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 287, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Doctorlab.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, -1, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshbtnActionPerformed

    private void requestTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestBtnActionPerformed

        
        String message = testTxtField.getText().trim();
        String patientName = nameTxtField.getText();
        String sex = sexcomboBox.getSelectedItem().toString();
        if(sexcomboBox.getSelectedIndex()<=0)
        {
            JOptionPane.showMessageDialog(null, "Please select the sex");
            return;
        }
        if(message.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Write the test need to be performed");
             return;
        }
        int age ;
         try {
             age=Integer.parseInt(ageTxtField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be integer!");
            return;
        }
       
        

        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        request.setPatientName(patientName);
        Patient patient = new Patient();
        patient.setPatientName(patientName);
        patient.setAge(age);
        patient.setTest(message);
        patient.setSex(sex);
        request.setPatient(patient);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof LabOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            log.debug("sent request to Lab");
        }
        populateRequestTable();
        JOptionPane.showMessageDialog(null, "Test has been requested successfully");
        nameTxtField.setText("");
        ageTxtField.setText("");
        sexcomboBox.setSelectedIndex(0);
        testTxtField.setText("");
        

    }//GEN-LAST:event_requestTestBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewResultsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultsbtnActionPerformed
        int selectedRow = doctorRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"please select a row to view results");
            return;
        }     
 
        LabTestWorkRequest request = (LabTestWorkRequest) doctorRequestTbl.getValueAt(selectedRow, 0);
        System.out.println(doctorRequestTbl.getValueAt(selectedRow, 5));
        System.out.println(!(doctorRequestTbl.getValueAt(selectedRow, 5).toString().toLowerCase().equalsIgnoreCase("completed")));
        
          if(doctorRequestTbl.getValueAt(selectedRow, 6)==null)
        {
            JOptionPane.showMessageDialog(null, "Results need to be generated by lab assistant");
            return;
        }
         int flag=0;
         if((doctorRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("completed"))){
            
            flag++;
            
        }
         if((doctorRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("ClinicalTrail"))){            
            flag++;
            
        }
         System.out.println(flag+"clinical");
         if(flag==0)
         {
             JOptionPane.showMessageDialog(this, "Lab results are  not yet returned");
             return;
         }
        
         DoctorLabTestResultsJpanel processWorkRequestJPanel = new DoctorLabTestResultsJpanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        log.debug("adding request to lab assistant");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewResultsbtnActionPerformed

    private void clincalTrailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clincalTrailActionPerformed
        // TODO add your handling code here:
        int selectedRow = doctorRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null,"please select a row for clinical trail");
            return;
        }
       

        LabTestWorkRequest request = (LabTestWorkRequest) doctorRequestTbl.getValueAt(selectedRow, 0);
        
        request.setStatus("ClinicalTrail");
//         if(doctorRequestTbl.getValueAt(selectedRow, 6)==null || doctorRequestTbl.getValueAt(selectedRow, 6) == "N/A(BioTechnology Exists)")
//        {
//            JOptionPane.showMessageDialog(null, "Clinical trail cannot be performed on this patient");
//            return;
//        }
//        
//         
//        
//        if(doctorRequestTbl.getValueAt(selectedRow, 7)!=null)
//        {
//            JOptionPane.showMessageDialog(null, "Clinical trail was already performed on this patient");
//            return;
//        }
//        
//         int flag=0;
//         if((doctorRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("completed"))){
//            
//            flag++;
//            
//        }
//         if((doctorRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("ClinicalTrail"))){            
//            flag++;
//            
//        }
//         System.out.println(flag+"clinical");
//         if(flag==0)
//         {
//             JOptionPane.showMessageDialog(this, "Lab test results are yet returned");
//             return;
//             
//         }
//         
//        

        ClincalTrailJPanel clincalTrailJPanel = new ClincalTrailJPanel(userProcessContainer, request);
        userProcessContainer.add("clincalTrailJPanel", clincalTrailJPanel);
        log.debug("entering clinical Page");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_clincalTrailActionPerformed

    private void sexcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexcomboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton clincalTrail;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JTable doctorRequestTbl;
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton requestTestBtn;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JComboBox<String> sexcomboBox;
    private javax.swing.JTextField testTxtField;
    private javax.swing.JLabel valueLbl;
    private javax.swing.JButton viewResultsbtn;
    // End of variables declaration//GEN-END:variables
}