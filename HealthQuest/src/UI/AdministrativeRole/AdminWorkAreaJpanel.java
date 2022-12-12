/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Health.Employee.Employee;
import Health.Enterprise.Enterprise;
import Health.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;


/**
 *
 * @author vivekhanagoji
 */
public class AdminWorkAreaJpanel extends javax.swing.JPanel {
    
    /**
     * Creates new form AdminWorkAreaJpanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    private static Logger log = Logger.getLogger(AdminWorkAreaJpanel.class);
    private static final String CLASS_NAME = AdminWorkAreaJpanel.class.getName();
    public AdminWorkAreaJpanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
         this.enterprise = enterprise;
          this.userProcessContainer = userProcessContainer;
          valuelbl.setText(enterprise.getName());
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        valuelbl = new javax.swing.JLabel();
        manageEmployeebtn = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        userbtn = new javax.swing.JButton();
        manageOrganizationbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(23, 107, 163));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrative Work Place");
        add(jLabel3);
        jLabel3.setBounds(250, 150, 531, 56);

        valuelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valuelbl.setForeground(new java.awt.Color(255, 255, 255));
        valuelbl.setText("<value>");
        add(valuelbl);
        valuelbl.setBounds(530, 220, 130, 30);

        manageEmployeebtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        manageEmployeebtn.setText("Manage Employee");
        manageEmployeebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        manageEmployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeebtnActionPerformed(evt);
            }
        });
        add(manageEmployeebtn);
        manageEmployeebtn.setBounds(350, 370, 320, 70);

        enterpriseLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Enterprise :");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(370, 220, 150, 30);

        userbtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        userbtn.setText("Manage User");
        userbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });
        add(userbtn);
        userbtn.setBounds(350, 470, 320, 70);

        manageOrganizationbtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        manageOrganizationbtn.setText("Manage Organization");
        manageOrganizationbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        manageOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationbtnActionPerformed(evt);
            }
        });
        add(manageOrganizationbtn);
        manageOrganizationbtn.setBounds(350, 280, 320, 70);
        add(jLabel1);
        jLabel1.setBounds(130, -30, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/administrativework.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationbtnActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJpanel manageOrganizationJPanel = new ManageOrganizationJpanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        log.debug("Enterprise admin creating Organization \t"+CLASS_NAME);
        userProcessContainer.add("manageOrganization", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationbtnActionPerformed

    private void manageEmployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeebtnActionPerformed
        // TODO add your handling code here:
        int Organisationcheck=0;
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            Organisationcheck++;
            
        }
        if(Organisationcheck<=0)
        {
            JOptionPane.showMessageDialog(null, "Organisation is Unavailable to create a Employee");
            return;
        }
        
        ManageEmployeeJpanel manageEmployeeJPanel = new ManageEmployeeJpanel(userProcessContainer, enterprise.getOrganizationDirectory());
        log.debug("Enterprise admin adding Employee \t" +CLASS_NAME);
        userProcessContainer.add("manageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeebtnActionPerformed

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
        // TODO add your handling code here:
        int employeecheck=0;
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            for(Employee e :o.getEmployeeDirectory().getEmployeeList())
            employeecheck++;
     
        }
        if(employeecheck<=0)
        {
             JOptionPane.showMessageDialog(null, "No Employee is available to create a user account for them");
            return;
        }
        ManageUserAccountJpanel muajp = new ManageUserAccountJpanel(userProcessContainer, enterprise);
        log.debug("Enterprise admin adding users \t" +CLASS_NAME);
        userProcessContainer.add("ManageUserAccount", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageEmployeebtn;
    private javax.swing.JButton manageOrganizationbtn;
    private javax.swing.JButton userbtn;
    private javax.swing.JLabel valuelbl;
    // End of variables declaration//GEN-END:variables
}
