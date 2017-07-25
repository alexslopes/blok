/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod3;

import blok.interfaces.IPlayer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author alex
 */
public class Player implements IPlayer{
    
    @Override
    public BufferedImage getBufferedImage() throws IOException {
        BufferedImage icon = ImageIO.read(new File("images/player2.png"));
        return icon;
    }
    
}
