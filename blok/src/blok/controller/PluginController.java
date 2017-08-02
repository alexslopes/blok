/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.controller;

import blok.interfaces.Factory.IFactory;
import blok.interfaces.IPlugin;
import blok.interfaces.IPluginController;
import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import blok.interfaces.IAbstractFactory;
import blok.interfaces.IFactoryMethod;

/**
 *
 * @author aluno
 */
public class PluginController implements IPluginController {

    private static List<IPlugin> pluginsFactory = null;

    
    public static boolean initialize() {
        if(pluginsFactory == null){
            pluginsFactory= new ArrayList<>();
            
        }
    }

    private PluginController() {
        
    }

    private static void lerPlugin() throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        pluginsFactory.removeAll(pluginsFactory);
        
        File currentDir = new File("./plugins");
        
        String[] plugins = currentDir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jar");
            }
        });
        int i, y = 0;
        URL[] jars = new URL[plugins.length];
        
        for (i = 0; i < plugins.length; i++) {
            System.out.println(i + 1 + " - " + plugins[i].split("\\.")[0]);
                jars[y] = (new File("./plugins/" + plugins[i])).toURI().toURL();//converte locais para url
                y++;
                System.out.println(i);
        }

        URLClassLoader ulc = new URLClassLoader(jars);//CalssLoadet carrega classes  via URL que estão em jars   ou diretorios
        System.out.println(ulc.getURLs()[1]);
        for(String x : plugins){
        String factoryName = x.split("\\.")[0];
        
        
        IPlugin factory = (IPlugin) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
        if(factory instanceof IPlugin)
            pluginsFactory.add(factory);
        System.out.println(factory.toString());
        }
    }

    @Override
    public List getPluginsFactory() {
        return this.pluginsFactory;
    }
   
}
