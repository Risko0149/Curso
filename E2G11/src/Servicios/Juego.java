/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author Risko
 */
public class Juego {

    ArrayList<Jugador> jugadores;
    RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        Integer i = 0;
        Jugador unJugador = null;
        do {
            unJugador = jugadores.get(i);
            i++;
            if (i >= jugadores.size()) {
                i = 0;
            }
        } while (!unJugador.disparo(revolver));
        if (unJugador != null) {
            System.out.println("El jugador mojado es: " + unJugador);
        }
    }
}
