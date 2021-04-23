/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author negis,shimpim,rahul
 */
public class OrganizationDirectory {
 
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.PharmacyManager.getValue())){
            organization = new PharmacyManagerOrganization();
            organizationList.add(organization);
        }
        
        if (type.getValue().equals(Organization.Type.DeliveryPartnerManager.getValue())){
            organization = new DeliveryPartnerManagerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.DeliveryMan.getValue())){
            organization = new DeliveryManOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.FinanceManager.getValue())){
            organization = new FinanceManagerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.FinancialPartnerManager.getValue())){
            organization = new FinancialPartnerManagerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.PharmacyPurchaseManager.getValue())){
            organization = new MedicinePurchaseOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.PharmacyFinancialManager.getValue())){
            organization = new PharmacyFinancialManagerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.PharmaManager.getValue())){
            organization = new PharmaManagerOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}