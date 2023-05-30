/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3g11;

import Entidades.Carta;
import Servicios.Baraja;
import java.util.List;

/**
 *
 * @author Risko
 */
public class E3G11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Siguiente carta: " + baraja.siguienteCarta());

//        System.out.println("Dar 3 cartas:");
//        System.out.println(baraja.darCartas(3));
//
//        System.out.println("Cartas en el montón:");
//        System.out.println(baraja.cartasMonton());
//
//        System.out.println("Mostrar baraja completa:");
//        baraja.mostrarBaraja();

        System.out.println("Dar 3 cartas:");
        List<Carta> cartasRepartidas = baraja.darCartas(3);
        if (cartasRepartidas != null) {
            for (Carta carta : cartasRepartidas) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas en el montón:");
        List<Carta> cartasMonton = baraja.cartasMonton();
        if (cartasMonton.isEmpty()) {
            System.out.println("No hay cartas en el montón.");
        } else {
            for (Carta carta : cartasMonton) {
                System.out.println(carta);
            }
        }

        System.out.println("Mostrar baraja completa:");
        baraja.mostrarBaraja();
    }

}
