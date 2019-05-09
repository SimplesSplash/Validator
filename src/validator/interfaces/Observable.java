/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.interfaces;

import java.io.File;
import java.util.List;

/**
 *
 * @author alex1
 */
public interface Observable {
    
    
    public void notifyObservers();
    
    public void  addObservers(List<Observer> obs);
    
    public void removeObservers(List<Observer> obs);
    
    public void  addObserver(Observer o);
    
    public void removeObserver(Observer o);
}
