/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import interfaces.IComponent;

/**
 *
 * @author aluno
 */
public class Decorator implements IComponent{
    private IComponent component;
    
    public Decorator(IComponent component){
        this.component = component;
    }
    
    @Override
    public void desenhar() {
        component.desenhar();
    }
    
}
