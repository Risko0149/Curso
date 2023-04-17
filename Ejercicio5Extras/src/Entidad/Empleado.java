/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
/*
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
    en función de su edad y salario actual. 
    El aumento salarial debe ser del 10% si el empleado tiene más de 30 años 
    o del 5% si tiene menos de 30 años.
*/
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private double aumento;
    
    Scanner leer = new Scanner(System.in);

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        System.out.println("Ingrese el nombre del empleado:");
        nombre = leer.next();
        
        System.out.println("Ingrese la edad del empleado "+ nombre+" :");
        edad = leer.nextInt();
        
        System.out.println("Ingrese el salario del empleado "+nombre+" :");
        salario = leer.nextDouble();
        
        if (edad>30) {
            aumento= salario * .10;
            
        }else if (edad<=30) {
            aumento= salario * .05;
        }
        salario = salario +aumento;

        System.out.println("");
        System.out.println("El salario de " + nombre + " tuvo un aumento de $" +aumento);
        System.out.println("El salario total de " + nombre +", cuya edad es de "+edad+" años, es de $"+salario);
    }
    
    
}
