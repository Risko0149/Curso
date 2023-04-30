/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia9;

import ejercicio3guia9.Servicios.ArregloServicios;

/**
 *
 * @author Risko
 */
public class Ejercicio3Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double A[] = new double[50];
        double B[] = new double[20];
        
        ArregloServicios arre = new ArregloServicios();
        
        arre.inicializarA(A);
        
        arre.mostrar(A);
        System.out.println("------------------------------");
        arre.ordenar(A);
        
        arre.mostrar(A);
        System.out.println("------------------------------");
        arre.inicializarB(A, B);

        arre.mostrar(B);
        System.out.println("------------------------------");
    }
    
}
