/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyPurchaseManagerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.MedicinePurchaseOrganization;
import Business.Request.PurchaseRequest;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmacyPurchaseManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyPurchaseManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private MedicinePurchaseOrganization purchaseOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public PharmacyPurchaseManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, MedicinePurchaseOrganization purchaseOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.purchaseOrganization = purchaseOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel1.setText(enterprise.getName());
        
        populatePurchaseTable();
    }

    void populatePurchaseTable(){
        DefaultTableModel model = (DefaultTableModel) purchaseJTable.getModel();
        model.setRowCount(0);
        for (PurchaseRequest p : enterprise.getPurchaseRequestDirectory().getPurchaseRequestList()){
            Object[] row = new Object[4];
            row[0] = p.getMedicineName();
            row[1] = p.gettRate();
            row[2] = p;
            row[3] = p.getMedicineRequest();
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
        purchaseJTable = new javax.swing.JTable();
        btnPurchase = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane1.setViewportView(purchaseJTable);
        if (purchaseJTable.getColumnModel().getColumnCount() > 0) {
            purchaseJTable.getColumnModel().getColumn(0).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(1).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(2).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnPurchase.setBackground(new java.awt.Color(255, 255, 255));
        btnPurchase.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(0, 51, 102));
        btnPurchase.setText("Request Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        valueLabel1.setBackground(new java.awt.Color(255, 255, 255));
        valueLabel1.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        valueLabel1.setForeground(new java.awt.Color(255, 255, 0));
        valueLabel1.setText("<value>");

        enterpriseLabel1.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 51, 102));
        enterpriseLabel1.setText("EnterPrise :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Pharmacy Purchase Manager");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPurchase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnPurchase)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PurchaseMedicineRequestJPanel", new PurchaseMedicineRequestJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchase;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable purchaseJTable;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
