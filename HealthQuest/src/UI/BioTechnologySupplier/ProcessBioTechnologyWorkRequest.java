/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BioTechnologySupplier;


import Health.WorkQueue.BioTechnologyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author vivekhanagoji
 */
public class ProcessBioTechnologyWorkRequest extends javax.swing.JPanel {

    /**
     * Creates new form ProcessBioTechnologyWorkRequest
     */
    
    JPanel userProcessContainer;
    BioTechnologyWorkRequest request;
    private static Logger log = Logger.getLogger(ProcessBioTechnologyWorkRequest.class);
    private static final String CLASS_NAME = ProcessBioTechnologyWorkRequest.class.getName();
    public ProcessBioTechnologyWorkRequest(JPanel userprocessContainer,BioTechnologyWorkRequest request) {
        initComponents();
        this.userProcessContainer=userprocessContainer;
        this.request=request;
        dateFld.setMinSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        dateFld = new com.toedter.calendar.JDateChooser();
        dateTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 255));
        setPreferredSize(new java.awt.Dimension(2000, 1200));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("PROCESSING SUPPLIER REQUEST ");
        add(jLabel1);
        jLabel1.setBounds(167, 64, 793, 53);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("SELECT DATE OF DELIVERY : ");
        add(jLabel2);
        jLabel2.setBounds(167, 212, 375, 41);

        updateBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 0, 102));
        updateBtn.setText("UPDATE STATUS ");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(450, 330, 261, 50);

        backBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(140, 530, 94, 50);
        add(dateFld);
        dateFld.setBounds(540, 220, 210, 30);

        dateTxt.setEditable(false);
        dateTxt.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        add(dateTxt);
        dateTxt.setBounds(770, 211, 250, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/BioTechnologySupplier/supply.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(130, 60, 910, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
      
       request.setStatus("Completed");
       try{ 
           int year=dateFld.getCalendar().get(Calendar.YEAR);
        int month=dateFld.getCalendar().get(Calendar.MONTH);
        int day=dateFld.getCalendar().get(Calendar.DAY_OF_MONTH);
         String result=year+"-"+month+"-"+day;
           ((BioTechnologyWorkRequest) request).setDeliveryTime(result);
        dateTxt.setText(result);
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "please enter the delivery date ");
            return;
       }
       
       
        
       
        JOptionPane.showMessageDialog(null, "Request updated successfully!");
        log.debug("delivery date updated");
    }//GEN-LAST:event_updateBtnActionPerformed

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
    private com.toedter.calendar.JDateChooser dateFld;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
