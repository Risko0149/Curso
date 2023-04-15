/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12subprogramas;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio12Subprogramas {

    /**
     * @param args the command line arguments
     */
    
    /*
    *   Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    *   validando que el primer número múltiplo del segundo 
    *   e imprima si el primer número es múltiplo del segundo, 
    *   sino informe que no lo son.
    */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        numero2 = leer.nextInt();
        
        esMultiplo(numero1, numero2);
    }
    
    public static void esMultiplo(int numero1, int numero2) {        
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " no es múltiplo de " + numero2);
        }
    }
}
