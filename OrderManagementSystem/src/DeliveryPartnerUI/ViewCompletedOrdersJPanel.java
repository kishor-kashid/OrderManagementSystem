/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DeliveryPartnerUI;

import deliveryPartner.deliveryPartner;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import order.order;

/**
 *
 * @author pranavkapse
 */
public class ViewCompletedOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCompletedOrdersJPanel
     */
    JPanel CardContainer;
    deliveryPartner userDeliveryPartner;
    
    public ViewCompletedOrdersJPanel(JPanel CardContainer, deliveryPartner userDeliveryPartner) {
        initComponents();
        this.CardContainer = CardContainer;
        this.userDeliveryPartner = userDeliveryPartner;
        
        populateCompletedOrders();
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
        tblCompletedOrders = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBackcourse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCompletedOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Customer Address", "Order ID", "Organization", "Order Revenue"
            }
        ));
        jScrollPane1.setViewportView(tblCompletedOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 900, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Completed Orders Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        btnBackcourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBackcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackcourseActionPerformed(evt);
            }
        });
        add(btnBackcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeliveryPartnerUI/delivery.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1450, 970));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackcourseActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_btnBackcourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackcourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCompletedOrders;
    // End of variables declaration//GEN-END:variables

    private void populateCompletedOrders() {
        
        DefaultTableModel model = (DefaultTableModel) tblCompletedOrders.getModel();
        model.setRowCount(0);
        
        ArrayList<order> completedOrderList = userDeliveryPartner.getCompletedOrders();
        
        for(order Order : completedOrderList){
            
            Object[] row = new Object[5];
            row[0] = Order.getCustomerProfile().getName();
            row[1] = Order.getCustomerProfile().getAddress();
            row[2] = Order.getOrderID();
            row[3] = Order.getOrganizationProfile().getName();
            row[4] = Order.calculateOrderTotal(Order) * userDeliveryPartner.getPercentShare() / 100;
            
            model.addRow(row);
        }
    }
}