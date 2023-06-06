/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *  * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
 * Nuestro programa va a tener que contar con muchas personas y muchos perros.
 * El programa deberá preguntarle a cada persona, que perro según su nombre,
 * quiere adoptar. Dos personas no pueden adoptar al mismo perro, si la persona
 * eligió un perro que ya estaba adoptado, se le debe informar a la persona. Una
 * vez que la Persona elige el Perro se le asigna, al final deberemos mostrar
 * todas las personas con sus respectivos perros.
 */
public class PerroPersonaService {

    Scanner ing = new Scanner(System.in);
    List<Perro> chiquito = new ArrayList();
    List<Persona> fernando = new ArrayList();

    public boolean cargarPersona(int cantidad) {
        boolean ok = false;
        if (cantidad > 0 && cantidad <= 5) {
            for (int i = 0; i < cantidad; i++) {
                Persona p1 = new Persona();
                System.out.println("Ingrese el nombre del humano");
                p1.setNombre(ing.next());
                System.out.println("Ingrese el apellido del humano");
                p1.setApellido(ing.next());
                System.out.println("Ingrese la edad del humano");
                p1.setEdad(ing.nextInt());
                System.out.println("Ingrese el dni del humano");
                p1.setDni(ing.nextInt());
                fernando.add(p1);
                ok = true;
            }
        } else {
            System.out.println("Anda pa´ lla bobo");
        }
        return ok;
    }

    public boolean cargarPerro(int cantidad) {
        boolean ok = false;
        if (cantidad > 0 && cantidad <= 5) {
            for (int i = 0; i < cantidad; i++) {
                Perro dog = new Perro();
                System.out.println("Ingrese el nombre del perro");
                dog.setNombre(ing.next());
                System.out.println("Ingrese la raza del perro");
                dog.setRaza(ing.next());
                System.out.println("Ingrese la edad del perro");
                dog.setEdad(ing.nextInt());
                System.out.println("Ingrese el tamaño del perro");
                dog.setTamanio(ing.next());
                chiquito.add(dog);
                ok = true;
            }
        } else {
            System.out.println("Anda pa´ lla bobo");
        }
        return ok;
    }

    public void mostrar(boolean opc) {
        if (opc) {
            for (Perro perro : chiquito) {
                System.out.println(perro.getNombre() + " " + perro.getRaza());
            }
        } else {
            for (Persona persona : fernando) {
                System.out.println(persona);
            }
        }
    }

    public void adoptar() {

        for (Persona persona : fernando) {
            System.out.println("Ingrese el perro a adoptar por : " + persona.getNombre() + " " + persona.getApellido());
            mostrar(true);
            System.out.println("");

            String mascota = ing.next();

            Iterator<Perro> it = chiquito.iterator();

            while (it.hasNext()) {
                if (it.next().equals(mascota)) {
                    for (Perro perro : chiquito) {
                        if (mascota.equalsIgnoreCase(perro.getNombre())) {
                            persona.setPerro(perro);
                            it.remove();
                        }
                    }
                }

            }

        }
    }
}
