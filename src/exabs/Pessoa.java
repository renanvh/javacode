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
public abstract class Pessoa {
    int idade;
    int x = 4;
   
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void sayHello(){
        System.out.println("Ola amigo");
    }
}
