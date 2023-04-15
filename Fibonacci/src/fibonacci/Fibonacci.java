/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de términos de: ");
        cantidad = leer.nextInt();

        int[] vector = new int[cantidad]; 

        fibonacci(vector, cantidad); 

        for (int i = 0; i < cantidad; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public static void fibonacci(int[] vector, int cantidad) {        
        vector[0] = 1;
        vector[1] = 1;
        for (int i = 2; i <cantidad; i++) {
            vector[i] = vector[i - 1] + vector[i - 2];
        }
    }    
}
