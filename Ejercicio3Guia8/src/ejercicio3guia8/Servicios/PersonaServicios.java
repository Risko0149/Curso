/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia8.Servicios;

import ejercicio3guia8.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class PersonaServicios {
    Persona chabon = new Persona();
    
    private Scanner leer = new Scanner(System.in);
    
    public int esMayordeEdad(){
        int mayordeEdad=0;

        if (chabon.getEdad()>17) {
            System.out.println(chabon.getNombre() + " es mayor de edad");
            mayordeEdad = 1;
        }
        return mayordeEdad;
    }
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String lename = leer.next();
        chabon.setNombre(lename);
        
        System.out.println("Ingrese la edad de "+ chabon.getNombre());
        int leage = leer.nextInt();
        chabon.setEdad(leage);
        
        String lesex;        
        do{
            System.out.println("Ingrese el sexo BIOLÓGICO de "+ chabon.getNombre());
            lesex = leer.next().toUpperCase();    
        }while  ((!"F".equals(lesex)) && (!"M".equals(lesex)));
        chabon.setSexo(lesex);    
        
        System.out.println("Ingrese el peso de "+ chabon.getNombre());
        int lepeso = leer.nextInt();
        chabon.setPeso(lepeso);
        
        System.out.println("Ingrese la altura de "+ chabon.getNombre());
        float lealture = leer.nextFloat();
        chabon.setAltura(lealture);

        return chabon;
    }
    
    public int calcularIMC(){
        int resultado;

        double calculo = chabon.getPeso()/(Math.pow(chabon.getAltura(),2));

        if (calculo<20){
            resultado=-1;
            System.out.println(chabon.getNombre() + " está por debajo del peso normal");
        }else if ((calculo>20) && (calculo<25)){
            resultado=0;            
            System.out.println(chabon.getNombre() + " está en el peso ideal");
        }else{
           resultado=1; 
           System.out.println(chabon.getNombre() + " tiene sobrepeso");
        }
        return resultado;
    }
}
