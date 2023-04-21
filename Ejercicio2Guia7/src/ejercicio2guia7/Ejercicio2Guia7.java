/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia7;

import ejercicio2guia7.Entidades.Puntos;

/**
 *
 * @author Risko
 */
public class Ejercicio2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mainx1,mainx2,mainy1,mainy2;
                
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        
        p1.calcularDistancia();
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        
        mainx1 = p1.getX1();
        mainx2 = p1.getX2();
        mainy1 = p1.getY1();
        mainy2 = p1.getY2();
         
        double distancia = Math.sqrt(Math.pow((mainx2-mainx1),2) + Math.pow((mainy2-mainy1),2));
        
        System.out.println("La distancia entre los puntos es "+distancia+ "  (CALCULO HECHO EN EL MAIN)");
    }
}
