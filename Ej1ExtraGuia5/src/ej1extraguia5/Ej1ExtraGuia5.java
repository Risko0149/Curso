/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extraguia5;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ej1ExtraGuia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realizar un algoritmo que calcule la suma de todos 
    *   los elementos de un vector de tamaño N, 
    *   con los valores ingresados por el usuario.
    */
    public static void main(String[] args) {
        int cantidad;
        int sumatoria;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector:");
        cantidad = leer.nextInt();

        int vector[] =new int[cantidad];
        
        sumatoria=0;

        for (int i=0; i<cantidad;i++){
            System.out.println("Ingrese el valor Nº " + (i+1) + " de " + cantidad);
            vector[i]= leer.nextInt();            
            sumatoria = sumatoria + vector[i];
        }
        System.out.println("");

        System.out.println("La suma de los " + cantidad + " valores es: " + sumatoria);
    }
}
