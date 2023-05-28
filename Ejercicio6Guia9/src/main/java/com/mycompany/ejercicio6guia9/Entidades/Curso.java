/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6guia9.Entidades;

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
    
    public void cargarAlumnos(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el nombre del alumno nº "+ i+1);
                alumnos[i] = leer.next();
            }                  
    }
    
    
   
    /**Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario 
     * y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
     * En este método invocamos al método cargarAlumnos() 
     * para asignarle valor al atributo alumnos
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
    * en una semana por curso. 
    * Para ello, se deben multiplicar la cantidad de horas por día, 
    * el precio por hora, la cantidad de alumnos 
    * y la cantidad de días a la semana que se repite el encuentro.
    **/
 
}
