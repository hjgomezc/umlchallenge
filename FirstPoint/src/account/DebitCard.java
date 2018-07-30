/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Date;

/**
 *
 * @author hgomez
 */
public class DebitCard extends PaymentMethod{
     private int number;
     //mirar lo de la fecha
     private Issuer issuer;
     private Date expDate;        
     
     java.util.Date fecha = new Date();

    public DebitCard(int number, Issuer issuer, Date expDate) {
        this.number = number;
        this.issuer = issuer;
        this.expDate = expDate;
    }
     
     
     
     @Override
     public void authorize(){
         System.out.println("El pago con la tarjeta de credito esta autorizado");
    }
     
}
