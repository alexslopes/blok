/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorEscudo;

import decorator.Decorator;
import interfaces.IComponent;

/**
 *
 * @author alex
 */
public class DecoratorEscudo extends Decorator {

    public DecoratorEscudo(IComponent component) {
        super(component);
    }
    
    @Override
    public void desenhar() {
        component.desenhar();
        System.err.println("Escudo");
        return;
    }
}
