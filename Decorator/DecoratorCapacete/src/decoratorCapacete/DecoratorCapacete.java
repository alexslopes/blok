package decoratorCapacete;


import decorator.Decorator;
import interfaces.IComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class DecoratorCapacete extends Decorator{
    
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
