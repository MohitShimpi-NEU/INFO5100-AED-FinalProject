/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FinanceManagerRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Request.MoneyOrder;
import Business.Request.Order;
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
public class FinanceManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RFinancialWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    float sum;
    
    public FinanceManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem busineSystem) {
        initComponents();
        
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.system = busineSystem;
        this.enterprise = enterprise;
        vallabel.setText(enterprise.getName());
        populateMoneyOrderJTable();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        moneyOrderJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        vallabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        moneyOrderJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        moneyOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Money Request", "Enterprise Name", "Status"
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Finance Manager Work Area");
        jLabel6.setOpaque(true);

        vallabel.setBackground(new java.awt.Color(255, 255, 255));
        vallabel.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        vallabel.setForeground(new java.awt.Color(255, 255, 0));
        vallabel.setText("<value>");

        enterpriseLabel1.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 51, 102));
        enterpriseLabel1.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(vallabel))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1)
                    .addComponent(vallabel))
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedrow = moneyOrderJTable.getSelectedRow();

        if (selectedrow <0) {
            
            JOptionPane.showMessageDialog(null, "Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        
            } 
        MoneyOrder order = (MoneyOrder) moneyOrderJTable.getValueAt(selectedrow, 0);
        ViewRequestDetailsJPanel viewReqjPanel =new ViewRequestDetailsJPanel(userProcessContainer,system,order,enterprise);
        userProcessContainer.add("ViewRequestDetails", viewReqjPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable moneyOrderJTable;
    private javax.swing.JLabel vallabel;
    // End of variables declaration//GEN-END:variables

    void populateMoneyOrderJTable() {
        sum=0;
        DefaultTableModel model = (DefaultTableModel) moneyOrderJTable.getModel();
        model.setRowCount(0);
         for(Order or:system.getOrderDirectory().getOrderList()){
            if(or.getStatus().equals("Finished")){
                sum+=or.gettPrice();
            }
        }
        
        for(Network network: system.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for(MoneyOrder money :enterprise.getMoneyOrderDirectory().getMoneyOrderList()){
                    
                    Object[] row = new Object[4];
                    row[0] = money;
                    row[1] = money.getMoney();
                    row[2] = money.getName();
                    row[3] = money.getMoneyOrderStatus();
                    
                    model.addRow(row);
                    if(money.getMoneyOrderStatus().equals("Approved")){
                        sum-=money.getMoney();
                        enterprise.setTotalProfit(sum);
                    }
                }
            }
        }
        
        
    }
}
