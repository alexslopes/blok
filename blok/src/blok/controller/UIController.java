/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.controller;

import blok.gui.MainPanel;
import blok.controller.GameController;
import blok.gui.MainFrame;
import blok.gui.MainHome;
import java.awt.Dimension;
import blok.interfaces.IAbstractFactory;
import blok.interfaces.IFactoryMethod;
import blok.interfaces.IUIController;

/**
 *
 * @author sandroandrade
 */
public class UIController implements IUIController {

    public UIController() {
    }

    @Override
    public boolean initialize() {
        MainHome main = new MainHome();
        main.setVisible(true);
        return false;
    }
    
    public void createPanel(IAbstractFactory abstractFactory, IFactoryMethod factoryMethod){
        //initComponents();
       MainFrame frame = new MainFrame(abstractFactory,factoryMethod);
    }
    
}
