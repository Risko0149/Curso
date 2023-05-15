/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2g10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class E2G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Continuando el ejercicio anterior, después de mostrar los perros, 
        al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, 
        se buscará el perro en la lista. 
        Si el perro está en la lista, se eliminará el perro que ingresó el usuario 
        y se mostrará la lista ordenada. 
        Si el perro no se encuentra en la lista, se le informará al usuario 
        y se mostrará la lista ordenada.
        */
        
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
        System.out.println("");
        
        System.out.println("¿Qué raza busca?");
        String busca=leer.next().toLowerCase();
        
        Iterator<String> ite = razas.iterator();
        boolean encontrado=false;
        while (ite.hasNext()){
            if (ite.next().equals(busca)){
                ite.remove();
                encontrado=true;
            }            
        }
        
        if(!encontrado){
            System.out.println("Esa raza no está en lista");
        }
        
        Collections.sort(razas);
        
        System.out.println("");
        System.out.println("Lista ordenada");
        System.out.println("--------------");        
        for (String raza : razas) {
            System.out.println(raza);
        }
    }
    
}
