/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterf;

/**
 *
 * @author renanvh
 */
public class Javacode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        
        gato.barulho();
        cachorro.barulho();
    }
    
}
