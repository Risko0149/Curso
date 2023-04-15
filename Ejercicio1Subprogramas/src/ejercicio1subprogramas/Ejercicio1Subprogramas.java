/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1subprogramas;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio1Subprogramas {

    /**
     * @param args the command line arguments
     */
    /*
    *   Crea una aplicación que le pida dos números al usuario 
    *   y este pueda elegir entre sumar, restar, multiplicar y dividir. 
    *   La aplicación debe tener una función para cada operación matemática 
    *   y deben devolver sus resultados para imprimirlos en el main. 
    */
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double resultado;
        int opcion;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        numero1 = leer.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        numero2 = leer.nextDouble();
        
        do{
            System.out.println("Elija una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = leer.nextInt();
            
            resultado = 0;
            
            switch (opcion) {
                case 1:
                    resultado = suma(numero1, numero2);
                    break;
                case 2:
                    resultado = resta(numero1, numero2);
                    break;
                case 3:
                    resultado = multiplicacion(numero1, numero2);
                    break;
                case 4:
                    if (numero2 !=0) {
                        resultado = division(numero1, numero2);                        
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;                 
            }

            System.out.println("");

            if (opcion != 5) {
                System.out.println("El resultado es:" + resultado);
            }            
        } while (opcion !=5);
    }
    
    public static double suma(double numero1, double numero2){
        double res = numero1 + numero2;
        return res;
    }
    
    public static double resta(double numero1, double numero2){
        double res = numero1 - numero2;
        return res;
    }

    public static double multiplicacion(double numero1, double numero2){
        double res = numero1 * numero2;
        return res;
    }

    public static double division(double numero1, double numero2){
        double res = numero1 / numero2;
        return res;
    }

}
