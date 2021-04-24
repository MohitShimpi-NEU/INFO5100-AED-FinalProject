/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyFinanceManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Request.Medicine;
import Business.Request.MoneyOrder;
import Business.Request.MoneyOrderDirectory;
import Business.Request.Order;
import Business.Request.PurchaseRequest;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyManagerRole.AddMedicinesJPanel;
import UserInterface.PharmacyManagerRole.RequestModifyListJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmacyFinanceManagerWorkAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private MoneyOrderDirectory moneyOrderDirectory;
    private List<Order> temp;
            
    public PharmacyFinanceManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        vallabel.setText(enterprise.getName());
        this.userProcessContainer = userProcessContainer;
         this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.account = account;
       
        this.moneyOrderDirectory = enterprise.getMoneyOrderDirectory();
        this.temp = new ArrayList<Order>();
        
        float sum=0;
        for(MoneyOrder m:moneyOrderDirectory.getMoneyOrderList()){
            if(m.getMoneyOrderStatus().equals("Approved")){
                sum+=m.getMoney();
            }
        }
        txtBalance.setText(String.valueOf(enterprise.getBalance()+sum));
        populatePurchaseTable();
        populateMoneyOrderJTable();
    }
    

    void populateMoneyOrderJTable(){
        DefaultTableModel model = (DefaultTableModel) moneyOrderJTable.getModel();
        model.setRowCount(0);
        for (MoneyOrder m : enterprise.getMoneyOrderDirectory().getMoneyOrderList()){
            
                Object[] row = new Object[4];
                row[0] = m;
                row[1] = m.getMoney();
                row[2] = m.getName();
                row[3] = m.getMoneyOrderStatus();
                model.addRow(row);
            
            
        }
    }

    void populatePurchaseTable(){
        DefaultTableModel model = (DefaultTableModel) purchaseJTable.getModel();
        model.setRowCount(0);
        for (PurchaseRequest p : enterprise.getPurchaseRequestDirectory().getPurchaseRequestList()){
            if(p.getMedicineRequest().equals("Approved By Pharmacy Administrator")){
                Object[] row = new Object[4];
                row[0] = p.getMedicineName();
                row[1] = p.gettRate();
                row[2] = p;
                row[3] = p.getMedicineRequest();
                model.addRow(row);
            }
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApprove = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        moneyOrderJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnRequestMoney = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchaseJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        enterpriseLabel1 = new javax.swing.JLabel();
        vallabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnApprove.setBackground(new java.awt.Color(255, 255, 255));
        btnApprove.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 51, 102));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        moneyOrderJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        moneyOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Money Request", "Restaurant", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(moneyOrderJTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Balance:");
        jLabel1.setOpaque(true);

        txtBalance.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        txtBalance.setForeground(new java.awt.Color(0, 51, 102));
        txtBalance.setEnabled(false);
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        btnRequestMoney.setBackground(new java.awt.Color(255, 255, 255));
        btnRequestMoney.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRequestMoney.setForeground(new java.awt.Color(0, 51, 102));
        btnRequestMoney.setText("Request Money");
        btnRequestMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMoneyActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Purchase Requst:");
        jLabel2.setOpaque(true);

        purchaseJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        purchaseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Rate", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(purchaseJTable);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Money Request:");
        jLabel3.setOpaque(true);

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        enterpriseLabel1.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 51, 102));
        enterpriseLabel1.setText("EnterPrise :");

        vallabel.setBackground(new java.awt.Color(255, 255, 255));
        vallabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        vallabel.setForeground(new java.awt.Color(255, 255, 0));
        vallabel.setText("<value>");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Pharmacy Finance Manager Work Area");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRequestMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel1)
                            .addComponent(vallabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRequestMoney)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedrow = purchaseJTable.getSelectedRow();

        if(selectedrow <0)
        {
            
        JOptionPane.showMessageDialog(null,"Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
            PurchaseRequest  purchasereq = (PurchaseRequest)purchaseJTable.getValueAt(selectedrow,2);
            purchasereq.setMedicineRequest("Approved By Pharmacy Financial Manager");

            enterprise.setBalance(enterprise.getBalance()- purchasereq.gettRate());
            txtBalance.setText(String.valueOf(enterprise.getBalance()));

            JOptionPane.showMessageDialog(null, "Money request approved!","Success",JOptionPane.PLAIN_MESSAGE);
            populatePurchaseTable();
            DB4OUtil.getInstance().storeSystem(system);


    }//GEN-LAST:event_btnApproveActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBalanceActionPerformed

    private void btnRequestMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMoneyActionPerformed
        // TODO add your handling code here:
        RequestFinancialPartnerMoneyJPanel requestFinancialPartnerMoneyJPanel = new RequestFinancialPartnerMoneyJPanel(userProcessContainer,enterprise,system);
        userProcessContainer.add("RequestFinancialPartnerMoneyJPanel", requestFinancialPartnerMoneyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestMoneyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnRequestMoney;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable moneyOrderJTable;
    private javax.swing.JTable purchaseJTable;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JLabel vallabel;
    // End of variables declaration//GEN-END:variables
}
