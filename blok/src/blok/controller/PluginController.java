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

    private List<IPlugin> pluginsFactory;

    @Override
    public boolean initialize() {
        try {
            lerPlugin();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public PluginController() {
        this.pluginsFactory= new ArrayList<>();
    }

    /*public void createProducts(){
        try{
            this.lerPlugin();
            for(IPlugin p : pluginFactory){
                IAbstractProduct1 p1 = p.createProduct1();
                p1.sayHello();
                IAbstractProduct2 p2 = p.createProduct2();
                p2.sayHi();
            }       
        }catch(Exception e){
            System.out.println(e);
        }
        
    }*/
    private void lerPlugin() throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.pluginsFactory.removeAll(pluginsFactory);
        
        File currentDir = new File("./plugins");//localiza diretorio
        //String[] plugins = currentDir.list();//lista de arquivos no diretório 
        String[] plugins = currentDir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jar");
            }
        });
        int i, y = 0;
        URL[] jars = new URL[plugins.length];
        //System.out.println(plugins.length);
        
        for (i = 0; i < plugins.length; i++) {
            System.out.println(i + 1 + " - " + plugins[i].split("\\.")[0]);
                jars[y] = (new File("./plugins/" + plugins[i])).toURI().toURL();//converte locais para url
                y++;
                System.out.println(i);
        }

        
        
        for(String x : plugins){
        String factoryName = x.split("\\.")[0];
        System.out.println(factoryName);
        //factoryName = jars[0].getFile().split("\\.")[1];
        URLClassLoader ulc = new URLClassLoader(jars);//CalssLoadet carrega classes  via URL que estão em jars   ou diretorios
        IPlugin factory = (IPlugin) Class.forName(factoryName + "." + factoryName, true, ulc).newInstance();
        if(factory instanceof IFactory)
            pluginsFactory.add(factory);
        System.out.println(factory.toString());
        }
        //URLClassLoader ulc = new URLClassLoader(jars);
        //System.out.println(i + 1 + " - Plugin refresh");
        //System.out.println("Escolha sua opção ou 0 para sair: ");
        //Scanner sc = new Scanner(System.in);
        //op = sc.nextInt();
        //if (op != 0 && op != i + 1) {
        //  String factoryName = plugins[op - 1].split("\\.")[0];
        //  IPlugin factory = (IPlugin) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
        // pluginFactory.add(factory);
    }

    @Override
    public List getPluginsFactory() {
        return this.pluginsFactory;
    }
   
}
