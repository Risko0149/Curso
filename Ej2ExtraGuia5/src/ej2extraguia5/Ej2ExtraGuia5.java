/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extraguia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ej2ExtraGuia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Escriba un programa que averigüe si dos vectores de N 
    *   enteros son iguales (la comparación deberá detenerse 
    *   en cuanto se detecte alguna diferencia entre los elementos).
    */
    public static void main(String[] args) {
        int cantidad;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector:");
        cantidad = leer.nextInt();

        int vector1[] = new int[cantidad];
        int vector2[] = new int[cantidad];

        Random rand = new Random();

        for (int i=0;i<cantidad;i++){
            vector1[i] = rand.nextInt(10);
            vector2[i] = rand.nextInt(10);
        }

        System.out.println("VECTOR Nº 1");
        for (int i=0;i<cantidad;i++){
            System.out.print("[" + vector1[i]+ "] ");
        }
        System.out.println("");
        
        System.out.println("VECTOR Nº 2");
        for (int i=0;i<cantidad;i++){
            System.out.print("[" + vector2[i]+ "] ");
        }
        System.out.println("");

        System.out.println("COMPARACIÓN");
        for (int i=0;i<cantidad;i++){
            System.out.println("[" + vector1[i]+ "] - " + "[" + vector1[i]+ "]");
            if (vector1[i] != vector2[i]) {
                System.out.println("Son distintos");
                break;
            }            
        }
        System.out.println("");
    }
}
