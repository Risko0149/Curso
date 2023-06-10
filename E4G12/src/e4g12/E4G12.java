/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e4g12;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Risko
 */
public class E4G12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 3.0);

        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();

        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
}
