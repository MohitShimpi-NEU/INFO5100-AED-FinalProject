/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprice;
import Business.Network.Network;
import Business.Request.Medicine;
import Business.Request.Order;
import Business.Request.OrderDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
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
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkArea
     */
    private EcoSystem system;
    private JPanel userProcessContainer;
    private OrderDirectory orderDirectory;
    private List<Medicine> medlist;
    private float total;
    private UserAccount account;
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.orderDirectory =system.getOrderDirectory();
        this.medlist = new ArrayList<>();
        valuetxtbox.setText(account.getUsername());
        total = 0;
        populateNetCob();
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
        ordertab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pharmacombo = new javax.swing.JComboBox<>();
        btnOrder = new javax.swing.JButton();
        vieworder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        areacombo = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addrs = new javax.swing.JTextField();
        del = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        valuetxtbox = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ordertab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Medicines", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ordertab);
        if (ordertab.getColumnModel().getColumnCount() > 0) {
            ordertab.getColumnModel().getColumn(0).setResizable(false);
            ordertab.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose a pharmacy");
        jLabel1.setOpaque(true);

        pharmacombo.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        pharmacombo.setForeground(new java.awt.Color(0, 51, 102));
        pharmacombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmacombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacomboActionPerformed(evt);
            }
        });

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(0, 51, 102));
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        vieworder.setBackground(new java.awt.Color(255, 255, 255));
        vieworder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        vieworder.setForeground(new java.awt.Color(0, 51, 102));
        vieworder.setText("View Order History");
        vieworder.setBorder(null);
        vieworder.setOpaque(false);
        vieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieworderActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choose a area");
        jLabel2.setOpaque(true);

        areacombo.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        areacombo.setForeground(new java.awt.Color(0, 51, 102));
        areacombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        areacombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areacomboActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(0, 51, 102));
        add.setText("Add to Cart");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        cartTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Medicines", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartTab);
        if (cartTab.getColumnModel().getColumnCount() > 0) {
            cartTab.getColumnModel().getColumn(0).setResizable(false);
            cartTab.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Cost:");
        jLabel3.setOpaque(true);

        cost.setEditable(false);
        cost.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        cost.setForeground(new java.awt.Color(0, 51, 102));
        cost.setEnabled(false);
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address:");
        jLabel4.setOpaque(true);

        addrs.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        addrs.setForeground(new java.awt.Color(0, 51, 102));

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        del.setForeground(new java.awt.Color(0, 51, 102));
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your Cart:");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Welcome,");
        jLabel6.setOpaque(true);

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        valuetxtbox.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        valuetxtbox.setForeground(new java.awt.Color(102, 0, 102));
        valuetxtbox.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(valuetxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vieworder, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(areacombo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pharmacombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addrs, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jSeparator1)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(vieworder)
                        .addComponent(valuetxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(areacombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(pharmacombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del))
                .addGap(18, 18, 18)
                .addComponent(add)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateNetCob(){
        
        areacombo.removeAllItems();
        for (Network network : system.getNetworkList()) {
            areacombo.addItem(network);
        }
    }
    private void populatepharmaCob(Network network){
        pharmacombo.removeAllItems();
        for (Enterprise entr : network.getEnterpriseDirectory().getEnterpriseList()) {
            if(entr.getEnterpriseType().getValue().equals("Pharmacy"))
            pharmacombo.addItem(entr);
        }
    }
    private void populateMenutable(Enterprise enterprise){
        DefaultTableModel model = (DefaultTableModel) ordertab.getModel();
        model.setRowCount(0);
        for(Medicine medicine: enterprise.getMenu().getMedicineList()){
            Object[] row = new Object[2];
            row[0] = medicine;
            row[1] = medicine.getPrice();
            model.addRow(row);
        }
        
    }
     private void populateCartTable(){
        DefaultTableModel model = (DefaultTableModel) cartTab.getModel();
        model.setRowCount(0);
        
        for(Medicine medcine: medlist){
            Object[] row = new Object[2];
            row[0] = medcine;
            row[1] = medcine.getPrice();
            model.addRow(row);
            
            
        }
        
        cost.setText(String.valueOf(total));
        
        
    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = ordertab.getSelectedRow();
        if (selectedRow<0) {
               JOptionPane.showMessageDialog(null, "Please select a item!","Warning",JOptionPane.WARNING_MESSAGE);
               return;
        }       
         
        
            Medicine medicine= (Medicine) ordertab.getValueAt(selectedRow, 0);
            medlist.add(medicine);
            total+=medicine.getPrice();
            populateCartTable();
            DB4OUtil.getInstance().storeSystem(system);
                
               
           
        
        
    }//GEN-LAST:event_addActionPerformed

    private void areacomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areacomboActionPerformed
        // TODO add your handling code here:
        Network network = (Network) areacombo.getSelectedItem();
        if (network != null){
            populatepharmaCob(network);
        }
        
    }//GEN-LAST:event_areacomboActionPerformed

    private void pharmacomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacomboActionPerformed
        // TODO add your handling code here:
        PharmacyEnterprice enterprise = (PharmacyEnterprice) pharmacombo.getSelectedItem();
        if (enterprise != null){
            populateMenutable(enterprise);
        }
        
    }//GEN-LAST:event_pharmacomboActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        Network network = (Network) areacombo.getSelectedItem();
        PharmacyEnterprice pharmaenterprise = (PharmacyEnterprice) pharmacombo.getSelectedItem();
        
        DefaultTableModel model = (DefaultTableModel) cartTab.getModel(); 
        String address =addrs.getText();
      
        if(total==0){
            JOptionPane.showMessageDialog(null, "Your Cart is Empty!","Warning",JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        if(address.isEmpty()){
            JOptionPane.showMessageDialog(null, "Address field empty!","Warning",JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        Order or = system.getOrderDirectory().AddOrder();
        or.setNetwork(network);
        or.setAdd(address);
        or.settPrice(total);
        or.setRName(pharmaenterprise.getName());
        or.setCName(account.getUsername());
        or.setMedicineTotal(medlist);
        or.setStatus("Ordered");
        JOptionPane.showMessageDialog(null, "Your Order is placed successfully","Success",JOptionPane.PLAIN_MESSAGE);
        
       DB4OUtil.getInstance().storeSystem(system);
        addrs.setText("");
        cost.setText("");
        total=0;
         model.setRowCount(0);
        medlist= new ArrayList<>();
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void vieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieworderActionPerformed
        // TODO add your handling code here:
        ViewOrderPanel ViewOrderPanel =new ViewOrderPanel(userProcessContainer,system, account);
        userProcessContainer.add("ViewOrderJPanel",ViewOrderPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_vieworderActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        int selectedrow = cartTab.getSelectedRow();

        if(selectedrow<0)
        {
            
          JOptionPane.showMessageDialog(null,"Please select a item!","Warning",JOptionPane.WARNING_MESSAGE);
          return;
        }
        Medicine  medicine = (Medicine)cartTab.getValueAt(selectedrow,0);

            medlist.remove(medicine);
            total-=medicine.getPrice();

            JOptionPane.showMessageDialog(null, "Item deleted successfully","Success",JOptionPane.PLAIN_MESSAGE);
 DB4OUtil.getInstance().storeSystem(system);
        populateCartTable();
    }//GEN-LAST:event_delActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField addrs;
    private javax.swing.JComboBox<Object> areacombo;
    private javax.swing.JButton btnOrder;
    private javax.swing.JTable cartTab;
    private javax.swing.JTextField cost;
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable ordertab;
    private javax.swing.JComboBox<Object> pharmacombo;
    private javax.swing.JLabel valuetxtbox;
    private javax.swing.JButton vieworder;
    // End of variables declaration//GEN-END:variables
}