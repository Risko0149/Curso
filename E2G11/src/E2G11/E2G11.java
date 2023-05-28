/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E2G11;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import Servicios.Juego;
import java.util.ArrayList;

/**
 *
 * @author Risko
 */
public class E2G11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Juego ruletaDeAgua = new Juego();
        
        RevolverDeAgua revolver = new RevolverDeAgua();
        
        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
        jugadores.add( new Jugador(1,"Juan"));
        jugadores.add( new Jugador(2,"Pedro"));
        jugadores.add( new Jugador(3,"Adrian"));
        jugadores.add( new Jugador(4,"Maria"));
        jugadores.add( new Jugador(5,"Ivan"));
        jugadores.add( new Jugador(6,"Luis"));
        jugadores.add( new Jugador(7,"Diego"));
        jugadores.add( new Jugador(8,"Gustavo"));
        jugadores.add( new Jugador(9,"Lautaro"));
        jugadores.add( new Jugador(10,"Sebastian"));
        
        revolver.setTambor(jugadores.size()+1);
        revolver.llenarRevolver();
        
        ruletaDeAgua.llenarJuego(jugadores, revolver);
        ruletaDeAgua.ronda();

    }

}
