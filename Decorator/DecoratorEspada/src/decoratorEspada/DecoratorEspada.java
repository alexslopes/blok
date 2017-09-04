/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorEspada;

import blok.interfaces.IPlugin;
import decorator.Decorator;
import decorator.Decorator;
import interfaces.IComponent;

/**
 *
 * @author aluno
 */
public class DecoratorEspada extends Decorator implements IPlugin{
    
    public DecoratorEspada(IComponent component) {
        
        super(component);
    }

  @Override
    public void desenhar() {
        component.desenhar();
        System.err.println("Espada");
        return;
    }
}
