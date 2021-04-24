/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.PharmacyManagerOrganization;
import Business.Request.Medicine;
import Business.Request.ModifyMedicinesRequest;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PharmacyManagerOrganization cookOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

  
    public ManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PharmacyManagerOrganization cookOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.cookOrganization = cookOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        
        populateMenuTable();
        populatemodifyMenuJTable();
    }
    
    void populateMenuTable(){
        DefaultTableModel model = (DefaultTableModel) menuJTable.getModel();
        model.setRowCount(0);
        for (Medicine d : enterprise.getMenu().getMedicineList()){
            Object[] row = new Object[2];
            row[0] = d;
            row[1] = d.getPrice();
            model.addRow(row);
        }
    }
    
    void populatemodifyMenuJTable(){
        DefaultTableModel model = (DefaultTableModel) modifyMenuJTable.getModel();
        model.setRowCount(0);
        for (ModifyMedicinesRequest m : enterprise.getModifyDishesRequestDirectory().getModifyMenuRequestList()){
            Object[] row = new Object[5];
            row[0] = m.getMedicine().getMedicineName();
            row[1] = m.getoPrice();
            row[2] = m.getFp();
            row[3] = m;
            row[4] = m.getModifyStatus();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        modifyMenuJTable = new javax.swing.JTable();
        btnModifyMenu = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        modifyMenuJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        modifyMenuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Original Price", "Modified Price", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(modifyMenuJTable);
        if (modifyMenuJTable.getColumnModel().getColumnCount() > 0) {
            modifyMenuJTable.getColumnModel().getColumn(0).setResizable(false);
            modifyMenuJTable.getColumnModel().getColumn(1).setResizable(false);
            modifyMenuJTable.getColumnModel().getColumn(2).setResizable(false);
            modifyMenuJTable.getColumnModel().getColumn(3).setResizable(false);
            modifyMenuJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnModifyMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnModifyMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnModifyMenu.setForeground(new java.awt.Color(0, 51, 102));
        btnModifyMenu.setText("Modify Request");
        btnModifyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyMenuActionPerformed(evt);
            }
        });

        valueLabel.setBackground(new java.awt.Color(255, 255, 255));
        valueLabel.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 0));
        valueLabel.setText("<value>");

        enterpriseLabel.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 51, 102));
        enterpriseLabel.setText("EnterPrise :");

        menuJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuJTable);
        if (menuJTable.getColumnModel().getColumnCount() > 0) {
            menuJTable.getColumnModel().getColumn(0).setResizable(false);
            menuJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modify Menu Request:");
        jLabel2.setOpaque(true);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 51, 102));
        btnAdd.setText("Add Item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 51, 102));
        btnDelete.setText("Delete Item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Pharmacy Manager");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnModifyMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyMenuActionPerformed
        // TODO add your handling code here:
        int selectedrow = menuJTable.getSelectedRow();

        if (selectedrow >= 0) {
            Medicine d = (Medicine) menuJTable.getValueAt(selectedrow, 0);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestModifyMenuJPanel", new RequestModifyListJPanel(userProcessContainer, userAccount, enterprise, d, business));
            layout.next(userProcessContainer);
        } else
        JOptionPane.showMessageDialog(null, "Please select any row");
        
    }//GEN-LAST:event_btnModifyMenuActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddMedicinesJPanel ad = new AddMedicinesJPanel(userProcessContainer,enterprise.getMenu(),business,enterprise);
        userProcessContainer.add("AddDishJPanel", ad);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        //populateTable1();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = menuJTable.getSelectedRow();

        if (selectedrow >= 0) {
            Medicine d = (Medicine) menuJTable.getValueAt(selectedrow, 0);
            enterprise.getMenu().deleteDish(d);
            DB4OUtil.getInstance().storeSystem(business);
            JOptionPane.showMessageDialog(null, "Organization has been deleted");
            populateMenuTable();
        } else
        JOptionPane.showMessageDialog(null, "Please select any row");
    
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModifyMenu;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuJTable;
    private javax.swing.JTable modifyMenuJTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
