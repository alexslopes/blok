/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica1;

import blok.interfaces.AbstractFactory.IGround;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author alex
 */
public class Ground implements IGround{

    @Override
    public Image getImage() {
        Image icon = new ImageIcon("images/ground.png").getImage();
        return icon;
    }
    
}
