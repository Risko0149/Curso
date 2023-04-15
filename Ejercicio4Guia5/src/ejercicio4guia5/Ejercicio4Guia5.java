/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia5;

import java.util.Random;
/**
 *
 * @author Risko
 */
public class Ejercicio4Guia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realizar un programa que rellene un matriz de 4 x 4 
    *   de valores aleatorios y muestre la traspuesta de la matriz. 
    *   La matriz traspuesta de una matriz A se denota por B 
    *   y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int transpuesta[][] = new int[4][4];

        Random rand = new Random();

        System.out.println("MATRIZ ORIGEN");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                matriz[i][j]= rand.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
                
        System.out.println("TRANSPUESTA");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                transpuesta[i][j]= matriz[j][i];
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
