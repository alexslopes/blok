/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.controller;

import blok.gui.MainFrame;
import blok.interfaces.IUIController;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author aluno
 */
public class UIController implements IUIController {

    @Override
    public boolean initialize() {
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        return true;
    }
    public JMenuItem createMenuItem(String menu, String item)
    {
        JMenuBar menuBar = mainFrame.getJMenuBar();
        int count = menuBar.getMenuCount();
        JMenu myMenu = null;
        for (int i = 0; i < count; i++) {
            if (menuBar.getMenu(i).getText().equals(menu)) {
                myMenu = menuBar.getMenu(i);
                break;
            }
        }
        if (myMenu == null) {
            myMenu = new JMenu();
            myMenu.setText(menu);
            menuBar.add(myMenu);
        }
        int itemCount = myMenu.getItemCount();
        for (int i = 0; i < itemCount; i++)
            if (myMenu.getItem(i).getText().equals(item))
                return null;
        JMenuItem myItem = new JMenuItem(item);
        myMenu.add(myItem);
        return myItem;
    }

    private MainFrame mainFrame;
}
