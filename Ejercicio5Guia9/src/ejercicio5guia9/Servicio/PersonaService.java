/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia9.Servicio;

import ejercicio5guia9.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    public Persona p1 = new Persona();
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        
        System.out.println("Ingrese la fecha de nacimiento de "+p1.getNombre());
        System.out.println("Primero ingrese el día de nacimiento");     
        int dia;
        do{
            dia = leer.nextInt();
        } while ((dia<1) || (dia>31));

        System.out.println("Segundo ingrese el mes de nacimiento");
        int mes;
        do{
            mes = leer.nextInt();
        } while ((mes<1) || (mes>12));

        System.out.println("Tercero ingrese el año de nacimiento");
        int anio = leer.nextInt();

        Date fechaNac = new Date(anio-1900, mes-1,dia);

        p1.setFechaNacimiento(fechaNac);

        return p1;
    }
    
    public void edad(){
        Date fechaActual = new Date();
        Date fechaNacimiento = p1.getFechaNacimiento();

        int anioActual=fechaActual.getYear()+1900;
        int anioNacimiento =fechaNacimiento.getYear()+1900;

        int laedad= anioActual - anioNacimiento;

        System.out.println("La edad es de " + laedad + " años");
    }
            
    public boolean menorQue(Persona pers, int edad){
        Date fecNacPers = pers.getFechaNacimiento();
        Date fechaActual = new Date();

        int anioActual=fechaActual.getYear()+1900;
        int anioNacimiento =fecNacPers.getYear()+1900;

        int laedad= anioActual - anioNacimiento;

        boolean esmenor=false;
        if (laedad<edad){
            esmenor = true;            
        }

        return esmenor;
    }
}
