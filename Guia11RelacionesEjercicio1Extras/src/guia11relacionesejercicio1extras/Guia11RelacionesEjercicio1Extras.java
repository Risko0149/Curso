/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11relacionesejercicio1extras;

import Entidades.Perro;
import Entidades.Persona;
import Service.PerroPersonaService;
import java.util.Scanner;

/**
 *
 * @author thege
 */
public class Guia11RelacionesEjercicio1Extras {

    /**
     * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
     * Nuestro programa va a tener que contar con muchas personas y muchos
     * perros. El programa deberá preguntarle a cada persona, que perro según su
     * nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, si
     * la persona eligió un perro que ya estaba adoptado, se le debe informar a
     * la persona. Una vez que la Persona elige el Perro se le asigna, al final
     * deberemos mostrar todas las personas con sus respectivos perros.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PerroPersonaService pps = new PerroPersonaService();
        Persona p1 = new Persona();
        Perro god = new Perro();

        Scanner ing = new Scanner(System.in);
        do {
            System.out.println("Cuantos personas ingresan?: ");
        } while (pps.cargarPersona(ing.nextInt()) == false);
        System.out.println("");
        do {
            System.out.println("Cuantos pichichus hay ?: ");
        } while (pps.cargarPerro(ing.nextInt()) == false);

      

        System.out.println("");
        System.out.println("Los humanos son: ");
        pps.mostrar(false);
        System.out.println("");

        System.out.println("");
        System.out.println("Los Pichichus son: ");
        pps.mostrar(true);
        System.out.println("");
        
        pps.adoptar();
        
        System.out.println("Las lista de Perros con su persona");
        pps.mostrar(false);
    }

}
