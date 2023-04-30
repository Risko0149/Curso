/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia9;

import ejercicio4guia9.Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Risko
 */
public class Ejercicio4Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        
        Date fechaNac = fecha.fechaNacimiento();

        System.out.println("Su fecha de nacimiento es: "+ fechaNac);

        System.out.println("La fecha actual es: "+fecha.fechaActual());

        fecha.diferencia(fechaNac, fecha.fechaActual());
    }
    
}
