/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class EstudianteServicios {

    Scanner leer = new Scanner(System.in);

    public Estudiante[] cargarEstudiantess() {
        Estudiante[] vectorEstudiantes = new Estudiante[8];

        for (int i = 0; i < vectorEstudiantes.length; i++) {
            vectorEstudiantes[i] = new Estudiante();

            System.out.println("Ingrese el nombre del estudiante nº" + (i + 1));
            vectorEstudiantes[i].setNombre(leer.next());

            System.out.println("Ingrese la nota del estudiante " + vectorEstudiantes[i].getNombre());
            vectorEstudiantes[i].setNota(leer.nextDouble());
        }
        return vectorEstudiantes;
    }

    public double calcularPromedio(Estudiante[] estudiosos) {
        double sumaNotas = 0;
        
        for (Estudiante estudiante : estudiosos) {
            sumaNotas += estudiante.getNota();
        }        
        return sumaNotas / estudiosos.length;
    }

    public String[] listaEstudiantesMp(Estudiante[] v, double promedio) {
        int contador = 0;
        String[] listaMp = new String[v.length];

        System.out.println("");
        System.out.println("Estudiantess que superan el promedio");
        System.out.println("------------------------------------");

        for (int i = 0; i < v.length; i++) {
            if (v[i].getNota() > promedio) {
                listaMp[contador] = v[i].getNombre();
                contador++;
            }
        }
        String[] listaMpNew = new String[contador];

        System.arraycopy(listaMp, 0, listaMpNew, 0, contador);

        return listaMpNew;
    }

    public void muestraEstudiantesMp(Estudiante[] v, double promedio) {
        System.out.println("Los estudiantes con una nota mayor al promedio son:");
        for (Estudiante estudiante : v) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getNota());
            }
        }
    }

}
