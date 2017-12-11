/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author inman
 */
public class SingleObject {
    private static SingleObject instance;
    
    private SingleObject () {
    }
    
    public static SingleObject getInstance () {
        if (instance == null) {
            instance = new SingleObject();
        }
        
        return instance;
    }
    
    public void showMessage () {
        System.out.println("Hello World, This is singleton pattern.");
    }
}