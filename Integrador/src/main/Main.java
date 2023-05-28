package main;

import entidades.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[8];
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[0] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[1] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[2] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[3] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[4] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[5] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[6] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        estudiantes[7] = new Estudiante(sc.nextLine(), sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el nombre y nota del estudiante: ");
        int sumNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumNotas += estudiante.getNota();
        }
        double promedio = (double) sumNotas / estudiantes.length;
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] nombresMayoresAlPromedio = new String[estudiantes.length];
        int indexNombres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresMayoresAlPromedio[indexNombres] = estudiante.getNombre();
                indexNombres++;
            }
        }

        System.out.println("Nombres de los alumnos con nota mayor al promedio del curso:");
        for (int i = 0; i < indexNombres; i++) {
            System.out.println(nombresMayoresAlPromedio[i]);
        }

        System.out.println("Estudiantes con nota mayor al promedio del curso:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", Nota: " + estudiante.getNota());
            }
        }

    }
}
