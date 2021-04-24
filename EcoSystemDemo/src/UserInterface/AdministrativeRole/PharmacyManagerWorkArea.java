/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Request.ModifyMedicinesRequest;
import Business.Request.Order;
import Business.Request.PurchaseRequest;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmacyManagerWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecosystem;
    /** Creates new form AdminWorkAreaJPanel */
    public PharmacyManagerWorkArea(JPanel userProcessContainer, Enterprise enterprise,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        valueLabel.setText(enterprise.getName());
        
        popmodifytab();
        poppurchasetab();
        popordertab();
    }
    private void popordertab(){
        DefaultTableModel model = (DefaultTableModel) ordertable.getModel();
        model.setRowCount(0);
        for (Order order : ecosystem.getOrderDirectory().getOrderList()){
            if(order.getStatus().equals("Ordered")&&order.getRName().equals(enterprise.getName())){
                Object[] row = new Object[5];
                row[0] = order;
                row[1] = order.gettPrice();
                row[2] = order.getRName();
                row[3] = order.getDName();
                row[4] = order.getStatus();
                model.addRow(row);
            
            
        }
    }
    }
    void popmodifytab(){
        DefaultTableModel model = (DefaultTableModel) itemlisttable.getModel();
        model.setRowCount(0);
        for (ModifyMedicinesRequest m : enterprise.getModifyDishesRequestDirectory().getModifyMenuRequestList()){
            if(m.getModifyStatus().equals("Processing")){
            Object[] row = new Object[5];
            row[0] = m.getMedicine().getMedicineName();
            row[1] = m.getoPrice();
            row[2] = m.getFp();
            row[3] = m;
            row[4] = m.getModifyStatus();
            model.addRow(row);
            }
        }
    }
    
    void poppurchasetab(){
        DefaultTableModel model = (DefaultTableModel) purchasereq.getModel();
        model.setRowCount(0);
        for (PurchaseRequest p : enterprise.getPurchaseRequestDirectory().getPurchaseRequestList()){
            if(p.getMedicineRequest().equals("Processing")){
                Object[] row = new Object[4];
                row[0] = p.getMedicineName();
                row[1] = p.gettRate();
                row[2] = p;
                row[3] = p.getMedicineRequest();
                model.addRow(row);
            }
            
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

        jLabel1 = new javax.swing.JLabel();
        manageemptype = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageuser = new javax.swing.JButton();
        manageemployess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemlisttable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        modifyapp = new javax.swing.JButton();
        modifydecl = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchasereq = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        purapp = new javax.swing.JButton();
        purdel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ordercompleted = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy Manager Work Area");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 540, -1));

        manageemptype.setBackground(null);
        manageemptype.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        manageemptype.setForeground(new java.awt.Color(0, 51, 102));
        manageemptype.setText("Manage Employee Type");
        manageemptype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        manageemptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemptypeActionPerformed(evt);
            }
        });
        add(manageemptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 30));

        enterpriseLabel.setBackground(null);
        enterpriseLabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 51, 102));
        enterpriseLabel.setText("Enterprise :");
        enterpriseLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        valueLabel.setBackground(null);
        valueLabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 0));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 30));

        manageuser.setBackground(null);
        manageuser.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        manageuser.setForeground(new java.awt.Color(0, 51, 102));
        manageuser.setText("Manage User");
        manageuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        manageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageuserActionPerformed(evt);
            }
        });
        add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 30));

        manageemployess.setBackground(null);
        manageemployess.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        manageemployess.setForeground(new java.awt.Color(0, 51, 102));
        manageemployess.setText("Manage Employee");
        manageemployess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        manageemployess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemployessActionPerformed(evt);
            }
        });
        add(manageemployess, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, 30));

        itemlisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Medicines", "Original Price", "Modified Price", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemlisttable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 510, 104));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modify Item List Request:");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 170, 21));

        modifyapp.setBackground(null);
        modifyapp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        modifyapp.setForeground(new java.awt.Color(0, 51, 102));
        modifyapp.setText("Approve");
        modifyapp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        modifyapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyappActionPerformed(evt);
            }
        });
        add(modifyapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 105, -1));

        modifydecl.setBackground(null);
        modifydecl.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        modifydecl.setForeground(new java.awt.Color(0, 51, 102));
        modifydecl.setText("Decline");
        modifydecl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        modifydecl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifydeclActionPerformed(evt);
            }
        });
        add(modifydecl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, 105, -1));

        purchasereq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Money Ordered", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(purchasereq);
        if (purchasereq.getColumnModel().getColumnCount() > 0) {
            purchasereq.getColumnModel().getColumn(0).setResizable(false);
            purchasereq.getColumnModel().getColumn(1).setResizable(false);
            purchasereq.getColumnModel().getColumn(2).setResizable(false);
            purchasereq.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 510, 100));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Purchase Request:");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, 21));

        purapp.setBackground(null);
        purapp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        purapp.setForeground(new java.awt.Color(0, 51, 102));
        purapp.setText("Approve");
        purapp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        purapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purappActionPerformed(evt);
            }
        });
        add(purapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 105, -1));

        purdel.setBackground(null);
        purdel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        purdel.setForeground(new java.awt.Color(0, 51, 102));
        purdel.setText("Decline");
        purdel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        purdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purdelActionPerformed(evt);
            }
        });
        add(purdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 105, -1));

        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Price", "Pharmacy", "Delivery", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ordertable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 510, 97));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Order:");
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 90, -1));

        ordercompleted.setBackground(null);
        ordercompleted.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ordercompleted.setForeground(new java.awt.Color(0, 51, 102));
        ordercompleted.setText("Completed");
        ordercompleted.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        ordercompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordercompletedActionPerformed(evt);
            }
        });
        add(ordercompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 480, 105, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 850, 70));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 840, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void manageemptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemptypeActionPerformed

        PharmacyEmployeeTypeManagementJPanel pharmacyemptypemanag = new PharmacyEmployeeTypeManagementJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),ecosystem,enterprise);
        userProcessContainer.add("PharmacyEmployeeTypeManagementJPanel", pharmacyemptypemanag);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageemptypeActionPerformed

    private void manageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageuserActionPerformed
        // TODO add your handling code here:
        PharmacyManageUserAccountJPanel pharmmanageuserpanel = new PharmacyManageUserAccountJPanel(userProcessContainer, enterprise,ecosystem);
        userProcessContainer.add("PharmacyManageUserAccountJPanel", pharmmanageuserpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageuserActionPerformed

    private void manageemployessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemployessActionPerformed

        PharmacyManageEmployeeJPanel pharmaMagageemppanel = new PharmacyManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),ecosystem,enterprise);
        userProcessContainer.add("PharmacyManageEmployeeJPanel", pharmaMagageemppanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageemployessActionPerformed

    private void purappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purappActionPerformed
        // TODO add your handling code here:
        int selectedrow = purchasereq.getSelectedRow();

        if(selectedrow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        PurchaseRequest  vs = (PurchaseRequest)purchasereq.getValueAt(selectedrow,2);
            
        vs.setMedicineRequest("Approved By Pharmacy Administrator");

        JOptionPane.showMessageDialog(null, "Request Apporved","Success",JOptionPane.PLAIN_MESSAGE);
        poppurchasetab();
        DB4OUtil.getInstance().storeSystem(ecosystem);
        
    }//GEN-LAST:event_purappActionPerformed

    private void ordercompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordercompletedActionPerformed
        // TODO add your handling code here:
        int selectedrow = ordertable.getSelectedRow();

        if(selectedrow<0)
        {
            
        JOptionPane.showMessageDialog(null,"Please select an order to complete!","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        Order  vs = (Order)ordertable.getValueAt(selectedrow,0);
            
        vs.setStatus("packed");
            
        JOptionPane.showMessageDialog(null, "Order Packed","Success",JOptionPane.PLAIN_MESSAGE);
        popordertab();
        DB4OUtil.getInstance().storeSystem(ecosystem);
        
    }//GEN-LAST:event_ordercompletedActionPerformed

    private void modifyappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyappActionPerformed
        // TODO add your handling code here:
        int selectedrow = itemlisttable.getSelectedRow();

        if(selectedrow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select an request!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        ModifyMedicinesRequest  vs = (ModifyMedicinesRequest)itemlisttable.getValueAt(selectedrow,3);
            
            vs.setModifyStatus("Approved");
            
            vs.getMedicine().setPrice(vs.getFp());
            
            
            JOptionPane.showMessageDialog(null, "Modify Request approved","Success",JOptionPane.PLAIN_MESSAGE);
            popmodifytab();
            DB4OUtil.getInstance().storeSystem(ecosystem);
        
    }//GEN-LAST:event_modifyappActionPerformed

    private void modifydeclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifydeclActionPerformed
        // TODO add your handling code here:
        int selectedrow = itemlisttable.getSelectedRow();

        if(selectedrow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select an request to delete!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
            ModifyMedicinesRequest  vs = (ModifyMedicinesRequest)itemlisttable.getValueAt(selectedrow,3);
            
            vs.setModifyStatus("Declined");
            
            JOptionPane.showMessageDialog(null, "This modify request has been declined","Success",JOptionPane.PLAIN_MESSAGE);
            popmodifytab();
            DB4OUtil.getInstance().storeSystem(ecosystem);

    }//GEN-LAST:event_modifydeclActionPerformed

    private void purdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purdelActionPerformed
        // TODO add your handling code here:
        int selectedrow = purchasereq.getSelectedRow();

        if(selectedrow <0)
        {
        
        JOptionPane.showMessageDialog(null,"Please select an request!","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
            PurchaseRequest  vs = (PurchaseRequest)purchasereq.getValueAt(selectedrow,2);
            
            vs.setMedicineRequest("Declined By Pharmacy Manager");
            
            JOptionPane.showMessageDialog(null, "This purchase request has been declined","Success",JOptionPane.PLAIN_MESSAGE);
            poppurchasetab();
            DB4OUtil.getInstance().storeSystem(ecosystem);

    }//GEN-LAST:event_purdelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable itemlisttable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton manageemployess;
    private javax.swing.JButton manageemptype;
    private javax.swing.JButton manageuser;
    private javax.swing.JButton modifyapp;
    private javax.swing.JButton modifydecl;
    private javax.swing.JButton ordercompleted;
    private javax.swing.JTable ordertable;
    private javax.swing.JButton purapp;
    private javax.swing.JTable purchasereq;
    private javax.swing.JButton purdel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
