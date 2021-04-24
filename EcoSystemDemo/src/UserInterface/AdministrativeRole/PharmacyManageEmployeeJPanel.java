/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmacyManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyManageEmployeeJPanel
     */
   
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public PharmacyManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir,EcoSystem ecosystem,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populateOrganizationEmpComboBox();
        populateTable((Organization)organizationEmpJComboBox.getSelectedItem());
    }
    
   private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = organization;
            row[2] = employee;
            model.addRow(row);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        del = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        create.setForeground(new java.awt.Color(0, 51, 102));
        create.setText("Create Employee");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 51, 102));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name:");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, -1));

        nametxt.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 51, 102));
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 152, -1));

        organizationEmpJComboBox.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        organizationEmpJComboBox.setForeground(new java.awt.Color(0, 51, 102));
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 220, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Employee Type:");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 120, -1));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Employee Type", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 550, 92));

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        del.setForeground(new java.awt.Color(0, 51, 102));
        del.setText("Delete Employee");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Employee Name List");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

 Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nametxt.getText();

        if(name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the name!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
            for(Employee employee:organization.getEmployeeDirectory().getEmployeeList()){
                if(employee.getName().equals(name)){
                    JOptionPane.showMessageDialog(null, "Employee already exist!","Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
          
                organization.getEmployeeDirectory().createEmployee(name);
                populateTable(organization);
                nametxt.setText("");
                JOptionPane.showMessageDialog(null, "Employee created successfully","Success",JOptionPane.PLAIN_MESSAGE);
                DB4OUtil.getInstance().storeSystem(ecosystem);
                
        

    }//GEN-LAST:event_createActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        int selectedrow = organizationJTable.getSelectedRow();

        if(selectedrow<0)
        {
             JOptionPane.showMessageDialog(null,"Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
        
            Employee  employee = (Employee)organizationJTable.getValueAt(selectedrow,1);

            ecosystem.getEmployeeDirectory().getEmployeeList().remove(employee);

            JOptionPane.showMessageDialog(null, "Employess deleted successfully","Success",JOptionPane.PLAIN_MESSAGE);
            Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
            populateTable(organization);
       
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_delActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton create;
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
