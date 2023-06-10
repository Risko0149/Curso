/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Risko
 */
public class Circulo implements CalculosFormas {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPerimetro() {
        return PI * (2 * radio);
    }    
}
