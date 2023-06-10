/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3g12;

import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.Electrodomestico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Risko
 */
public class E3G12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Electrodomestico> electro = new ArrayList();

        electro.add(new Televisor(150000d, "negro", 'A', 50d, 1920, true));
        electro.add(new Televisor(315000d, "verde", 'B', 55d, 1080, true));

        electro.add(new Lavadora(70000d, "blanco", 'A', 45d, 12));
        electro.add(new Lavadora(45000d, "rojo", 'E', 35d, 7));

        double suma = 0;
        for (Electrodomestico ele : electro) {
            ele.precioFinal();
            System.out.println(ele.getClass() + " " + ele.getPrecio());
            suma +=ele.getPrecio();
        }
        System.out.println("");
        System.out.println("La suma total es: "+suma);
    }
}
