/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Health.EcoSystem;
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
 * @author kasai
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(ManageNetworkJPanel.class);
    private static final String CLASS_NAME = ManageNetworkJPanel.class.getName();

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Location network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
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
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 148, 172));
        setLayout(null);

        networkJTable.setBackground(new java.awt.Color(0, 153, 204));
        networkJTable.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        networkJTable.setForeground(new java.awt.Color(0, 0, 102));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setRowHeight(22);
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(330, 120, 470, 150);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(360, 300, 58, 29);

        submitJButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(0, 0, 102));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(500, 360, 111, 36);

        nameJTextField.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(0, 0, 102));
        add(nameJTextField);
        nameJTextField.setBounds(460, 300, 190, 36);

        backJButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 0, 102));
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(140, 530, 91, 36);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage Network");
        add(jLabel6);
        jLabel6.setBounds(360, 20, 370, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Network.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        log.debug("Sysadmin Creating Network" +CLASS_NAME);
        String name = nameJTextField.getText().trim();
        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid network");
            return;
        
        }
        ArrayList<String> networkcheck= new ArrayList<>();
       for(Location n: system.getNetworkList())
       {
           networkcheck.add(n.getName().toLowerCase());
           
       }
        if(networkcheck.contains(name.toLowerCase()))
        {
            JOptionPane.showMessageDialog(null, "network already existed");
            return;
        }
        Location network = system.createAndAddNetwork();
        network.setName(name);
        log.debug("Name of network Created:\t" +name);
        populateNetworkTable();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}