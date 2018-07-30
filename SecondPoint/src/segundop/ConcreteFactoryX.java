/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundop;

/**
 *
 * @author hgomez
 */
public class ConcreteFactoryX implements AbstractFactory{
    
    public ProductA createProductA(){  
    
        return new ProductAX();    
    }
    
    public ProductB createProductB(){  
    
        return new ProductBX();    
    }
   
    
}
