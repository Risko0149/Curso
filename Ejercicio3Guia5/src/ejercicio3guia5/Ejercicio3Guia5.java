/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia5;

import java.util.Random;
/**
 *
 * @author Risko
 */
public class Ejercicio3Guia5 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Recorrer un vector de N enteros contabilizando 
    *   cuántos números son de 1 dígito, 
    *   cuántos de 2 dígitos, 
    *   etcétera (hasta 5 dígitos).
    */
    public static void main(String[] args) {
        int Dig1=0;
        int Dig2=0;
        int Dig3=0;
        int Dig4=0;
        int Dig5=0;

        int vector []= new int [30];

        Random rand = new Random();
        
        for (int i=0;i<vector.length;i++){
            vector[i]=rand.nextInt(20000);

            System.out.print(vector[i] + " ");

            if (vector[i]<10){
                Dig1++;
            } else if ((vector[i]>9) && (vector[i]<100)){
                Dig2++;
            } else if ((vector[i]>99) && (vector[i]<1000)){
                Dig3++;
            } else if ((vector[i]>999) && (vector[i]<10000)){
                Dig4++;
            } else if (vector[i]>9999){
                Dig5++;
            }
        }
        System.out.println("");

        System.out.println("Hay " + Dig1 + " números de 1 dígito");
        System.out.println("Hay " + Dig2 + " números de 2 dígitos");
        System.out.println("Hay " + Dig3 + " números de 3 dígitos");
        System.out.println("Hay " + Dig4 + " números de 4 dígitos");
        System.out.println("Hay " + Dig5 + " números de 5 dígitos");
    }
    
}
