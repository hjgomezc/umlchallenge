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
public class CreditCard extends PaymentMethod{
    private double number;
    //mirar lo de la fecha
    private Date expDate;
    private int maxInstallments;
    private Issuer issuer;
    
    java.util.Date fecha = new Date();

    public CreditCard(double number, Date expDate, int maxInstallments, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.maxInstallments = maxInstallments;
        this.issuer = issuer;
    }
    
    
    
    @Override
    public void authorize(){
        System.out.println("El pago con tarjeta de credito esta autorizado");
    }
    
    
}
