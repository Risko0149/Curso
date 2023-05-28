/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package E1G11;

import Entidades.Persona;
import Entidades.Perro;
import Enumeraciones.RazaPerro;


public class E1G11 {

  
    public static void main(String[] args) {
    
    Persona p1= new Persona("thomas", "aodwwd", 40123457 , 50 , null);
    Persona p2=new Persona("thomas2", "aodwwd22", 41123457 , 40 , null);
    Perro pr= new Perro("chiquito",RazaPerro.benedetto, 50 , 20.5 );
    Perro pr2= new Perro("lola",RazaPerro.beagle, 60 , 22.5);
    p1.setPerrito(pr2);
    p2.setPerrito(pr);
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    /*    
    RazaPerro erre = RazaPerro.benedetto;
    
    if (erre==RazaPerro.benedetto){
        System.out.println(erre+" contiene pequines");}       
    */
    }
    }
    

