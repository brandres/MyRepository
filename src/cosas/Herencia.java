/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosas;

/**
 *
 * @author Brandon
 */
public class Herencia {
    public static void main(String[]args){
        A x = new A();
        x.print();
        B y = new B();
        x.print();
        y.print();
        x = y;
        x.print();
    }
}
