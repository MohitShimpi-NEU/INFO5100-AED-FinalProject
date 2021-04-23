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
public class MoneyOrder {
    //private OrderDirectory orderDirectory;
    //private Order order;
    private String moneyOrderStatus;
    private String time;
    //private OrderDirectory orderDirectory;
    private String Name;
    private float money;
    
    private float totalProfit;

    public float getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(float totalProfit) {
        this.totalProfit = totalProfit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
  
    

    public MoneyOrder() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time =  df.format(new Date());
        this.Name=null;
        
    }

    

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
    
    public String getMoneyOrderStatus() {
        return moneyOrderStatus;
    }

    public void setMoneyOrderStatus(String moneyOrderStatus) {
        this.moneyOrderStatus = moneyOrderStatus;
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
