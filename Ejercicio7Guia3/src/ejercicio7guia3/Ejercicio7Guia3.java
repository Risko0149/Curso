/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7guia3;

import java.util.Scanner;
/**
 *
 * @author Risko
 */

/*  Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
*   este tipo de dispositivo lee cadenas enviadas por el usuario. 
*   Las cadenas deben llegar con un formato fijo: 
*   tienen que ser de un máximo de 5 caracteres de largo, 
*   el primer carácter tiene que ser X y el último tiene que ser una O.
*   Las secuencias leídas que respeten el formato se consideran correctas, 
*   la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
*   y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
*   Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
*   Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
public class Ejercicio7Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int contadorCorrectos = 0;
        int contadorIncorrectos = 0;
        int largoCadena = 0;

        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese una cadena:");
            cadena = leer.next();
            
            largoCadena = cadena.length();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (largoCadena <= 5 ) {
                if ((cadena.charAt(0) == 'X') && (cadena.charAt(largoCadena) == 'O')) {
                    contadorCorrectos++;
                }else {
                    contadorIncorrectos++;
                }                
            } else {
                contadorIncorrectos++;
            }
            
        } while (true);
        
        System.out.println("");
        System.out.println("La cantidad de cadenas correctas es de: " + contadorCorrectos);
        System.out.println("La cantidad de cadenas incorrectas es de: " + contadorIncorrectos);
    }
    
}
