/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminUI;

import CustomerUI.ViewCurrentJPanel;
import customer.customerDirectory;
import deliveryPartner.deliveryPartnerDirectory;
import enterprise.enterpriseDirectory;
import feedback.QueryHistory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import organization.organizationDirectory;

/**
 *
 * @author kaush
 */
public class AdminmainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminmainJPanel
     */
    JPanel CardContainer;
    customerDirectory customerList;
    enterpriseDirectory enterpriseList;
    organizationDirectory globalOrganizationList;
    deliveryPartnerDirectory deliveryPartnerList;
    QueryHistory feedback;
    
    public AdminmainJPanel(JPanel CardContainer, customerDirectory customerList, enterpriseDirectory enterpriseList,
            organizationDirectory organizationList, deliveryPartnerDirectory deliveryPartnerList, QueryHistory feedback) {
        
        initComponents();
        this.CardContainer = CardContainer;
        this.customerList = customerList;
        this.enterpriseList = enterpriseList;
        this.globalOrganizationList = organizationList;
        this.deliveryPartnerList = deliveryPartnerList;
        this.feedback = feedback;
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
        jLabel5 = new javax.swing.JLabel();
        btnManage = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAnalysis = new javax.swing.JButton();
        CBManageRole = new javax.swing.JComboBox<>();
        btnFeedback = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 694, 45));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Manage Existing Roles:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, 40));

        btnManage.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnManage.setText("Manage");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 120, 40));

        btnLogOut.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 50));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("View User Feedbacks:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 190, 33));

        btnAnalysis.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAnalysis.setText("Analytics");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });
        add(btnAnalysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 120, 40));

        CBManageRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Enterprise", "Organization", "Delivery Partner" }));
        add(CBManageRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 130, -1));

        btnFeedback.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 120, 40));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("View Analytics:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 130, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminUI/admin.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 1200));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed

        Object role = CBManageRole.getSelectedItem();
        String selectedRole = role.toString();
        
        if (selectedRole.equals("Select Role")){
            JOptionPane.showMessageDialog(this, "Please select a role");
            return;
        }
        
        if (selectedRole.equals("Enterprise")){
            
            AdminmanageenterpriseJPanel adminManageEnterpriseJPanel = new AdminmanageenterpriseJPanel(CardContainer, enterpriseList);
            CardContainer.add("AdminmanageenterpriseJPanel", adminManageEnterpriseJPanel);
            CardLayout layout = (CardLayout) CardContainer.getLayout();
            layout.next(CardContainer);
                
        }
        
        if (selectedRole.equals("Organization")){
            
            AdminmanageorganizationJPanel adminManageOrganizationJPanel = new AdminmanageorganizationJPanel(CardContainer, globalOrganizationList);
            CardContainer.add("AdminmanageorganizationJPanel", adminManageOrganizationJPanel);
            CardLayout layout = (CardLayout) CardContainer.getLayout();
            layout.next(CardContainer);
            
        }
        
        if (selectedRole.equals("Delivery Partner")){
            
            AdminmanagedeliveryJPanel adminmanagedeliveryJPanel = new AdminmanagedeliveryJPanel(CardContainer, deliveryPartnerList);
            CardContainer.add("AdminmanagedeliveryJPanel", adminmanagedeliveryJPanel);
            CardLayout layout = (CardLayout) CardContainer.getLayout();
            layout.next(CardContainer);
            
        }
        
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed
        // TODO add your handling code here:
        
        AdminanalyticsJPanel adminAnalyticsJPanel = new AdminanalyticsJPanel(CardContainer, customerList, enterpriseList, globalOrganizationList, deliveryPartnerList);
        CardContainer.add("AdminanalyticsJPanel", adminAnalyticsJPanel);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.next(CardContainer);
        
    }//GEN-LAST:event_btnAnalysisActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        
        ViewUserFeedbackJPanel viewUserFeedbackJPanel = new ViewUserFeedbackJPanel(CardContainer, feedback);
        CardContainer.add("ViewUserFeedbackJPanel", viewUserFeedbackJPanel);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.next(CardContainer);
        
    }//GEN-LAST:event_btnFeedbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBManageRole;
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private static class CardContainer {

        public CardContainer() {
        }
    }
}
