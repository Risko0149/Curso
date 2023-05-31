/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11ejpersona;

import Entidades.DNI;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class G11EjPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni = new DNI();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre= leer.next();
        System.out.println("Ingrese el apellido de la persona");
        String apellido=leer.next();
        
        System.out.println("Ingrese la serie del dcoumento");
        char serie = leer.next().charAt(0);
        dni.setSerie(serie);
        System.out.println("Ingrese el número del documento");
        dni.setNumero(leer.nextInt());
        
        Persona p1 = new Persona(nombre, apellido, dni);       
    }
    
}
