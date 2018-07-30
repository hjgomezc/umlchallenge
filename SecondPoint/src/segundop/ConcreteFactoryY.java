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
public class ConcreteFactoryY implements AbstractFactory{
    
    public ProductA createProductA(){  
    
        return new ProductAY();    
    }
    
    public ProductB createProductB(){  
    
        return new ProductBY();    
    }
    
    
}
