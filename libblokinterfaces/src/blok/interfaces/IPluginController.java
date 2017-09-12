/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public interface IPluginController {
    boolean initialize();
    
    List getPlugins();
    
    public ArrayList<IPlugin> getLoadedPluginsByType(Class clazz);
}
