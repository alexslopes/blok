/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory2;

import blok.interfaces.Factory.IBackground;
import blok.interfaces.Factory.IBrick;
import blok.interfaces.Factory.IFactory;
import blok.interfaces.Factory.IGround;
import blok.interfaces.IAbstractFactory;
import blok.interfaces.IPlugin;

/**
 *
 * @author alex
 */
public class abstractfactory2 implements IFactory, IAbstractFactory, IPlugin{
    private static abstractfactory2 factory = null;
    
    private abstractfactory2(){
        
    }
    
    public static abstractfactory2 getInstance(){
        if(factory == null)
            factory = new abstractfactory2();
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
