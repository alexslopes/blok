/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory2;

import blok.interfaces.Factory.IBackground;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author alex
 */
public class Background implements IBackground{

    @Override
    public Image getImageIcon() {
        Image icon = new ImageIcon("images/background2.png").getImage();
        return icon;    }
    
}
