/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10estructurascontrol;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ejercicio10EstructurasControl {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
    *   e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
    *   Por ejemplo:
    *   5 *****
    *   3 ***
    *   11 ***********
    *   2 **
    */
    public static void main(String[] args) {
        int numero;

        for (int i = 0; i < 4; i++) {
            Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese un número:");
            numero = leer.nextInt();

            System.out.print(numero + " ");

            for(int j = 0; j < numero; j++){
                System.out.print("*");
            }   
        System.out.println("");
    	}
    }
    
}
