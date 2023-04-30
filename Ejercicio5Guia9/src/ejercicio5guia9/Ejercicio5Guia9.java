/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia9;

import ejercicio5guia9.Entidades.Persona;
import ejercicio5guia9.Servicio.PersonaService;
import java.util.Date;

/**
 *
 * @author Risko
 */
public class Ejercicio5Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService pers = new PersonaService();

        pers.crearPersona();

        pers.edad();

        Persona pers2 = new Persona();

        /*Date fechaNacim = new Date();
        int diaNac = 21;
        int mesNac = 4;
        int anioNac = 1950;
        fechaNacim.setDate(diaNac);
        fechaNacim.setMonth(mesNac-1);
        fechaNacim.setYear(anioNac-1900);
        */

        pers2.setFechaNacimiento(pers.p1.getFechaNacimiento());

        System.out.println("¿Es menor de 60 años? "+ pers.menorQue(pers2, 60));
    }
    
}
