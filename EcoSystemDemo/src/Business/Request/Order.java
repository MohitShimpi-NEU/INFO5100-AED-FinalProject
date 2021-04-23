/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.Network.Network;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author negis,shimpim,rahul
 */
public class Order {
    private String RName;
    private String DName;
    private String CName;
    private float tPrice;
    private String time;
    private String status;
    private List<Medicine> medicineTotal; 
    private String add;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Order() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time =  df.format(new Date());
        medicineTotal = new ArrayList<>();
    }

    public List<Medicine> getMedicineTotal() {
        return medicineTotal;
    }

    public void setMedicineTotal(List<Medicine> medicineTotal) {
        this.medicineTotal = medicineTotal;
    }
    

    public String getRName() {
        return RName;
    }

    public void setRName(String RName) {
        this.RName = RName;
    }

    public String getDName() {
        return DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public float gettPrice() {
        return tPrice;
    }

    public void settPrice(float tPrice) {
        this.tPrice = tPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override 
    public String toString(){
        return time;
    }
    
    
}
