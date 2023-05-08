/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2extrasguia9.ahorcado;

import ej2extrasguia9.ahorcado.Servicios.AhorcadoService;

/**
 *
 * @author Risko
 */
public class Ej2ExtrasGuia9Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService juego = new AhorcadoService();
        
        juego.crearJuego();
        juego.longitud();
        juego.juego();
    }
    
}
