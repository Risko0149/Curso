/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class AlumnoServicios {

    private ArrayList<Alumno> listaAlumnos;
    private Scanner leer;

    public AlumnoServicios() {
        listaAlumnos = new ArrayList<Alumno>();
        leer = new Scanner(System.in);
    }

    public void crearAlumnos() {
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = leer.nextLine();

            ArrayList<Integer> notas = new ArrayList<Integer>();

            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = leer.nextInt();
                leer.nextLine();
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.print("¿Desea ingresar otro alumno? (S/N): ");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public double notaFinal(String nombre) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                ArrayList<Integer> notas = alumno.getNotas();
                double promedio = (notas.get(0) + notas.get(1) + notas.get(2)) / 3.0;
                return promedio;
            }
        }
        return -1;
    }
}
