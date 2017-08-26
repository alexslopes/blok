/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod1;

import blok.interfaces.Factory.IFactory;
import blok.interfaces.IFactoryMethod;
import blok.interfaces.IPlayer;
import blok.interfaces.IPlugin;

/**
 *
 * @author alex
 */
public class factorymethod1 implements IPlugin, IFactory, IFactoryMethod{
    private static factorymethod1 factory = null;
    
    private factorymethod1(){
        
    }
    
    public static factorymethod1 getInstance(){
        if(factory == null)
            factory = new factorymethod1();
        return factory;
    }
    
    @Override
    public IPlayer getPlayer() {
        return new Player();
    }

    
    
}
