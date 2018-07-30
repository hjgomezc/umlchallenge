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
public class Address {
    private int id;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String country;
    private boolean billingAddres;

    public Address(int id, String lineOne, String lineTwo, String city, String country, boolean billingAddres) {
        this.id = id;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.country = country;
        this.billingAddres = billingAddres;
    }

    
    
    public String getAddres(){
    //String addres = lineOne +' '+ lineTwo + city + '(' + country + ')';   
    return lineOne +' '+ lineTwo + "," +city + "(" + country + ")" ;      
    }
    }
    
    

