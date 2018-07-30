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
 * @author hjgom
 */
public class main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Account ac=new Account(1,new Customer(1, "Heiner" , 31128 , "hjgomezc" , "claveee" ), AccountStatus.ACTIVE, new ShoppingCart(new ArrayList<>()), new ArrayList<>(), new ArrayList<>());
          
         ac.getCart().addItem(new LineItem(2,3200,new Product("CO-1","Coca cola","Refreshing soda")));
       
        System.out.println("Name:"+ac.getCustomer().getName());
        System.out.println("Contact:"+ac.getCustomer().getContact());
        System.out.println("UserName:"+ac.getCustomer().getName());
        System.out.println("Password:"+ac.getCustomer().getPassword());
        System.out.println("Stataus:"+ac.getStatus()); 
        System.out.println("\nShoopping Cart:"); 
        
                 
        for(int i=0;i<ac.getCart().getItems().size();i++)
            {
                System.out.print("Product: "+ac.getCart().getItems().get(i).getProduct().getName());
                System.out.print("\nQuantity: "+ac.getCart().getItems().get(i).getQuantity());
                System.out.print("\nPrice: "+ac.getCart().getItems().get(i).getPrice());
                
              
                
            }
      
}  
}
        
 