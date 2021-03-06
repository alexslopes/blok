package abstractfactory3;


import blok.interfaces.Factory.IBackground;
import blok.interfaces.Factory.IBrick;
import blok.interfaces.Factory.IFactory;
import blok.interfaces.Factory.IGround;
import blok.interfaces.IAbstractFactory;
import blok.interfaces.IPlugin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class abstractfactory3 implements IFactory, IAbstractFactory, IPlugin{
    private static abstractfactory3 factory = null;
    
    private abstractfactory3(){
        
    }
    
    public static abstractfactory3 getInstance(){
        if(factory == null)
            factory = new abstractfactory3();
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
