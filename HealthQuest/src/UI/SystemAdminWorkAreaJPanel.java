    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Macbookpro
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private static Logger log = Logger.getLogger(SystemAdminWorkAreaJPanel.class);
    private static final String CLASS_NAME = SystemAdminWorkAreaJPanel.class.getName();
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    public void populateTree(){
        //DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
//        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
//        root.removeAllChildren();
//        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
//        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        viewReportsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageNetwork.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(0, 0, 102));
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 99, 390, -1));

        btnManageEnterprise.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(0, 0, 102));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 146, 390, -1));

        btnManageAdmin.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        btnManageAdmin.setForeground(new java.awt.Color(0, 0, 102));
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        add(btnManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 193, 390, -1));

        viewReportsBtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        viewReportsBtn.setForeground(new java.awt.Color(0, 0, 102));
        viewReportsBtn.setText("View Reports");
        viewReportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportsBtnActionPerformed(evt);
            }
        });
        add(viewReportsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 390, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void viewReportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportsBtnActionPerformed
        userinterface.SystemAdminWorkArea.ViewReportsJPanel ViewReports = new userinterface.SystemAdminWorkArea.ViewReportsJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ViewReports",ViewReports);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewReportsBtnActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        int i =0;
        for(Network n:ecosystem.getNetworkList() )
        {
            for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList())
            {
                i++;

            }
        }
        if(i<=0)
        {
            JOptionPane.showMessageDialog(null,"No enterprise is available to create a admin for a enterprise");
            return;
        }
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        log.debug("user adding enterpirse admins" +CLASS_NAME);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        if(ecosystem.getNetworkList().size()<=0)
        {
            JOptionPane.showMessageDialog(null,"No network available to create a enterprise");
            return;
        }
        else
        {
            ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
            log.debug("user creating enterpirse" +CLASS_NAME);
            userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        log.debug("user creating network" +CLASS_NAME);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton viewReportsBtn;
    // End of variables declaration//GEN-END:variables
}
