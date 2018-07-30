/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hgomez
 */
public class Order {
 private int id;
 private OrderStatus status;
 private String shippingAddres;
 private double total;
 private List<LineItem> items;
 
//Order objeto = new Order();

    public Order(int id, OrderStatus status, String shippingAddres, double total, List<LineItem> items) {
        this.id = id;
        this.status = status;
        this.shippingAddres = shippingAddres;
        this.total = total;
        this.items = items;
    }

 public void addItem(LineItem i){
  items.add(i);
 }
//public void addItem(LineItem i){items.add(i);}
    public double getTotal() {
        
        for (int i=0; i<items.size();i++){
        total= total+ items.get(i).getQuantity()*items.get(i).getPrice();
        }
        
         return total;
    }
 
    public void setTotal(double total) {
        //this.items.size();
        //this.total = this.total + this.items.get(i);
        this.total = total;
    }
  
    
    
 
 
}
