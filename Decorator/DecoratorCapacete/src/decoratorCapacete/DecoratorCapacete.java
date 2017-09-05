package decoratorCapacete;


import blok.interfaces.IPlugin;
import decorator.Decorator;
import decorator.IComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class DecoratorCapacete extends Decorator implements IPlugin{
    
    public DecoratorCapacete(IComponent component) {
        super(component);
    }
    
    
    @Override
    public void desenhar() {
        component.desenhar();
        System.err.println("Capacete");
        return;
    }
}
