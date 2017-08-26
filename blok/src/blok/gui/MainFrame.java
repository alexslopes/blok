/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import blok.controller.GameControllerAdapter;
import blok.interfaces.IAbstractFactory;
import blok.interfaces.IFactoryMethod;
import java.awt.Dimension;

/**
 *
 * @author aluno
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame(IAbstractFactory abstractFactory, IFactoryMethod factoryMethod) {
        initComponents();
        
        Dimension size = new Dimension(1000, 600);

        MainPanel mainPanel = new MainPanel();
        mainPanel.setAbstractFactory(abstractFactory);
        mainPanel.setFactoryMethod(factoryMethod);
        mainPanel.setPreferredSize(size);
        mainPanel.setMinimumSize(size);
        mainPanel.setMaximumSize(size);
        mainPanel.setSize(size);
        setContentPane(mainPanel);

        setResizable(false);
        pack();

        GameControllerAdapter simulator = (GameControllerAdapter) GameControllerAdapter.getInstance();
        simulator.setPanel(mainPanel);
        mainPanel.setSimulator(simulator);
        simulator.init();
        simulator.start();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
