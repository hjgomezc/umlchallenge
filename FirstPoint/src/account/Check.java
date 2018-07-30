/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author hgomez
 */
public class Check extends PaymentMethod {
    private int number;
    private int bankld;
    private String holder;

    public Check(int number, int bankld, String holder) {
        this.number = number;
        this.bankld = bankld;
        this.holder = holder;
    }
    
    
    @Override
    public void authorize(){
        System.out.println("El pago con el cheque esta autorizado");
        
    }
    
       
    
}
