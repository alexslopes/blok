/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory2;

import blok.interfaces.IAbstractProduct2;

/**
 *
 * @author alex
 */
public class Product2 implements IAbstractProduct2{

    @Override
    public void sayHi() {
        System.out.println("Produto 2 da fábrica 2");
    }
    
}
