/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory1;

import blok.interfaces.Factory.IBrick;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author alex
 */
public class Brick implements IBrick{

    @Override
    public BufferedImage getBufferedImage() throws IOException{
        BufferedImage icon = ImageIO.read(new File("images/brick1.png"));
        return icon;
    }
    
}
