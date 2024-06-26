/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminUI;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organization.organization;
import organization.organizationDirectory;

/**
 *
 * @author kaush
 */
public class AdminmanageorganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminmanageorganizationJPanel
     */
    JPanel CardContainer;
    organizationDirectory globalOrganizationList;
    
    public AdminmanageorganizationJPanel(JPanel CardContainer, organizationDirectory globalOrganizationList) {
        initComponents();
        this.CardContainer = CardContainer;
        this.globalOrganizationList = globalOrganizationList;
        
        populateOrganizationTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemove.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRemove.setText("Remove ");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 391, -1, 46));

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Organization Name", "Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 193, -1, 180));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 130, -1, 45));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 6, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminUI/admin.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1450, 1060));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblOrganization.getSelectedRow();
        organization selectedOrganization = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the organization");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        int organizationID = (int) model.getValueAt(selectedRowIndex, 0);
        
        for (organization Org : globalOrganizationList.getOrganizationList()){
            if (Org.getOrganizationID() == organizationID){
                selectedOrganization = Org;
                break;
            }
        }
        
        if (selectedOrganization.getPendingOrders().size() > 0){
            JOptionPane.showMessageDialog(this, "This organization has some pending orders");
            return;
        }
        
        globalOrganizationList.removeOrganization(selectedOrganization);
        selectedOrganization.getEnterpriseProfile().getOrganizationList().remove(selectedOrganization);
        
        JOptionPane.showMessageDialog(this, "Organization deleted");
        
        populateOrganizationTable();
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        model.setRowCount(0);

        for (organization Organization : globalOrganizationList.getOrganizationList()){
            Object[] row = new Object[3];
            row[0] = Organization.getOrganizationID();
            row[1] = Organization.getName();
            row[2] = Organization.getEnterpriseProfile().getName();
            
            model.addRow(row);
            
        }
    }
}
