/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class PaisServicios {
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

    private HashSet<String> paises = new HashSet();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPaises() {
        String respuesta;

        do {
            System.out.println("Ingrese el nombre del país");
            String pais = leer.next();

            if (paises.contains(pais)) {
                System.out.println("Ese país ya existe. Ingrese otro");
            } else {
                paises.add(pais);
            }

            System.out.println("¿Desea agregar otro país? (S/N)");
            respuesta = leer.next().toLowerCase();

        } while ("s".equals(respuesta));
    }

    public void mostrarPaises() {
        for (String paise : paises) {
            System.out.println(paise);
        }
    }

    public boolean existePais(String pais) {
        boolean existe = false;
        for (String paise : paises) {
            if (paise.contains(pais)) {
                System.out.println("Ese país ya existe. Ingrese otro");
                existe = true;
            }
        }
        return existe;
    }
}
