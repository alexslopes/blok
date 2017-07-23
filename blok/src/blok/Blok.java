/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok;

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
                /*MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);*/
                JFrame main = new MainHome();
                main.setVisible(true);
            }
        });
        /*Core core = new Core();
        core.initialize();
        core.getUIController().createMenuItem("teste", "Open");
        //boolean b = core.initialize();*/
        //System.out.println(b);
        //PluginController p = new PluginController();
        
    }
    
}
