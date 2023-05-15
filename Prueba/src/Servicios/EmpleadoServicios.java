/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class EmpleadoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Empleado[] cargarEmpleados() {
        System.out.println("¿Cuántos empleados desea cargar?");
        int cantidadEmpleados = leer.nextInt();

        Empleado[] vectorEmpleados = new Empleado[cantidadEmpleados];

        for (int i = 0; i < vectorEmpleados.length; i++) {
            vectorEmpleados[i] = new Empleado();

            System.out.println("Ingrese el nombre del empleado nº" + (i + 1));
            String nom = leer.next();
            vectorEmpleados[i].setNombre(nom);

            System.out.println("Ingrese el sueldo del empleado " + vectorEmpleados[i].getNombre());
            double sal = leer.nextDouble();
            vectorEmpleados[i].setSalario(sal);
        }
        return vectorEmpleados;
    }

    public double calculaPromedio(Empleado[] v) {
        double totalNomina = 0;
        for (int i = 0; i < v.length; i++) {
            totalNomina += v[i].getSalario();
        }
        return totalNomina / v.length;
    }

    public String[] listaEmpleadosMp(Empleado[] v, double promedio) {
        int contador = 0;
        String[] listaMp = new String[v.length];
        
        System.out.println("");
        System.out.println("Empleados que superan el promedio");
        System.out.println("---------------------------------");

        for (int i = 0; i < v.length; i++) {
            if (v[i].getSalario() > promedio) {
                listaMp[contador] = v[i].getNombre();
                contador++;
            }
        }
        String[] listaMpNew = new String[contador];

        System.arraycopy(listaMp, 0, listaMpNew, 0, contador);

        return listaMpNew;
    }
    
    public void imprimirListado(String[] lista){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Nombre empleado nº "+(i+1)+" "+lista[i]);
        }    
    }
    
    public void imprimirListado(Empleado[] lista){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Nombre empleado nº "+(i+1)+" "+lista[i].getNombre());
            System.out.println("Sueldo empleado nº "+(i+1)+" "+lista[i].getSalario());
        }    
    }
}
