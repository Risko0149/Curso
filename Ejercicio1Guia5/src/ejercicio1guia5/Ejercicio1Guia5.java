/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia5;

import java.util.Random;
/**
 *
 * @author Risko
 */
public class Ejercicio1Guia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realizar un algoritmo que llene un vector 
    *   con los 100 primeros números enteros 
    *   y los muestre por pantalla en orden descendente.
    */
    public static void main(String[] args) {
        int matriz[] = new int[100];

        Random rand = new Random();

        System.out.println("Carga la matriz con números aleatorios");
        for (int i=0; i<=matriz.length-1;i++){
            matriz[i]=rand.nextInt(100);            
            System.out.print(matriz[i] + " ");
            if (((i+1) % 10)==0) {
                System.out.println("");
            }
        }
        System.out.println("");

        Ordena(matriz);        

        System.out.println("Muestra la matriz ordenada de forma descendente");
        for (int i=0; i<=matriz.length-1;i++){
            System.out.print(matriz[i] + " ");
            if (((i+1) % 10)==0) {
                System.out.println("");
            }
        }
    }
    
    public static void Ordena(int matriz[]){
        int temp;
    
        for (int i=0; i< matriz.length-1; i++) {
            for (int j = 0; j< matriz.length-1; j++) {
                if (matriz[j]<matriz[j+1]){
                    temp = matriz[j];
                    matriz[j]=matriz[j+1];
                    matriz[j+1]=temp;
                }
            }
        }
    }
}
