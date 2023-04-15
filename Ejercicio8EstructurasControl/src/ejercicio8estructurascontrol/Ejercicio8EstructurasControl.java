/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8estructurascontrol;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ejercicio8EstructurasControl {

    /**
     * @param args the command line arguments
     */
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    public static void main(String[] args) {
        int nota;

        Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese la nota (0 al 10):");

        nota = -1;
        while (nota<0 || nota>10) {
            nota = leer.nextInt();
        }
        System.out.println("La nota es:" + nota);
    }
}
