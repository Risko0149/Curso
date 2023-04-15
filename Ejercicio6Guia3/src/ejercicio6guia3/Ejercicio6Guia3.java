/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia3;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio6Guia3 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Realizar un programa que pida dos números enteros positivos por teclado 
    *   y muestre por pantalla el siguiente menú:
    *   El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
    *   y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
    *   Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    *   se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
    *   Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    *   
    *   MENU
    *   1. Sumar
    *   2. Restar
    *   3. Multiplicar
    *   4. Dividir
    *   5. Salir
    *   Elija opción:
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

            System.out.println("");
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");

            do {
                System.out.println("Elija una opción:");
                
                opcion=leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println("El resultado de la suma es:" + resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println("El resultado de la resta es:" + resultado);
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println("El resultado de la multiplicación es:" + resultado);
                        break;
                    case 4:
                        if (numero2 != 0){
                            resultado = numero1 / numero2;
                            System.out.println("El resultado de la división es:" + resultado);
                        } else {
                            System.out.println("No puede dividirse un número por cero");
                        }
                        break;
                    default:                        
                }                            
            } while (opcion != 5);
            System.out.println("Elvis ha dejado el edificio!");
    }
    
}
