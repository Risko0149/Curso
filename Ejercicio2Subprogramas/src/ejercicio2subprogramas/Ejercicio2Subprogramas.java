/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2subprogramas;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio2Subprogramas {

    /**
     * @param args the command line arguments
     */
    /*
    *   Diseñe una función que pida el nombre y la edad de N personas 
    *   e imprima los datos de las personas ingresadas por teclado 
    *   e indique si son mayores o menores de edad. 
    *   Después de cada persona, el programa debe preguntarle al usuario 
    *   si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
    public static void main(String[] args) {
        int cuantasPersonas;
        boolean resultado;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas:");
        
        cuantasPersonas = leer.nextInt();
        
        for (int i=1; i<=cuantasPersonas; i++) {
        
            resultado = Datos(cuantasPersonas, i);
            
            if (resultado == true) {
                break;
            }        
        }
        
    }
    
    public static boolean Datos(int cuantas, int quien) {
        String nombre;
        int edad;
        boolean seTermina;
        
        Scanner leer = new Scanner(System.in);
        
        seTermina = false;
        
        System.out.println("Ingrese el nombre de la persona:");
        nombre = leer.next();
        
        System.out.println("Ingrese la edad de " + nombre +" :");
        edad = leer.nextInt();
        
        if (edad>17) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }

        return seTermina;
    }
    
}
