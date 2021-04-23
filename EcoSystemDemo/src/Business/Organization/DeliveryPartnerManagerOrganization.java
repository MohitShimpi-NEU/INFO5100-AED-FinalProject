/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DPAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author negis,shimpim,rahul
 */
public class DeliveryPartnerManagerOrganization extends Organization {
    public DeliveryPartnerManagerOrganization() {
        super(Organization.Type.DeliveryPartnerManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DPAdminRole());
        return roles;
    }
}