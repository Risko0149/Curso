/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extrasguia8;

import ejercicio2extrasguia8.Servicios.NIFService;

/**
 *
 * @author Risko
 */
public class Ejercicio2ExtrasGuia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService NifS = new NIFService();
        
        NifS.crearNif();
        
        NifS.mostrar();        
        
    }    
}
