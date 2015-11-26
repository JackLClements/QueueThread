/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discreteeventthreads;

import java.util.ArrayList;

/**
 *
 * @author Jack L. Clements
 */
public class Transaction implements Runnable {
    private ArrayList<Entity> queue;
    private Entity nextEvent;
    private int clock;
    private int nextArrival;
    private int nextEOS;
    private boolean isServing;
    
    public Transaction(){
        
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int updateClock(){
        return 0;
    }
}
