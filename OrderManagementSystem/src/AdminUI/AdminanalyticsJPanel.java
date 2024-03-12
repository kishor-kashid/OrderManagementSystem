/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminUI;

import analytics.dataAnalysis;
import customer.customer;
import customer.customerDirectory;
import deliveryPartner.deliveryPartner;
import deliveryPartner.deliveryPartnerDirectory;
import enterprise.enterprise;
import enterprise.enterpriseDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organization.organization;
import organization.organizationDirectory;

/**
 *
 * @author kaush
 */
public class AdminanalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminanalyticsJPanel
     */
    JPanel CardContainer;
    customerDirectory customerList;
    enterpriseDirectory enterpriseList;
    organizationDirectory globalOrganizationList;
    deliveryPartnerDirectory deliveryPartnerList;
    dataAnalysis dataSolutions;
    
    public AdminanalyticsJPanel(JPanel CardContainer, customerDirectory customerList, enterpriseDirectory enterpriseList,
            organizationDirectory globalOrganizationList, deliveryPartnerDirectory deliveryPartnerList) {
        
        initComponents();
        this.CardContainer = CardContainer;
        this.customerList = customerList;
        this.enterpriseList = enterpriseList;
        this.globalOrganizationList = globalOrganizationList;
        this.deliveryPartnerList = deliveryPartnerList;
        
        dataSolutions = new dataAnalysis(customerList, enterpriseList, globalOrganizationList, deliveryPartnerList);
        
        popoulateTables();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDeliveryPartner = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Analytics");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 230, 50));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Top 3 Enterprises");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 260, 35));

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Enterprise Names", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);
        if (tblEnterprise.getColumnModel().getColumnCount() > 0) {
            tblEnterprise.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 260, 195));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Top 3 Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 279, 33));

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Names", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 279, 195));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("View Top 3 Customer");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 260, 35));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("View Top 3 Delivery Partners");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 310, 34));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Customer Names", "Revenue"
            }
        ));
        jScrollPane4.setViewportView(tblCustomer);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 260, 195));

        tblDeliveryPartner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Delivery Partner Name", "Revenue"
            }
        ));
        jScrollPane5.setViewportView(tblDeliveryPartner);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 279, 195));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 110, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminUI/data1.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -240, 1490, 1290));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblDeliveryPartner;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables

    private void populateEnterpriseTable() {
        
        ArrayList<enterprise> topEnterprises = dataSolutions.top3Enterprise();
        
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
        model.setRowCount(0);

        for (enterprise Enterprise : topEnterprises){
            Object[] row = new Object[2];
            row[0] = Enterprise.getName();
            row[1] = Enterprise.calculateEnterpriseRevenue(Enterprise);
            
            model.addRow(row);
            
        }
        
    }

    private void populateOrganizationTable() {
        
        ArrayList<organization> topOrganizations = dataSolutions.top3Organization();

        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        model.setRowCount(0);

        for (organization Organization : topOrganizations) {
            Object[] row = new Object[2];
            row[0] = Organization.getName();
            row[1] = Organization.calculateOrganizationRevenue(Organization);

            model.addRow(row);
        }
    }

    private void populateCustomerTable() {
        
        ArrayList<customer> topCustomers = dataSolutions.top3Customer();
        
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        model.setRowCount(0);

        for (customer Customer : topCustomers) {
            Object[] row = new Object[2];
            row[0] = Customer.getName();
            row[1] = Customer.calculateCustomerRevenue(Customer);

            model.addRow(row);
        }
    }

    private void populateDeliveryPartnerTable() {
        
        ArrayList<deliveryPartner> topDeliveryPartners = dataSolutions.top3DeliveryPartner();

        DefaultTableModel model = (DefaultTableModel) tblDeliveryPartner.getModel();
        model.setRowCount(0);

        for (deliveryPartner DeliveryPartner : topDeliveryPartners) {
            Object[] row = new Object[2];
            row[0] = DeliveryPartner.getName();
            row[1] = DeliveryPartner.getRevenue();

            model.addRow(row);
        }
    }

    private void popoulateTables() {
        populateEnterpriseTable();
        populateOrganizationTable();
        populateCustomerTable();
        populateDeliveryPartnerTable();
    }
}
