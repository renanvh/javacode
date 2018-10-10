/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exabs;

/**
 *
 * @author renanvh
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Homem();
        Pessoa p2 = new Mulher();
        Homem h1 = new Homem();
        Mulher m1 = new Mulher();
        
        p1.sayHello();
        p2.sayHello();
        h1.sayBye();
        m1.sayBye();
    }
}
