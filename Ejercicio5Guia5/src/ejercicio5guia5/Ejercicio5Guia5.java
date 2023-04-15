/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia5;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio5Guia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realice un programa que compruebe si una matriz dada es antisimétrica. 
    *   Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
    *   pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
    *   La matriz traspuesta de una matriz A se denota por AT 
    *   y se obtiene cambiando sus filas por columnas (o viceversa).    
    */
    public static void main(String[] args) {
        int matrizA [][] = new int [5][5];
        int matrizB [][] = new int [5][51];

        Random rand = new Random();

        System.out.println("MATRIZ A");
        for (int i=0; i<matrizA.length; i++){
            for (int j=0; j<matrizA.length; j++){
                matrizA[i][j] = rand.nextInt(10);
                matrizB[i][j] = matrizA[i][j]*-1;
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("MATRIZ B - ANTISIMÈTRICA");
        for (int i=0; i<matrizB.length; i++){
            for (int j=0; j<matrizB.length; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
