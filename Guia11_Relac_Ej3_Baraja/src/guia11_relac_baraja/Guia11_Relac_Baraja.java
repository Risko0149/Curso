/*

 */
package guia11_relac_baraja;

import entidades.Carta;
import java.util.List;
import java.util.Scanner;
import servicio.Baraja;

/**
 * @author KaryDell
 */
public class Guia11_Relac_Baraja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Baraja baraha = new Baraja();

        //System.out.println("Siguiente carta: " + baraha.siguienteCarta());

        int opcion = 0;
        do {

            System.out.println("1.Barajar las cartas");
            System.out.println("2.Mostrar cartas disponibles");
            System.out.println("3.Pedir cartas");
            System.out.println("4.Mostrar cartas repartidas");
            System.out.println("5.Mostrar cartas del mazo");
            System.out.println("6.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    baraha.barajar();
                    break;
                case 2:
                    System.out.println("Cartas disponibles: " + baraha.cartasDisponibles());
                    break;
                case 3:
                    System.out.println("Ingrese cuántas cartas quiere sacar del mazo: ");
                    int cantidad = sc.nextInt();
                    List<Carta> cartasDadas = baraha.darCartas(cantidad);
                    if (cartasDadas != null) {
                        for (Carta cartasDada : cartasDadas) {
                            System.out.println(cartasDada);
                        }
                    }
                    break;
                case 4:
                    System.out.println("--------------");
                    baraha.cartasMonton();
                    break;
                case 5:
                    System.out.println("--------------");
                    baraha.mostrarBaraja();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ingrese una opción válida (1 a 6)");
            }
        } while (opcion!=6);

    }

}
