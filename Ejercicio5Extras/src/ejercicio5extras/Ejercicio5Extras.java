/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extras;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ejercicio5Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta;
        
        Empleado anticapitalista = new Empleado();

        Scanner leer = new Scanner(System.in);

        respuesta = "N";

        do{
            anticapitalista.calcular_aumento();

            System.out.println("");
            System.out.println("¿Desea ingresar otro empleado (S/N)?");
            respuesta = leer.next();

        } while("S".equals(respuesta.toUpperCase())) ;
        System.out.println("");
    }
    
}
