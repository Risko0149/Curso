/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestrafrasemaymin;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/**
 *
 * @author Risko
 */
public class MuestraFraseMayMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String lafrase;

        System.out.println("Ingrese una frase:");
        lafrase = leer.nextLine(); 

        String lafraseMay = lafrase.toUpperCase(); 
        String lafraseMin = lafrase.toLowerCase();

        System.out.println("La frase en mayúsculas es: " + lafraseMay);
        System.out.println("La frase en minúsculas es: " + lafraseMin);      
    }  
}
