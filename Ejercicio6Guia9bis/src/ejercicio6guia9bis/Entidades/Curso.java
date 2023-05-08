/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia9bis.Entidades;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String alumnos[];
    
   Scanner leer = new Scanner(System.in);

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String alumnos[]) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
   
    public void cargarAlumnos(){
        alumnos = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno nº " + (i + 1));
            alumnos[i] = leer.next();
        }         
    }
    
    public void crearCurso(){
        cargarAlumnos();
        
        leer.nextLine();
        System.out.println("Ingrese el nombre del curso");
        nombreCurso = leer.nextLine();
        
        System.out.println("Ingrese la cantidad de horas por dia");
        cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de días por semana");
        cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (mañana o tarde)");
        turno = leer.next().toLowerCase();
        System.out.println("Ingrese el precio por hora");
        precioPorHora = leer.nextDouble();
    }
   
  
    public void calcularGananciaSemanal(){
        double precioTotal=cantidadHorasPorDia * precioPorHora* 5 * cantidadDiasPorSemana;
        
        System.out.println("Para el turno "+turno+" del curso "+ nombreCurso);
        System.out.println("El valor total del curso es: $"+precioTotal+ " para 5 alumnos por "+cantidadHorasPorDia+" horas por día por "+cantidadDiasPorSemana+" días de la semana");
    
    }
}

