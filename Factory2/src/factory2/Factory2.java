/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory2;

import blok.interfaces.IAbstractProduct1;
import blok.interfaces.IAbstractProduct2;
import blok.interfaces.IFactory;
import blok.interfaces.IPlugin;

/**
 *
 * @author alex
 */
public class Factory2 implements IPlugin, IFactory{

    public IAbstractProduct1 createProduct1(){
        return new Product1();
    }
    
    public IAbstractProduct2 createProduct2(){
        return new Product2();
    }
    
}
