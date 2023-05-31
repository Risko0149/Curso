/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicio;

import entidades.Carta;
import enumeradores.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author KaryDell
 */
public class Baraja {

    Scanner leer = new Scanner(System.in);
    private List<Carta> mazo;
    ArrayList<Carta> cartasRepartidas = new ArrayList();

    public Baraja() {
        mazo = new ArrayList();
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta cartita = new Carta(i, palo);
                    mazo.add(cartita);
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(mazo);
    }

//   • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas. 
    public Carta siguienteCarta() {
        if (mazo.isEmpty()) {
            System.out.println("No hay cartas en la baraja");
            return null;
        }
        return mazo.remove(0);
    }

//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles() {
        return mazo.size();
    }

//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public List<Carta> darCartas(int cantidad) {
        if (cantidad > mazo.size()) {
            System.out.println("No hay suficientes cartas en la baraja");
            return null;
        }

        for (int i = 0; i < cantidad; i++) {
            //System.out.println("La carta sacada es: " + mazo.get(0));
            Carta tacar = mazo.remove(0);
            cartasRepartidas.add(tacar);
        }
        return cartasRepartidas;
    }
//    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario

    public void cartasMonton() {
        if (cartasRepartidas.isEmpty()) {
            System.out.println("No hay cartas repartidas gil");
        } else {

            System.out.println("Montón repartido: ");
            for (Carta cartasRepartida : cartasRepartidas) {
                System.out.println(cartasRepartida);
            }
        }
    }
//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.

    public void mostrarBaraja() {
        System.out.println("Baraja: ");
        for (Carta barajita : mazo) {
            System.out.println(barajita);
        }
    }
}
