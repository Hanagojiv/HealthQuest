/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabAssistantRole;

import Health.Doctor.Patient;
import Health.Enterprise.Enterprise;
import Health.Gene.Gene;
import Health.Location.Location;
import Health.Organization.LabOrganization;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import Health.WorkQueue.BioTechnologyWorkRequest;
import Health.WorkQueue.LabTestWorkRequest;
import Health.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import UI.DoctorRole.PrescriptionJPanel;

/**
 *
 * @author vivekhanagoji
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private LabOrganization labOrganization;
    private UserAccount userAccount;
    private Location network;
    String filePath = "./genes data.txt";
    private static Logger log = Logger.getLogger(ProcessWorkRequestJPanel.class);
    private static final String CLASS_NAME = ProcessWorkRequestJPanel.class.getName();

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request, Organization organization, UserAccount userAccount, Location network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.labOrganization = (LabOrganization) organization;
        patientTxtField.setText(request.getPatientName());
        populateTable();
        System.out.println(request.getStatus());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        resultLbl = new javax.swing.JLabel();
        patientTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        geneTbl = new javax.swing.JTable();
        patientNameLbl = new javax.swing.JLabel();
        addGeneBtn = new javax.swing.JButton();
        geneLbl = new javax.swing.JLabel();
        genetxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        submitBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 0, 102));
        submitBtn.setText("Submit Result");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn);
        submitBtn.setBounds(650, 570, 170, 35);

        resultLbl.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        resultLbl.setForeground(new java.awt.Color(51, 51, 51));
        resultLbl.setText("Results");
        add(resultLbl);
        resultLbl.setBounds(670, 30, 144, 56);

        patientTxtField.setEditable(false);
        add(patientTxtField);
        patientTxtField.setBounds(650, 100, 150, 30);

        backBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(240, 610, 140, 35);

        geneTbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        geneTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Gene"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        geneTbl.setRowHeight(30);
        jScrollPane.setViewportView(geneTbl);
        if (geneTbl.getColumnModel().getColumnCount() > 0) {
            geneTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane);
        jScrollPane.setBounds(450, 190, 560, 210);

        patientNameLbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        patientNameLbl.setText("Patient Name :");
        add(patientNameLbl);
        patientNameLbl.setBounds(480, 100, 180, 30);

        addGeneBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        addGeneBtn.setForeground(new java.awt.Color(0, 0, 102));
        addGeneBtn.setText("ADD Gene");
        addGeneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGeneBtnActionPerformed(evt);
            }
        });
        add(addGeneBtn);
        addGeneBtn.setBounds(880, 490, 160, 35);

        geneLbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        geneLbl.setForeground(new java.awt.Color(0, 0, 102));
        geneLbl.setText("Gene");
        add(geneLbl);
        geneLbl.setBounds(510, 490, 80, 40);

        genetxtField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        genetxtField.setForeground(new java.awt.Color(0, 0, 102));
        genetxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genetxtFieldActionPerformed(evt);
            }
        });
        add(genetxtField);
        genetxtField.setBounds(650, 490, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/doc19.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 760);
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) geneTbl.getModel();

        model.setRowCount(0);
        System.out.println(((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory());
        System.out.println(((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory().size());

        for (Gene g : ((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory()) {

            Object[] row = new Object[2];
            row[0] = g.getId();
            row[1] = g.getGeneName();
            System.out.println(((LabTestWorkRequest) request).getPatient());

            model.addRow(row);
        }

    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        submitBtn.setEnabled(true);
        ArrayList<String> genecheck = new ArrayList<>();
        for (Gene g : ((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory()) {
            genecheck.add(g.getGeneName());

        }
        if (genecheck.size() <= 0) {
            JOptionPane.showMessageDialog(null, "no genes has been added to submit ");
            return;
        }
        request.setStatus("Completed");
        BioTechnologyWorkRequest requestBioTechnology = new BioTechnologyWorkRequest();

        requestBioTechnology.setPatient(((LabTestWorkRequest) request).getPatient());

        requestBioTechnology.setSender(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(requestBioTechnology);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("***** Organization Name:" + enterprise.getName());
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("***** Organization Name:" + organization.getName());
                if (organization.getName().equals("BioTechnology Organization")) {
                    System.out.println("True");

                    System.out.println("***** organization Name" + organization.getName());

                    organization.getWorkQueue().getWorkRequestList().add(requestBioTechnology);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Result has been succesfully submited");
        submitBtn.setEnabled(false);


    }//GEN-LAST:event_submitBtnActionPerformed

    private void genetxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genetxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genetxtFieldActionPerformed

    private void addGeneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGeneBtnActionPerformed
        // TODO add your handling code here:
        Patient patient = ((LabTestWorkRequest) request).getPatient();
        String geneName = genetxtField.getText().trim();
        if (geneName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add a gene");
            return;
        }

        ArrayList<String> genecheck = new ArrayList<>();
        for (Gene g1 : patient.getGeneHistory().getGeneHistory()) {
            genecheck.add(g1.getGeneName().toLowerCase());

        }
        if (genecheck.contains(geneName.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Gene already exists in the list ");
            return;
        }
        Gene g = patient.getGeneHistory().addGeneList();
        g.setGeneName(geneName);
        request.setPatient(patient);
        populateTable();
        saveRecord(g.getGeneName());
        genetxtField.setText("");

    }//GEN-LAST:event_addGeneBtnActionPerformed

    public void saveRecord(String gene) {
        try {
            FileWriter file = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(file);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(gene);
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGeneBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel geneLbl;
    private javax.swing.JTable geneTbl;
    private javax.swing.JTextField genetxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}
