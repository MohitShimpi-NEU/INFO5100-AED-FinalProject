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
public class ModifyMedicinesRequestDirectory {
    private List<ModifyMedicinesRequest> modifyMenuRequestList;

    public ModifyMedicinesRequestDirectory() {
        modifyMenuRequestList = new ArrayList<ModifyMedicinesRequest>();
    }

    public List<ModifyMedicinesRequest> getModifyMenuRequestList() {
        return modifyMenuRequestList;
    }

    public void setModifyMenuRequestList(List<ModifyMedicinesRequest> modifyMenuRequestList) {
        this.modifyMenuRequestList = modifyMenuRequestList;
    }
    
    public ModifyMedicinesRequest createModifyDishesRequest(Medicine dish){
        ModifyMedicinesRequest modifyDishesRequest = new ModifyMedicinesRequest(dish);
        modifyMenuRequestList.add(modifyDishesRequest);
        return modifyDishesRequest;
    }
}