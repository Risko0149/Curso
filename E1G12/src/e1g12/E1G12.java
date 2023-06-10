/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1g12;

import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import Entidades.Servicios.Animal;

/**
 *
 * @author Risko
 */
public class E1G12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();

        // Declaración de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();

        // Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();

        // Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }    
}
