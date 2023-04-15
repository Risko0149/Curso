/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia5;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio6Guia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
    *   donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
    *   Crear un programa que permita introducir un cuadrado por teclado 
    *   y determine si este cuadrado es mágico o no. 
    *   El programa deberá comprobar que los números introducidos son correctos, 
    *   es decir, están entre el 1 y el 9.
    */
    public static void main(String[] args) {
        int numero;
        int matriz[][] = new int [3][3];

        Scanner leer = new Scanner(System.in);

        numero=0;

        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++){
                do {
                    System.out.println("Ingrese un número del 1 al 9 para la posición " + i + ", " + j + " de la matriz");
                    numero = leer.nextInt();
                } while ((numero<1) || (numero>9)); 
                matriz[i][j]=numero;
            }
        }
        System.out.println("");

        System.out.println("Matriz resultante");
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");

    }
    
}
