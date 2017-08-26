/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod2;

import blok.interfaces.Factory.IFactory;
import blok.interfaces.IFactoryMethod;
import blok.interfaces.IPlayer;
import blok.interfaces.IPlugin;

/**
 *
 * @author alex
 */
public class factorymethod2 implements IPlugin, IFactory, IFactoryMethod{
private static factorymethod2 factory = null;
    
    private factorymethod2(){
        
    }
    
    public static factorymethod2 getInstance(){
        if(factory == null)
            factory = new factorymethod2();
        return factory;
    }
    
    @Override
    public IPlayer getPlayer() {
        return new Player();
    }
    
}
