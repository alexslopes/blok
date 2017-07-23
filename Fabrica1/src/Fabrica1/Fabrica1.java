/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica1;

import blok.interfaces.AbstractFactory.IBackground;
import blok.interfaces.AbstractFactory.IBrick;
import blok.interfaces.AbstractFactory.IFactory;
import blok.interfaces.AbstractFactory.IGround;
import blok.interfaces.IPlugin;

/**
 *
 * @author alex
 */
public class Fabrica1 implements IFactory, IPlugin{

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
