/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import blok.interfaces.IPlugin;

/**
 *
 * @author aluno
 */
public class Decorator implements IComponent, IPlugin{
    protected IComponent component;
    
    public Decorator(IComponent component){
        this.component = component;
    }
    
    public Decorator(){
        
    }
    
    @Override
    public void desenhar() {
        component.desenhar();
        return;
    }
    
}
