/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.fabrica1;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author alex
 */
public class Background {
    
    public Image getImageIcon(){   
        Image icon = new ImageIcon("images/background.png").getImage();
        return icon;
    }
}
