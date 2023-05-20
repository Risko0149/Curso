/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e5g10;

import Servicios.PaisServicios;

/**
 *
 * @author Risko
 */
public class E5G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicios ps = new PaisServicios();
        
        ps.cargarPaises();
        System.out.println("");
        ps.mostrarPaises();
    }
    
}
