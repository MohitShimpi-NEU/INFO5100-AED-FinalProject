/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.MedicinePurchaseOrganization;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;

import UserInterface.PharmacyPurchaseManagerRole.PharmacyPurchaseManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PurchaseRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyPurchaseManagerWorkAreaJPanel(userProcessContainer,account, (MedicinePurchaseOrganization)organization, enterprise,business);
    }
    
}
