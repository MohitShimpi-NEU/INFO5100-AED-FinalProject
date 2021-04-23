 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.PharmacyManagerOrganization;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Request.MedicineList;
import Business.Request.ModifyMedicinesRequestDirectory;
import Business.Request.MoneyOrderDirectory;
import Business.Request.OrderDirectory;
import Business.Request.PurchaseRequestDirectory;

/**
 *
 * @author negis,shimpim,rahul
 */
public abstract class Enterprise extends Organization{
    private OrderDirectory orderDirectory;
    private float totalProfit;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private MedicineList menu;
    ModifyMedicinesRequestDirectory modifyDishesRequestDirectory;
    PurchaseRequestDirectory purchaseRequestDirectory;
    MoneyOrderDirectory moneyOrderDirectory;
    private float balance;

    public MoneyOrderDirectory getMoneyOrderDirectory() {
        return moneyOrderDirectory;
    }

    public void setMoneyOrderDirectory(MoneyOrderDirectory moneyOrderDirectory) {
        this.moneyOrderDirectory = moneyOrderDirectory;
    }
    public float getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(float totalProfit) {
        this.totalProfit = totalProfit;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Pharmacy("Pharmacy"),Finance("Finance Partner"),DeliveryPartner("Delivery Partner");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        menu = new MedicineList();
        modifyDishesRequestDirectory = new ModifyMedicinesRequestDirectory();
        purchaseRequestDirectory = new PurchaseRequestDirectory();
        orderDirectory = new OrderDirectory();
        balance = 10000;
        moneyOrderDirectory = new MoneyOrderDirectory();
        //cookOrganizationDirectory = new CookOrganizationDirectory();
    }

//    public CookOrganizationDirectory getCookOrganizationDirectory() {
//        return cookOrganizationDirectory;
//    }
//
//    public void setCookOrganizationDirectory(CookOrganizationDirectory cookOrganizationDirectory) {
//        this.cookOrganizationDirectory = cookOrganizationDirectory;
//    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    
    public ModifyMedicinesRequestDirectory getModifyDishesRequestDirectory() {
        return modifyDishesRequestDirectory;
    }

    public void setModifyDishesRequestDirectory(ModifyMedicinesRequestDirectory modifyDishesRequestDirectory) {
        this.modifyDishesRequestDirectory = modifyDishesRequestDirectory;
    }

    public PurchaseRequestDirectory getPurchaseRequestDirectory() {
        return purchaseRequestDirectory;
    }

    public void setPurchaseRequestDirectory(PurchaseRequestDirectory purchaseRequestDirectory) {
        this.purchaseRequestDirectory = purchaseRequestDirectory;
    }

    public MedicineList getMenu() {
        return menu;
    }

    public void setMenu(MedicineList menu) {
        this.menu = menu;
    }
    
    
}