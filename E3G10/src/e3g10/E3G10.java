/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3g10;

import Servicios.AlumnoServicios;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class E3G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicios servicios = new AlumnoServicios();
        servicios.crearAlumnos();

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombre = leer.nextLine();
        double promedio = servicios.notaFinal(nombre);

        if (promedio == -1) {
            System.out.println("El alumno no se encuentra en la lista.");
        } else {
            System.out.println("El promedio final de " + nombre + " es: " + promedio);
        }
    }
}
