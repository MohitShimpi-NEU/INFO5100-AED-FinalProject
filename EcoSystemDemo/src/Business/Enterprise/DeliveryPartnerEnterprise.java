/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author negis,shimpim,rahul
 */
public class DeliveryPartnerEnterprise extends Enterprise{
    public DeliveryPartnerEnterprise(String name){
        super(name,Enterprise.EnterpriseType.DeliveryPartner);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
