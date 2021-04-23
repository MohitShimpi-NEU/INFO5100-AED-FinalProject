/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmaManagerOrganization extends Organization{
  public PharmaManagerOrganization() {
        super(Organization.Type.PharmaManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RManagerRole());
        return roles;
    }   
}
