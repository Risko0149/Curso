/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia8;

import ejercicio3guia8.Servicios.PersonaServicios;

/**
 *
 * @author Risko
 */
public class Ejercicio3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vectorEdad[] = new int[4];
        int vectorIMC[] = new int[4];
        
        int cuantosMayores=0;
        int cuantosMenores=0;
        int cuantosFlacos=0;
        int cuantosBien=0;
        int cuantosGordos=0;


        PersonaServicios PS1 = new PersonaServicios();
        PersonaServicios PS2 = new PersonaServicios();
        PersonaServicios PS3 = new PersonaServicios();
        PersonaServicios PS4 = new PersonaServicios();
        
        for (int i=0;i<4;i++){        
            switch (i){
                case 0: 
                    PS1.crearPersona();
                    vectorEdad[0]= PS1.esMayordeEdad();
                    vectorIMC[0] = PS1.calcularIMC();
                    break;
                case 1: 
                    PS2.crearPersona();
                    vectorEdad[1]= PS2.esMayordeEdad();
                    vectorIMC[1] =PS2.calcularIMC();
                    break;
                case 2:
                    PS3.crearPersona();
                    vectorEdad[2]= PS3.esMayordeEdad();
                    vectorIMC[2] =PS3.calcularIMC();
                    break;
                case 3:
                    PS4.crearPersona();
                    vectorEdad[3]= PS4.esMayordeEdad();
                    vectorIMC[3]=PS4.calcularIMC();
                    break;
            }            
            System.out.println("");
            System.out.println("----------------------------------------");
        
            if (vectorEdad[i]==0){
                cuantosMenores++;
            }else{
                cuantosMayores++;
            }
            
            switch (vectorIMC[i]) {
                case -1:
                    cuantosFlacos++;
                    break;
                case 0:
                    cuantosBien++;
                    break;
                default:
                    cuantosGordos++;
                    break;
            }
        }
        System.out.println("El porcentaje de personas mayores es " + ((cuantosMayores * 100)/4) + "%");
        System.out.println("El porcentaje de personas menores es " +  ((cuantosMenores * 100)/4) + "%");
        System.out.println("");
        System.out.println("Hay " + cuantosFlacos+ " personas flacas");
        System.out.println("Hay " + cuantosBien+ " personas en buen estado físico");
        System.out.println("Hay " + cuantosGordos+ " personas gordas");
    }
    
}
