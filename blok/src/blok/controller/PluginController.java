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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class PluginController implements IPluginController {

    private static PluginController plugin = null;
    private static List<IPlugin> loadedPlugins = null;

    public static PluginController getInstance() {
        if (plugin == null) {
            plugin = new PluginController();
        }
        return plugin;
    }

    public boolean initialize() {
        loadedPlugins = new ArrayList<>();
        try {
            lerPlugin();
            return true;

        } catch (MalformedURLException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private PluginController() {

    }

    private static void lerPlugin() throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        loadedPlugins.removeAll(loadedPlugins);

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
        for (String x : plugins) {
            String factoryName = x.split("\\.")[0];

            try {
                IPlugin factory = (IPlugin) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).getDeclaredMethod("getInstance").invoke(null);
                if (factory instanceof IPlugin) {
                    loadedPlugins.add(factory);
                }

                System.out.println(factory.toString());
            } catch (NoSuchMethodException e) {
                    IPlugin factory = (IPlugin) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
                    loadedPlugins.add(factory);
            }
            //Class cls = Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc);
            //Constructor[] constructors = cls.getDeclaredConstructors();
            //constructors[0].setAccessible(true);
            //IPlugin factory = (IPlugin) constructors[0].newInstance( );

        }
    }

    @Override
    public List getPlugins() {
        return this.loadedPlugins;
    }

    @Override
    public ArrayList<IPlugin> getLoadedPluginsByType(Class clazz) {
        ArrayList<IPlugin> pluginsByType = new ArrayList<IPlugin>();
        for(IPlugin plugin : loadedPlugins) {
            try {
                if (clazz.cast(plugin) != null)
                    pluginsByType.add(plugin);
            }
            catch (ClassCastException e) { }
        }
        return pluginsByType;
    }

}
