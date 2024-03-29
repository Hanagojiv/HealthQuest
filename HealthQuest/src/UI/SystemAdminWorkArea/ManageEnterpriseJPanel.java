/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
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
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(ManageEnterpriseJPanel.class);
    private static final String CLASS_NAME = ManageEnterpriseJPanel.class.getName();
 
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Location network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Location network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        enterpriseJTable.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(0, 0, 102));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setRowHeight(25);
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(190, 116, 620, 160);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Network");
        add(jLabel1);
        jLabel1.setBounds(360, 300, 84, 29);

        networkJComboBox.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(0, 0, 102));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(networkJComboBox);
        networkJComboBox.setBounds(473, 293, 220, 36);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2);
        jLabel2.setBounds(390, 420, 59, 29);

        nameJTextField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(0, 0, 102));
        add(nameJTextField);
        nameJTextField.setBounds(473, 419, 220, 36);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Enterprise Type");
        add(jLabel3);
        jLabel3.setBounds(290, 360, 159, 29);

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        enterpriseTypeJComboBox.setForeground(new java.awt.Color(0, 0, 102));
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox);
        enterpriseTypeJComboBox.setBounds(473, 361, 220, 36);

        submitJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(0, 0, 102));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(730, 490, 101, 35);

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 0, 102));
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(210, 480, 87, 35);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel6.setText("Manage Enterprise ");
        add(jLabel6);
        jLabel6.setBounds(310, 30, 480, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ChemicalRole/983117.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(-710, 0, 1730, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Location network = (Location) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        if(nameJTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid input");
            return;
        }
        String name = nameJTextField.getText().trim();
        ArrayList<String> enterpriseCheck = new ArrayList<>();
        for(Enterprise e :network.getEnterpriseDirectory().getEnterpriseList())
        {
            enterpriseCheck.add(e.getName());
            
        }
        if(enterpriseCheck.contains(name))
        {
            JOptionPane.showMessageDialog(null, "Enterprise already exists with the same name");
            return;
            
        }
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        log.debug("name of the Enterpise is: \t" +name+ "name of Network in which the enterprise is: \t" +network+ "\t" +CLASS_NAME);
        populateTable();
        nameJTextField.setText("");

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
