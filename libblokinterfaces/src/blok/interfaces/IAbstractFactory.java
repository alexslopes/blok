/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces;

import blok.interfaces.Factory.IBackground;
import blok.interfaces.Factory.IBrick;
import blok.interfaces.Factory.IGround;

/**
 *
 * @author aluno
 */
public interface IAbstractFactory {
    IBackground getBackground();
    
    IBrick getBrick();
    
    IGround getGround();
}
