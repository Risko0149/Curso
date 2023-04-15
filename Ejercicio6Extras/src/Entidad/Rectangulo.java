/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    
    Scanner leer = new Scanner(System.in);    

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(){
        System.out.println("Ingrese la longitud del lado 1:");
        lado1= leer.nextDouble();
        System.out.println("Ingrese la longitud del lado 2:");
        lado2= leer.nextDouble();
        
        System.out.println("El área del rectángulo de lado 1= "+lado1+ " y lado 2= "+lado2 +" es igual a: "+ (lado1*lado2));

    }
    
    
}
