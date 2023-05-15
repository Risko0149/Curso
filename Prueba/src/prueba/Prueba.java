/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import Entidades.Empleado;
import Servicios.EmpleadoServicios;


/**
 *
 * @author Risko
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado[] vector;
        EmpleadoServicios es = new EmpleadoServicios();
                
        vector=es.cargarEmpleados();
        
        double prom= es.calculaPromedio(vector);
      
        System.out.println("El promedio de los salarios es: "+prom);
        
        String[] lmp = es.listaEmpleadosMp(vector, prom);
        
        System.out.println("Nómina de empleados simple");
        es.imprimirListado(lmp);
        
        System.out.println("----------------------------");
        
        System.out.println("Nómina de empleados completa");
        es.imprimirListado(vector);
    }
    
}
