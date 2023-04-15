/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia3;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ejercicio1Guia3 {

    /**
     * @param args the command line arguments
     */
    //Crear un programa que dado un número determine si es par o impar.

    public static void main(String[] args) {
        int numero;
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número:");
        numero = leer.nextInt(); 
    
        if ((numero%2) != 0) {
            System.out.println("El número es impar");
        } else {
            System.out.println("El número es par");
        }
    }
    
}
