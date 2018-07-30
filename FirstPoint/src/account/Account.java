/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author hgomez
 */
public class Account {
private int id;
private Customer customer;  
private AccountStatus status;
private ShoppingCart cart;
private List<Address> addresses;
private List<PaymentMethod> methods;

    public Account(int id, Customer customer, AccountStatus status, ShoppingCart cart, List<Address> addresses, List<PaymentMethod> methods) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.cart = cart;
        this.addresses = addresses;
        this.methods = methods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<PaymentMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<PaymentMethod> methods) {
        this.methods = methods;
    }



public void addMethod(PaymentMethod p){
   methods.add(p);
}

public void addAddress(Address a){
   addresses.add(a);
}

public void destroyMethods(){
    methods= new ArrayList<>();
}

public void destroyAddresses(){
    addresses=new ArrayList<>();

}    


  public void printda(){
      System.out.println("Los datos del usuario son:");
      System.out.println("Identificacion:" +id);
      //System.out.println("ppppp:" +name);
    } 

}
