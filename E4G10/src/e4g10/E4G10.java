/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e4g10;

import Servicios.PeliculaServicios;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class E4G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PeliculaServicios peliculaServicios = new PeliculaServicios();
        boolean continuar = true;

        while (continuar) {
            peliculaServicios.crearPelicula();

            System.out.println("¿Desea agregar otra película? (s/n)");
            String respuesta = leer.nextLine().toLowerCase();
            if (!respuesta.equals("s")) {
                continuar = false;
            }
        }

        System.out.println("Listado de todas las películas:");
        peliculaServicios.mostrarPeliculas();
        System.out.println("");
        System.out.println("Listado de películas con duración mayor a 1 hora:");
        peliculaServicios.mostrarPeliculasMasDeUnaHora();
        System.out.println("");
        System.out.println("Listado de películas ordenadas por duración (de mayor a menor):");
        peliculaServicios.ordenarPeliculasPorDuracionDeMayorAMenor();
        System.out.println("");
        System.out.println("Listado de películas ordenadas por duración (de menor a mayor):");
        peliculaServicios.ordenarPeliculasPorDuracionDeMenorAMayor();
        System.out.println("");
        System.out.println("Listado de películas ordenadas por título:");
        peliculaServicios.ordenarPeliculasPorTitulo();
        System.out.println("");
        System.out.println("Listado de películas ordenadas por director:");
        peliculaServicios.ordenarPeliculasPorDirector();
    }
}
