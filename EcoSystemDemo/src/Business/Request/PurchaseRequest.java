/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author negis,shimpim,rahul
 */
public class PurchaseRequest {
    private String medicineName;
    private float tRate;
    private String medicineRequest;
    private String time;
    
    public PurchaseRequest(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time =  df.format(new Date());
    }
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public float gettRate() {
        return tRate;
    }

    public void settRate(float tRate) {
        this.tRate = tRate;
    }


    public String getMedicineRequest() {
        return medicineRequest;
    }

    public void setMedicineRequest(String medicineRequest) {
        this.medicineRequest = medicineRequest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    @Override 
    public String toString(){
        return time;
    }
}
