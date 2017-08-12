/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory1;

import blok.interfaces.Factory.IBackground;
import blok.interfaces.Factory.IBrick;
import blok.interfaces.Factory.IFactory;
import blok.interfaces.Factory.IGround;
import blok.interfaces.IPlugin;
import blok.interfaces.IAbstractFactory;

/**
 *
 * @author alex
 */
public class abstractfactory1 implements IFactory, IAbstractFactory, IPlugin{
    private static abstractfactory1 factory = null;
    
    private abstractfactory1(){
        
    }
    
    public static abstractfactory1 getInstance(){
        if(factory == null)
            factory = new abstractfactory1();
        return factory;
    }
    
    @Override
    public IBackground getBackground() {
        return new Background();
    }

    @Override
    public IBrick getBrick() {
        return new Brick();
    }

    @Override
    public IGround getGround() {
        return new Ground();
    }

    
}
