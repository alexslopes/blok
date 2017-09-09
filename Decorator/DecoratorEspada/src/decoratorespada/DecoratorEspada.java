/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorespada;

import blok.interfaces.IPlugin;
import decorator.Decorator;
import decorator.Decorator;
import decorator.IComponent;

/**
 *
 * @author aluno
 */
public class DecoratorEspada extends Decorator implements IPlugin{

  @Override
    public void desenhar() {
        component.desenhar();
        System.err.println("Espada");
        return;
    }

    public DecoratorEspada() {
    }
}
