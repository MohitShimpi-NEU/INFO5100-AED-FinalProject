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
public class ModifyMedicinesRequest {
    private Medicine medicine;
    private String modifyStatus;
    private String time;
    private float fp;
    private float oPrice;

    public float getoPrice() {
        return oPrice;
    }

    public void setoPrice(float oPrice) {
        this.oPrice = oPrice;
    }

    public float getFp() {
        return fp;
    }

    public void setFp(float fp) {
        this.fp = fp;
    }

   

    public ModifyMedicinesRequest(Medicine dish){
        this.medicine = dish;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time =  df.format(new Date());
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
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
