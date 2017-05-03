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
public class Personaje {
    public int str;//fuerza
    public int intl;//inteligencia
    public int dex;//agilidad
    public int sta;//resistencia
    public int vit;//vida
    public int vit_actual;
    public int pwr;//poder para lanzar habilidades
    public int pwr_actual;
    public Personaje objetivo;
    public int posX;
    public int posY;
    public int posZ;
    public int lvl;
    //Hacer mejores fomular
    public void atacarBasico(){
        objetivo.vit_actual-=(str*0.25*lvl*(1/objetivo.sta));
    }
    public void moverX(){
    
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosZ(int posZ) {
        this.posZ = posZ;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosZ() {
        return posZ;
    }

    public void setObjetivo(Personaje objetivo) {
        this.objetivo = objetivo;
    }

    public Personaje getObjetivo() {
        return objetivo;
    }
    public int getStr() {
        return str;
    }

    public int getIntl() {
        return intl;
    }

    public int getDex() {
        return dex;
    }

    public int getSta() {
        return sta;
    }

    public int getVit() {
        return vit;
    }

    public int getVit_actual() {
        return vit_actual;
    }

    public int getPwr() {
        return pwr;
    }

    public int getPwr_actual() {
        return pwr_actual;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setIntl(int intl) {
        this.intl = intl;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setVit_actual(int vit_actual) {
        this.vit_actual = vit_actual;
    }

    public void setPwr(int pwr) {
        this.pwr = pwr;
    }

    public void setPwr_actual(int pwr_actual) {
        this.pwr_actual = pwr_actual;
    }
    
}
