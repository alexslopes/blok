/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorescudo;

import blok.interfaces.IPlugin;
import decorator.Decorator;
import decorator.IComponent;

/**
 *
 * @author alex
 */
public class DecoratorEscudo extends Decorator implements IPlugin{

    public DecoratorEscudo(){
        
    }
    
    @Override
    public void desenhar() {
        component.desenhar();
        System.err.println("Escudo");
        return;
    }
}
