/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterodecimales;

/**
 *
 * @author Risko
 */
public class EnteroDecimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double numero = 3.14166677;
            
            System.out.println("El número originalmente es:" + numero);
            
            double parteDecimal = numero % 1; // Lo que sobra de dividir al número entre 1

            double parteEntera = numero - parteDecimal; // Le quitamos la parte decimal usando una resta
            
            int elEntero = (int) numero;

            System.out.println("Parte entera: " + elEntero);
            System.out.println("Parte decimal: " +  parteDecimal);
    }
    
}
