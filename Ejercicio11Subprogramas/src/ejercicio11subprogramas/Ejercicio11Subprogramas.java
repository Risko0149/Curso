/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11subprogramas;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio11Subprogramas {

    /**
     * @param args the command line arguments
     */
    /*
    *   Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
    *   y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
    *   cada vocal se reemplaza por el carácter que se indica en la tabla 
    *   y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    *   a   e   i   o   u
    *   @   #   $   %   *
    */

    /*  Realice un subprograma que reciba una secuencia de caracteres 
    *   y retorne la codificación correspondiente. 
    *   Utilice la estructura “según” para la transformación. 
    *   Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    *   La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    */
    public static void main(String[] args) {
        String cadena;
        String resultado;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra a codificar:");

        cadena = leer.nextLine();

        resultado = Codificar(cadena);
        
	System.out.println("La palabra codificada es:" + resultado);
    }

    public static String Codificar(String Palabra) {
        String codi = Palabra;

        codi = codi.replace('a', '@');
        codi = codi.replace('A', '@');
        codi = codi.replace('e', '#');
        codi = codi.replace('E', '#');
        codi = codi.replace('i', '$');
        codi = codi.replace('I', '$');
        codi = codi.replace('o', '%');
        codi = codi.replace('O', '%');
        codi = codi.replace('u', '*');
        codi = codi.replace('U', '*');

        return codi;
    } 
    
}
