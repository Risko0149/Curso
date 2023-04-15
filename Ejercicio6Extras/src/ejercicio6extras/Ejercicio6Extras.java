/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6extras;

import Entidad.Rectangulo;

/**
 *
 * @author Risko
 */
/*
    Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
    y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
    Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
    y imprime el área del rectángulo.
*/
public class Ejercicio6Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Rectangulo rectangulo1 = new Rectangulo(4,6);

        rectangulo.calcular_area();

        //rectangulo1.setLado1(4);
        //rectangulo1.setLado2(6);

        System.out.println("El área del rectángulo1 es:" + (rectangulo1.getLado1()*rectangulo1.getLado2()));
    }
}
