/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, 
 * y un constructor con todos los atributos pasados por parámetro 
 * y un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario 
 * y luego informar mediante otro método el número de ISBN, 
 * el título, el autor del libro y el número de páginas.
 * @author Risko
 */
public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int nroPaginas;
    
    Scanner leer = new Scanner(System.in);
    
     public Libro(String ISBN, String titulo, String autor, int nroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public Libro() {

    }
    
    public void CargarInformacionLibro() {
        System.out.println("Ingrese el ISBN:");
        ISBN = leer.next();
        System.out.println("Ingrese el título:");
        titulo = leer.next();
        System.out.println("Ingrese el autor:");
        autor= leer.next();
        System.out.println("Ingrese el número de páginas:");
        nroPaginas = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Título=" + titulo + ", Autor=" + autor + ", Número de Páginas=" + nroPaginas + '}';
    }    
}
