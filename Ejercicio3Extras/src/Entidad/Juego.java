/*
    Crea una clase "Juego" que tenga un método "iniciar_juego" 
    que permita a dos jugadores jugar un juego de adivinanza de números. 
    El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
    El segundo jugador tiene un número limitado de intentos 
    y recibe una pista de "más alto" o "más bajo" después de cada intento. 
    El juego termina cuando el segundo jugador adivina el número 
    o se queda sin intentos. 
    Registra el número de intentos necesarios para adivinar el número 
    y el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Juego {

    public int cantidadIntentos;
    public int contador;
    public int numero;
    public int numeroAAdivinar;
    public int ganados[] = new int[2];
    public String respuesta;

    Scanner leer = new Scanner(System.in);

    public void iniciar_juego() {
        System.out.println("Ingrese la cantidad de intentos:");
        cantidadIntentos = leer.nextInt();

        ganados[0] = 0;
        ganados[1] = 0;

        do {
            for (int j = 0; j < 2; j++) {

                System.out.println("Ingrese el número a adivinar:");
                numeroAAdivinar = leer.nextInt();

                contador = 0;
                do {
                    System.out.println("Intento Nº " + (contador + 1) + " del jugador " + (j + 1) + ":");
                    numero = leer.nextInt();

                    if (numero > numeroAAdivinar) {
                        System.out.println("El número es más bajo");
                    }
                    if (numero < numeroAAdivinar) {
                        System.out.println("El número es más alto");
                    }
                    if (numero == numeroAAdivinar) {
                        System.out.println("HA ACERTADO");
                        ganados[j]++;
                        break;
                    }
                    contador++;
                } while (contador < cantidadIntentos);
                System.out.println("");
                System.out.println("--------------------");
                System.out.println("");
            }
            System.out.println("¿Desean seguir jugando? (S/N)");
            respuesta = leer.next();

        } while ("S".equals(respuesta.toUpperCase()));

        System.out.println("El jugador 1 acertó " + ganados[0] + " veces");
        System.out.println("El jugador 2 acertó " + ganados[1] + " veces");

    }

    public Juego() {
    }

}
