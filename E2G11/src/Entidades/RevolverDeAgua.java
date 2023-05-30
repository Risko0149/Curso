/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Risko
 */
public class RevolverDeAgua {

    private Integer posicionActual;
    private Integer posicionDeAgua;
    private Integer tambor;
    
    private Random rnd = new Random();

    public void llenarRevolver() {

        posicionActual = rnd.nextInt(tambor - 1) + 1;
        posicionDeAgua = rnd.nextInt(tambor - 1) + 1;
    }

    public Integer getTambor() {
        return tambor;
    }

    public void setTambor(Integer tambor) {
        this.tambor = tambor;
    }

    public Boolean mojar() {
        return posicionActual == posicionDeAgua;
    }

    public void siguienteChorro() {
        posicionActual++;
        if (posicionActual >= tambor) {
            posicionActual = 1;
        }
    }

    public RevolverDeAgua() {
        //llenarRevolver();
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionDeAgua() {
        return posicionDeAgua;
    }

    public void setPosicionDeAgua(Integer posicionDeAgua) {
        this.posicionDeAgua = posicionDeAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionDeAgua=" + posicionDeAgua + '}';
    }
}
