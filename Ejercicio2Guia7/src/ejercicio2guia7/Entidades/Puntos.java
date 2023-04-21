/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia7.Entidades;

/**
 *
 * @author Risko
 */

import java.util.Scanner;

public class Puntos {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    public void crearPuntos(){
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese coordenada X1:");
        x1 = sc.nextInt();
        
        System.out.println("Ingrese coordenada X2:");
        x2 = sc.nextInt();
        
        System.out.println("Ingrese coordenada Y1:");
        y1 = sc.nextInt();
        
        System.out.println("Ingrese coordenada Y2:");
        y2 = sc.nextInt();                
    }
    
    public void calcularDistancia(){

        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        
        System.out.println("La distancia entre los puntos es "+distancia);
    } 

}