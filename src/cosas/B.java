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
public class B extends A{
    public B(){
        System.out.println("creado B");
        x = 2;
    }
    
    @Override
    public void print(){
        System.out.println("BBBBBBBBBBBBBB" + x);
        super.print();
    }
}
