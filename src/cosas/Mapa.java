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
public class Mapa {
   public static Personaje[][][] mapa = new Personaje[500][500][500];

    public Personaje getPersonaje(int x,int y,int z){
        return mapa[x][y][z];
    }
    public static Personaje[][][] getMapa() {
        return mapa;
    }

    public static void setMapa(Personaje[][][] mapa) {
        Mapa.mapa = mapa;
    }
   
}
