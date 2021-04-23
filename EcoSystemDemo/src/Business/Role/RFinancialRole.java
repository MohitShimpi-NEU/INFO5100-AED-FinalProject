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

import UserInterface.PharmacyFinanceManagerRole.PharmacyFinanceManagerWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author negis,shimpim,rahul
 */
public class RFinancialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyFinanceManagerWorkAreaJPanel(userProcessContainer,account, organization, enterprise,business);
    }
    
}
