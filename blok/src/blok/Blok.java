/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok;

import blok.controller.UIController;
import blok.gui.MainHome;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class Blok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Core core = Core.getInstance();
                core.initialize();
            }
        });
    }
    
}
