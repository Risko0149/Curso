/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2g12;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author Risko
 */
public class E2G12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        double precioFinalLavadora = lavadora.precioFinal();
        System.out.println("Precio final de la lavadora: $" + precioFinalLavadora);

        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        double precioFinalTelevisor = televisor.precioFinal();
        System.out.println("Precio final del televisor: $" + precioFinalTelevisor);
    }

}
