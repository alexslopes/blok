/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.controller;

import blok.gui.MainFrame;
import blok.gui.MainHome;
import blok.interfaces.IAbstractFactory;
import blok.interfaces.IFactoryMethod;
import blok.interfaces.IUIController;

/**
 *
 * @author sandroandrade
 */
public class UIController implements IUIController {
    private static UIController controller = null;
    
    public static UIController getInstance(){
        if(controller == null)
            controller = new UIController();
        return new UIController();
    }
    
    private UIController() {
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
