/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces.AbstractFactory;

/**
 *
 * @author aluno
 */
public interface IFactory {
    IBackground getBackground();
    
    IBrick getBrick();
    
    IGround getGround();
}
