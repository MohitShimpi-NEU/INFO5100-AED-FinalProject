/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PurchaseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author negis,shimpim,rahul
 */
public class MedicinePurchaseOrganization extends Organization{
  public MedicinePurchaseOrganization() {
        super(Organization.Type.PharmacyPurchaseManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PurchaseRole());
        return roles;
    }   
}
