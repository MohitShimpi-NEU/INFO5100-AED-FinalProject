/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Request.MedicineList;
import Business.Request.ModifyMedicinesRequestDirectory;
import Business.Request.PurchaseRequestDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PharmacyEnterprice extends Enterprise{
    private MedicineList menu;
    ModifyMedicinesRequestDirectory modifyDishesRequestDirectory;
    PurchaseRequestDirectory purchaseRequestDirectory;
    public PharmacyEnterprice(String name){
        super(name,Enterprise.EnterpriseType.Pharmacy);
        menu = new MedicineList();
        modifyDishesRequestDirectory = new ModifyMedicinesRequestDirectory();
        purchaseRequestDirectory = new PurchaseRequestDirectory();
    }

    public MedicineList getMenu() {
        return menu;
    }

    public void setMenu(MedicineList menu) {
        this.menu = menu;
    }

    public ModifyMedicinesRequestDirectory getModifymedcineRequestDirectory() {
        return modifyDishesRequestDirectory;
    }

    public void setModifymedcineRequestDirectory(ModifyMedicinesRequestDirectory modifyDishesRequestDirectory) {
        this.modifyDishesRequestDirectory = modifyDishesRequestDirectory;
    }

    public PurchaseRequestDirectory getPurchaseRequestDirectory() {
        return purchaseRequestDirectory;
    }

    public void setPurchaseRequestDirectory(PurchaseRequestDirectory purchaseRequestDirectory) {
        this.purchaseRequestDirectory = purchaseRequestDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
