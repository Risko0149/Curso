/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import Utilidades.Comparadores;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Risko
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paises;
    TreeSet<Pais> paisesOrdenados;

    public PaisServicio() {
        paises = new HashSet();
        paisesOrdenados = new TreeSet(Comparadores.ordenarAlfabeticamente);
    }

    public Pais crearPais() {
        Pais p1 = new Pais();

        System.out.println("Ingrese el nombre del pais:");
        p1.setNombre(leer.next());

        return p1;
    }

    public void agregarPais(Pais p1) {
        if (paises.contains(p1)) {
            System.out.println("El pais ya existe en la lista");
        } else {
            paises.add(p1);
        }
    }

    public void mostrarPaises(boolean ordenado) {
        Iterable<Pais> ite = ordenado ? paisesOrdenados : paises;

        System.out.println("Lista de Paises");
        for (Pais pais : ite) {
            System.out.println(pais.getNombre());
        }
    }

    public void ordenarAlfabeticamente() {

        //Agrega todo el conjunto
        paisesOrdenados.addAll(paises);

        // Agrega de a uno 
        // for (Pais pais : paises) {
        //      paisesOrdenados.add(pais);
        //  }
    }

    public void eliminarPais() {
        System.out.println("Ingrese el pais que desea eliminar");
        String pais = leer.next();
        Iterator<Pais> it = paisesOrdenados.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
                System.out.println("Eliminado");
            }
        }
    }
}
