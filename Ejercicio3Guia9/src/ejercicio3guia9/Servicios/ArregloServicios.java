/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia9.Servicios;

import java.util.Arrays;

/**
 *
 * @author Risko
 */
public class ArregloServicios {

    public void inicializarA(double arreA[]){
        for (int i = 0; i < arreA.length; i++) {
            arreA[i]=Math.random()*arreA.length; 
        }
    }
    
    public void mostrar(double arreglo[]){
        System.out.println(Arrays.toString(arreglo));
    }
    
    public void ordenar(double arreglo[]){
        //Arrays.sort(arreglo, arreglo.length-1, 0);        
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }        
    }
    
    public void inicializarB(double arregloA[], double arregloB[]){
    
        for (int i = 0; i < 10; i++) {
            arregloB[i]=arregloA[i];            
        }

        Arrays.fill(arregloB, 10, 20, 0.5);
    }
}
