/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.IComponent;

/**
 *
 * @author aluno
 */
public class Player implements IComponent{
    
    public void desenhar(){
        System.out.println("Player");
        return;
    }
}
