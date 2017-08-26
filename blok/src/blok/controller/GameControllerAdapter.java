/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.controller;

import blok.gui.MainPanel;
import blok.interfaces.IGameController;
import java.util.concurrent.TimeUnit;
import org.jbox2d.callbacks.ContactImpulse;
import org.jbox2d.callbacks.ContactListener;
import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;
import org.jbox2d.dynamics.contacts.Contact;

/**
 *
 * @author alex
 */
public class GameControllerAdapter implements IGameController, Runnable, ContactListener{
    private static GameControllerAdapter adapter = null;
    private GameController controller = GameController.getInstance();

    public static GameControllerAdapter getInstance(){
        if(adapter == null)
            adapter = new GameControllerAdapter();
        return adapter;
    }
    
     private GameControllerAdapter(){
         
     }
     
    public boolean initialize() {
        return true;
    }
    
    public void setPanel(MainPanel mainPanel) {
        this.controller.setPanel(mainPanel);
    }
    
    public void start() {
        this.controller.start();
    }

    public void stop() {
        this.controller.stop();
    }

    public void run() {
        this.controller.run();
    }

    public void init() {
        this.controller.init();
    }

    public void removeBody(Body body) {
        this.controller.removeBody(body);
    }

    public void beginContact(Contact contact) {
        this.controller.beginContact(contact);
    }

    public void endContact(Contact cntct) {
        this.controller.endContact(cntct);
    }

    public void preSolve(Contact cntct, Manifold mnfld) {
        this.controller.preSolve(cntct, mnfld);
    }

    public void postSolve(Contact cntct, ContactImpulse ci) {
        this.controller.postSolve(cntct, ci);
    }
}
