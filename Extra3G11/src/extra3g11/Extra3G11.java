/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra3g11;

import Servicios.SeguroServicios;


/**
 *
 * @author Risko
 */
public class Extra3G11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeguroServicios ss = new SeguroServicios();

        ss.cargarClientes();
        ss.cargarVehiculos();
        ss.cargarPolizas();
        ss.mostrarPolizas();
    }   
}
