/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CustomerUI;

import customer.customer;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kaush
 */
public class CustomerProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProfileJPanel
     */
    JPanel CardContainer;
    customer userCustomer;
    

    CustomerProfileJPanel(JPanel CardContainer, customer userCustomer) {
        initComponents();
        this.CardContainer = CardContainer;
        this.userCustomer = userCustomer;
        
        txtName.setText(userCustomer.getName());
        txtEmail.setText(userCustomer.getEmailID());
        txtAddress.setText(userCustomer.getAddress());
        txtPhoneNo.setText(userCustomer.getPhonenumber());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        btnBackcourse = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Phone Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 160, 40));

        txtEmail.setEnabled(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 160, 40));

        txtAddress.setEnabled(false);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 160, 40));

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 80, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Profile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 350, 58));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 82, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("E-Mail: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 82, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 82, -1));

        txtPhoneNo.setEnabled(false);
        add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 160, 40));

        btnBackcourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBackcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackcourseActionPerformed(evt);
            }
        });
        add(btnBackcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 40));

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrganizationUI/main5.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-520, -170, 1990, 1200));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        try{
        userCustomer.setPhonenumber(txtPhoneNo.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter only numbers in phone number");
            return;
        }
        
        userCustomer.setName(txtName.getText());
        userCustomer.setEmailID(txtEmail.getText());
        userCustomer.setPhonenumber(txtPhoneNo.getText());
        userCustomer.setAddress(txtAddress.getText());
        
        JOptionPane.showMessageDialog(this, "Details updated");
                
        txtAddress.setEnabled(false);
        txtEmail.setEnabled(false);
        txtPhoneNo.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackcourseActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_btnBackcourseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        txtAddress.setEnabled(true);
        txtEmail.setEnabled(true);
        txtPhoneNo.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackcourse;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}