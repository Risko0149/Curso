/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13arreglos;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio13Arreglos {

    /**
     * @param args the command line arguments
     */
    /*
    *   Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
    *   y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
    */
    public static void main(String[] args) {
        int cantidadCompañeros;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de compañeros en el equipo:");
        
        cantidadCompañeros = leer.nextInt();
        
        String[] Equipo = new String[cantidadCompañeros];
        
        for (int i=0; i<=cantidadCompañeros-1; i++){
            System.out.println("Ingresa el nombre del compañero Nª " + (i+1));
            Equipo[i] = leer.next();        
        }

        System.out.println("");

        for (int i=0; i<=cantidadCompañeros-1; i++){
            System.out.println("El nombre del compañero Nª " + (i+1) + " es: " + Equipo[i]);
        }       
    }
    
}
