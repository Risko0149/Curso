/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6extraguia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Ej6ExtraGuia5 {
    /**
     * @param args the command line arguments
     */
    /*
    *   Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
    *   a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
    *   de tamaño de 20 x 20 caracteres. 
    *   Las palabras se ubicarán todas en orden horizontal en una fila que será 
    *   seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
    *   rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
    *   Finalmente imprima por pantalla la sopa de letras creada.
    *   Nota: Para resolver el ejercicio deberá investigar cómo se utilizan 
    *   las siguientes funciones de Java substring(), Length() y Math.random().
    */
    public static void main(String[] args) {
        int cantidad;
        String palabra;
        boolean longitudBuena;

        Random rand = new Random();

        Scanner leer = new Scanner(System.in);

        String [] vectorp = new String[5];

        System.out.println("Ingrese 5 palabras de entre 3 y 5 caracteres");

        for (int i=0;i<5;i++){
            do {
                System.out.println("Ingrese la palabra Nº " + (i+1));
                palabra = leer.next();   
                
                longitudBuena = ((palabra.length()>2) && (palabra.length()<6));
                if (longitudBuena==false) {
                    System.out.println("Error en la longitud de la palabra");
                }
            } while (longitudBuena==false);
            vectorp[i]=palabra;
        }

        String matriz20x20[][] = new String[20][20];

        boolean hecho;
        String letra;
        int filaRandom;
        int colaRandom;
        double filaR;

        for (int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                matriz20x20[i][j]="";
            }
        }

        for (int i=0;i<5;i++){
            hecho = false;
            do {
                filaR = Math.random()*10;
                filaRandom = rand.nextInt(20);
                colaRandom = rand.nextInt(15);
                if (matriz20x20[filaRandom][colaRandom] == ""){
                    for (int j=0;j<vectorp[i].length();j++){
                        letra = vectorp[i].substring(j,j+1);
                        matriz20x20[filaRandom][colaRandom+j]=letra.toUpperCase();
                        hecho = true;
                    }
                }
            } while (hecho == false);
        }

        int num;

        for (int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                if (matriz20x20[i][j] == ""){
                    num = rand.nextInt(10);
                    String numCadena= String.valueOf(num);
                    matriz20x20[i][j]= numCadena;
                }
                System.out.print("[" + matriz20x20[i][j]+"] ");
            }
            System.out.println("");
        }
    }   
}
