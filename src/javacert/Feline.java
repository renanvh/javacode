/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacert;

/**
 *
 * @author renanvh
 */
class Feline {

    public String type = "f ";

    public Feline() {
        System.out.print("feline ");
    }
}

class Cougar extends Feline {

    public Cougar() {
        System.out.print("cougar ");
    }

    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }

    public static void main(String[] args) {
        new Cougar().go();
    }
}
