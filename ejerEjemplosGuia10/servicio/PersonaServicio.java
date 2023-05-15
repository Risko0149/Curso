package ejerEjemplosGuia10.servicio;


import ejerEjemplosGuia10.entidad.Persona;

import java.util.Scanner;

public class PersonaServicio {
Persona persona=new Persona();
public Persona cargarPersona(){
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese nombre, edad y dni: ");
    //persona.setNombre();
    return persona;
}
}
