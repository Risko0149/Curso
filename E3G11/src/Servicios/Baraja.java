/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Carta;
import Enumeradores.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Risko
 */
public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Carta tacar = new Carta(numero, palo);
                    cartas.add(tacar);
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }

        List<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = cartas.remove(0);
            cartasRepartidas.add(carta);
        }
        return cartasRepartidas;
    }

    public List<Carta> cartasMonton() {
        List<Carta> cartasMonton = new ArrayList<>();
        for (Carta carta : cartas) {
            cartasMonton.add(carta);
        }
        return cartasMonton;
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
