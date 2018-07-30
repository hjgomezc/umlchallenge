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
public class ShoppingCart {
    //private ArrayList<LineItem> items= new ArrayList<>(); Con esto se instancia

    private List<LineItem> items;

    public ShoppingCart(List<LineItem> items) {
        this.items = items;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void addItem(LineItem i) {
        items.add(i);
    }

    public void cleanCart() {
        items = new ArrayList<>();
        System.out.println("Limpiar carro");
    }
}
