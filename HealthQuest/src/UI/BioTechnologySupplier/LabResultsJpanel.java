/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BioTechnologySupplier;

import Health.Doctor.Patient;
import Health.BioTechnology.BioTechnology;
import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Gene.Gene;
import Health.Location.Location;
import Health.Organization.BioTechnologyOrganization;
import Health.UserAccount.UserAccount;
import Health.WorkQueue.BioTechnologyWorkRequest;
import Health.WorkQueue.LabTestWorkRequest;
import Health.WorkQueue.MedicalWorkRequest;
import Health.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import UI.LabAssistantRole.ProcessWorkRequestJPanel;

/**
 *
 * @author vivekhanagoji
 */
public class LabResultsJpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private BioTechnologyOrganization BioTechnologyOrganization;
    private Enterprise enterprise;
    private Location network;
    private static Logger log = Logger.getLogger(LabResultsJpanel.class);
    private static final String CLASS_NAME = LabResultsJpanel.class.getName();

    /**
     * Creates new form LabResultsJpanel
     */
    public LabResultsJpanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, BioTechnologyOrganization BioTechnologyOrganization, Location network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.BioTechnologyOrganization = BioTechnologyOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        populateTable();
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
        workRequestJTable = new javax.swing.JTable();
        generateBioTechnologyJButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Sender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(30);
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(57, 152, 900, 290);

        generateBioTechnologyJButton.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        generateBioTechnologyJButton.setForeground(new java.awt.Color(0, 0, 102));
        generateBioTechnologyJButton.setText("Generate Drug");
        generateBioTechnologyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBioTechnologyJButtonActionPerformed(evt);
            }
        });
        add(generateBioTechnologyJButton);
        generateBioTechnologyJButton.setBounds(650, 480, 210, 40);

        backBtn.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(230, 490, 82, 33);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Lab Results");
        add(jLabel1);
        jLabel1.setBounds(350, 50, 233, 53);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BioTechnologySupplier/rm373batch15-217-01.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 10, 1200, 780);
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : BioTechnologyOrganization.getWorkQueue().getWorkRequestList()) {

            if (((BioTechnologyWorkRequest) request).getPatient() != null) {
                Object[] row = new Object[7];
                row[0] = ((BioTechnologyWorkRequest) request).getPatient();
                row[1] = ((BioTechnologyWorkRequest) request).getPatient().getAge();
                row[2] = ((BioTechnologyWorkRequest) request).getPatient().getSex();
                row[3] = ((BioTechnologyWorkRequest) request).getPatient().getTest();

                row[4] = request.getSender().getEmployee().getName();
                               model.addRow(row);
            }
        }

    }

    private void generateBioTechnologyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBioTechnologyJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

         if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        int flag = 0;
        Patient patient = (Patient) workRequestJTable.getValueAt(selectedRow, 0);
        if(patient.getNewBioTechnology()!=null)
        {
            JOptionPane.showMessageDialog(null, "BioTechnology has been identified already");
        }
        
        List<String> patientGene = new ArrayList<>();
        for (int i = 0; i < patient.getGeneHistory().getGeneHistory().size(); i++) {
            Gene g = patient.getGeneHistory().getGeneHistory().get(i);
            patientGene.add(g.getGeneName());

        }
        Collections.sort(patientGene);
        List<String> totalBioTechnologyGene = new ArrayList<>();
        for (BioTechnology d : business.getBioTechnologyList().getBioTechnologyList()) {
            List<String> BioTechnologyGene = new ArrayList<>();
            for (int i = 0; i < d.getGeneHistory().getGeneHistory().size(); i++) {
                Gene g = d.getGeneHistory().getGeneHistory().get(i);
                BioTechnologyGene.add(g.getGeneName());
                totalBioTechnologyGene.add(g.getGeneName());
            }
            Collections.sort(BioTechnologyGene);

            if (BioTechnologyGene.equals(patientGene)) {
                ExistingBioTechnologyResultsJpanel existingBioTechnologyResultsJpanel = new ExistingBioTechnologyResultsJpanel(userProcessContainer, userAccount, enterprise, BioTechnologyOrganization, network, d);

                userProcessContainer.add("existingBioTechnologyResultsJpanel", existingBioTechnologyResultsJpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = 1;
            }

        }
        System.out.println(totalBioTechnologyGene.containsAll(patientGene));
         if (!totalBioTechnologyGene.containsAll(patientGene)) {
                NonExistingGeneJpanel nonExistingGeneJpanel = new NonExistingGeneJpanel(userProcessContainer, userAccount, enterprise, BioTechnologyOrganization, network);

                userProcessContainer.add("nonExistingGeneJpanel", nonExistingGeneJpanel);
                log.debug(userAccount+" "+"entering nonexisting page as BioTechnology doesn't exist");
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = 2;
            }
        

        if (flag == 0) {
            GenerateBioTechnologyNewBioTechnologyJPanel generateBioTechnologyNewBioTechnologyJPanel = new GenerateBioTechnologyNewBioTechnologyJPanel(userProcessContainer, patient, BioTechnologyOrganization, userAccount, network,business);

            userProcessContainer.add("generateBioTechnologyNewBioTechnologyJPanel", generateBioTechnologyNewBioTechnologyJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            log.debug(userAccount+" "+"entering new BioTechnology page as no BioTechnology exists");
            layout.next(userProcessContainer);
        }


    }//GEN-LAST:event_generateBioTechnologyJButtonActionPerformed

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
    private javax.swing.JButton backBtn;
    private javax.swing.JButton generateBioTechnologyJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
