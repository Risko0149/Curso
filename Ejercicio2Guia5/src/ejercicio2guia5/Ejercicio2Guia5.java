/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia5;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio2Guia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
    *   y le pida al usuario un número a buscar en el vector. 
    *   El programa mostrará dónde se encuentra el numero y si se encuentra repetido
    */
    public static void main(String[] args) {
        int numero;
        int cantidadRepeticiones;

        int matriz[] = new int[30];

        Scanner leer = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Carga la matriz con números aleatorios");
        for (int i=0; i<=matriz.length-1;i++){
            matriz[i]=rand.nextInt(10);            
            System.out.print(matriz[i] + " ");
        }
        System.out.println("");
        
        System.out.println("Ingrese el número a buscar:");
        numero = leer.nextInt();
        
        cantidadRepeticiones=0;

        for (int i=0; i<=matriz.length-1;i++){
            if (numero==matriz[i]){                
                System.out.println("El número fue encontrado en la posición Nº " + (i+1));
                cantidadRepeticiones++;                        
            }
        }
        
        String veces = " vez";
        if (cantidadRepeticiones>1) {
            veces = " veces";
        }
        
        if (cantidadRepeticiones==0) {
            System.out.println("El número nunca se repitió");
        } else {
            System.out.println("El número se repitió " + cantidadRepeticiones + veces);
        }
    }
    
}
