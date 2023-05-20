/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class PeliculaServicios {

    private ArrayList<Pelicula> peliculas= new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void crearPelicula() {       
        System.out.println("Ingrese el título de la película:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el director de la película:");
        String director = leer.nextLine();
        System.out.println("Ingrese la duración de la película en horas:");
        double duracion = leer.nextDouble();
        leer.nextLine(); 
        
        Pelicula pelis = new Pelicula(titulo,director,duracion);
        peliculas.add(pelis);
        
        System.out.println("Pelicula creada exitosamente.");
    }

    public void mostrarPeliculas() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas cargadas.");
            return;
        }
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo()+ "---> Director:"+pelicula.getDirector());
        }
    }

    public void mostrarPeliculasMasDeUnaHora() {
        ArrayList<Pelicula> peliculasMasDeUnaHora = new ArrayList<Pelicula>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                peliculasMasDeUnaHora.add(pelicula);
            }
        }
        if (peliculasMasDeUnaHora.isEmpty()) {
            System.out.println("No hay películas con duración mayor a una hora.");
            return;
        }
        for (Pelicula pelicula : peliculasMasDeUnaHora) {
            System.out.println(pelicula.getTitulo()+ "---> Duración:"+pelicula.getDuracion());
        }
    }

    public void ordenarPeliculasPorDuracionDeMayorAMenor() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas cargadas.");
            return;
        }
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion());
            }
        });
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo()+ "---> Duración:"+pelicula.getDuracion());
        }
    }

    public void ordenarPeliculasPorDuracionDeMenorAMayor() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas cargadas.");
            return;
        }
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion());
            }
        });
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo()+ "---> Duración:"+pelicula.getDuracion());
        }

    }
    
    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }
        });
        System.out.println("Películas ordenadas por título:");
        mostrarPeliculas();
    }
    
    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        });
        System.out.println("Películas ordenadas por director:");
        mostrarPeliculas();
    }    
}