/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6estructurascontrol;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ejercicio6EstructurasControl {

    /**
     * @param args the command line arguments
     */
    //Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextInt();

        if (num1>25 && num2>25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25) {
            System.out.println("El primer número es mayor a 25");
        } else if (num2>25) {
            System.out.println("El segundo número es mayor a 25");          
        } else {
            System.out.println("Ninguno es mayor a 25");
        }
    }    
}
