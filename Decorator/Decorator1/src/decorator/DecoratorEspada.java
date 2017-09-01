/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.Decorator;
import interfaces.IComponent;

/**
 *
 * @author aluno
 */
public class DecoratorEspada extends Decorator{
    
    public DecoratorEspada(IComponent component) {
        
        super(component);
    }

  @Override
    public void desenhar() {
        System.err.println("Espada");
    }
}
