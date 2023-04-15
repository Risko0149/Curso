/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma2numeros;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Suma2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma);
    }
    
}
