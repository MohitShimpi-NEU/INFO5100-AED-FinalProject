/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author negis,shimpim,rahul
 */
public class MedicineList {
    private List<Medicine> medicineList;
    public MedicineList(){
        medicineList = new ArrayList<Medicine>();
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMenu(List<Medicine> menu) {
        this.medicineList = menu;
    }
    public Medicine updateMenu(){
        Medicine dish = new Medicine();
        medicineList.add(dish);
        return dish;
    }
    public void deleteDish(Medicine dish)
    {
        medicineList.remove(dish);
    }
}
