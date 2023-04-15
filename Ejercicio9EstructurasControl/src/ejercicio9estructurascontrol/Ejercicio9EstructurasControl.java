/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9estructurascontrol;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
/*
*   Escriba un programa que lea 20 números. 
*   Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
*   El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
*   Nota: recordar el uso de la sentencia break.
*/
public class Ejercicio9EstructurasControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        int numero = 0;
        
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un número:");
            numero = leer.nextInt();

            if (numero == 0) {
                System.out.println("Ya encontramos el 0");
                break;
            }

            if (numero > 0) {
                suma = suma + numero; 
            } 

            contador = contador + 1;
        } while (contador != 20);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
