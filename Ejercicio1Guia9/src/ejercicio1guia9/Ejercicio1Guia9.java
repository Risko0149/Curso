/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9;

import ejercicio1guia9.Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ejercicio1Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaServicios laca = new CadenaServicios();        
        
        Scanner leer = new Scanner(System.in);

        //laca.leerFrase();

        laca.invertirFrase();

        /**System.out.println("Ingrese una letra");
        String letra = leer.next();

        int letraRepetida = laca.vecesRepetido(letra);
        System.out.println("La letra "+ letra + " se repite "+letraRepetida);
        */
    }
    
}
