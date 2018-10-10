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
public class MyStuff {

    String name;

    MyStuff(String n) {
        name = n;
    }

    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("guitar");
        MyStuff m2 = new MyStuff("tv");
        System.out.println(m2.equals(m1));
    }

    public boolean equals(Object o) {
        MyStuff m = (MyStuff) o;
        System.out.println(m.name);
        if (m.name != null) {
            return true;
        }
        return false;
    }
}
