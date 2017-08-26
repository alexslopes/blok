/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok;

import blok.controller.GameControllerAdapter;
import blok.controller.PluginController;
import blok.controller.UIController;
import blok.interfaces.ICore;
import blok.interfaces.IGameController;
import blok.interfaces.IPluginController;
import blok.interfaces.IUIController;

/**
 *
 * @author aluno
 */
public class Core implements ICore {
    private static Core core = null;
    
    public static Core getInstance(){
        if(core == null)
            core = new Core();
        return core;
    }
    
    private Core(){
        
    }
    
    @Override
    public boolean initialize() {
        uiController = UIController.getInstance();
        gameController = GameControllerAdapter.getInstance();
        pluginController = PluginController.getInstance();
  
        return uiController.initialize() &&
               gameController.initialize() &&
               pluginController.initialize();
    }

    @Override
    public IUIController getUIController() {
        return uiController;
    }

    @Override
    public IGameController getGameController() {
        return gameController;
    }

    @Override
    public IPluginController getPluginController() {
        return pluginController;
    }
    
    private IUIController uiController;
    private IGameController gameController;
    private IPluginController pluginController;
    
}
