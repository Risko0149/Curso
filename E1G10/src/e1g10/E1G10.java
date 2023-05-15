/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1g10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Risko
 *
 * 
 */
public class E1G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String rta;
        do {
            System.out.println("Ingrese la raza del perro: ");
            razas.add(leer.next());

            System.out.println("¿Desea ingresar otra raza? (S/N)");

            rta = leer.next().toLowerCase();

        } while ("s".equals(rta));

        System.out.println("");
        System.out.println("Razas cargadas");
        System.out.println("--------------");
        for (String raza : razas) {
            System.out.println(raza);
        }
    }

}
