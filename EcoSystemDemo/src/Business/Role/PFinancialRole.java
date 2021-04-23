/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;

import UserInterface.FinanceManagerRole.FinanceManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PFinancialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinanceManagerWorkAreaJPanel(userProcessContainer,account, organization, enterprise,business);
    }
    
}