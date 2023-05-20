/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package guia10ejercicio5;

import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Guia10Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio sp = new PaisServicio();

        do {
            Pais p1 = sp.crearPais();
            sp.agregarPais(p1);
            System.out.println("¿Desea seguir creando paises? (S/N)");
        } while ("S".equalsIgnoreCase(leer.next()));

        sp.mostrarPaises(false);
        sp.ordenarAlfabeticamente();
        sp.mostrarPaises(true);
        sp.eliminarPais();
        sp.mostrarPaises(true);
    }

}
