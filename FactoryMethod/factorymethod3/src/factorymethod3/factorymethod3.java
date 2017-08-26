/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod3;

import blok.interfaces.Factory.IFactory;
import blok.interfaces.IFactoryMethod;
import blok.interfaces.IPlayer;
import blok.interfaces.IPlugin;

/**
 *
 * @author alex
 */
public class factorymethod3 implements IPlugin, IFactory, IFactoryMethod{
    private static factorymethod3 factory = null;
    
    private factorymethod3(){
        
    }
    
    public static factorymethod3 getInstance(){
        if(factory == null)
            factory = new factorymethod3();
        return factory;
    }
    @Override
    public IPlayer getPlayer() {
        return new Player();
    }
    
}
