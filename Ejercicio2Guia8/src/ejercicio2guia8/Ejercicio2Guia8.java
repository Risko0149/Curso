/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia8;

import ejercicio2guia8.Entidad.Cafetera;
import ejercicio2guia8.Servicios.CafeteraServicios;

/**
 *
 * @author Risko
 */
public class Ejercicio2Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        CafeteraServicios cafeservice = new CafeteraServicios();
        
        Cafetera llena = cafeservice.llenarCafetera();
        
        Cafetera sirve = cafeservice.servirTaza();
        
        Cafetera agrega = cafeservice.agregarCafe();
    }
    
}
