/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integradorjava;

import Entidades.Estudiante;
import Servicios.EstudianteServicios;

/**
 *
 * @author Risko
 */
public class IntegradorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante[] vector;
        EstudianteServicios es = new EstudianteServicios();
                
        vector=es.cargarEstudiantess();
        
        double prom= es.calcularPromedio(vector);
      
        System.out.println("El promedio de las notas es: "+prom);
        
        String[] lmp = es.listaEstudiantesMp(vector, prom);
        
        es.muestraEstudiantesMp(vector, prom);
        
        
        
        //System.out.println("Nómina de estudiantes simple");
        //es.imprimirListado(lmp);
        
        //System.out.println("----------------------------");
        
        //System.out.println("Nómina de empleados completa");
        //es.imprimirListado(vector);
    }
    
}
