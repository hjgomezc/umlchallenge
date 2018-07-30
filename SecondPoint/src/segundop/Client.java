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
public class Client {
    
    // Revisar esto
        AbstractFactory concreteFactoryX=new ConcreteFactoryX();
        AbstractFactory concreteFactoryY=new ConcreteFactoryY();
        ProductA ax = concreteFactoryX.createProductA();
        ProductB bx = concreteFactoryX.createProductB();
        ProductA ay= concreteFactoryY.createProductA();
        ProductB by= concreteFactoryY.createProductB();
  
    
}
