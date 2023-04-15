/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8guia3;

/**
 *
 * @author Risko
 */

/*  Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
*   Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//   * * * *
//   *     *
//   *     *
//   * * * *
*/

public class Ejercicio8Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elementos;

        elementos = (int) (Math.random() * 10) + 1;

        System.out.println(elementos);

        for (int i = 0; i <= elementos - 1; i++) {
            for (int j = 0; j <= elementos - 1; j++) {            
                if ((i == 0) || (i == elementos - 1)) {
                    System.out.print("*");
                } else if ((j != 0) && (j != elementos - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");                    
                }                
            }
            System.out.println();
        }
    }    
}
