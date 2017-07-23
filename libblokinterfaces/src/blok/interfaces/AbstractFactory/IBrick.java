/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces.AbstractFactory;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author alex
 */
public interface IBrick {
    BufferedImage getBufferedImage()throws IOException;
}
