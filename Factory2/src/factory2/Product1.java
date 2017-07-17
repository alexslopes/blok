/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory2;

import blok.interfaces.IAbstractProduct1;

/**
 *
 * @author alex
 */
public class Product1 implements IAbstractProduct1{

    @Override
    public void sayHello() {
        System.out.println("Produto 1 da fábrica 2");    
    }
    
}
