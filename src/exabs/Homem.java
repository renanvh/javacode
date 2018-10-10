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
public class Homem extends Pessoa{
    
    
    public void sayBye(){
        x = 5;
        System.out.println("Flw parça"+ super.x);
    }

    @Override
    public void sayHello() {
        System.out.println("Ola parça");
    }
    
    
}
