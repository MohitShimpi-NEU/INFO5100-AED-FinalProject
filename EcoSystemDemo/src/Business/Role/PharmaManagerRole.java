/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.PharmacyManagerOrganization;
import Business.Organization.Organization;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.PharmacyManagerRole.ManagerWorkAreaJPanel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmaManagerRole extends Role {
    
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManagerWorkAreaJPanel(userProcessContainer,account, (PharmacyManagerOrganization)organization, enterprise,business); //To change body of generated methods, choose Tools | Templates.
    }
}
