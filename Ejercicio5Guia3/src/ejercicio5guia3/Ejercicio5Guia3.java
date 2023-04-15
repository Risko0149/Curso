/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia3;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio5Guia3 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Escriba un programa en el cual se ingrese un valor limite positivo, 
    *   y a continuacion solicite numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.
    */
    public static void main(String[] args) {
        int limite;
        int numero;
        int suma = 0;

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el límite máximo:");
        
        limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un número entero:");
            
            numero = leer.nextInt();
            
            suma = suma + numero;
        
        } while (suma<= limite);
        
    }
    
}
