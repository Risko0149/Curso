/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia9.Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class FechaService {
    
    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento(){
        System.out.println("Ingrese el día de nacimiento");
        int dia;
        do{
            dia = leer.nextInt();
        } while ((dia<1) || (dia>31));

        System.out.println("Ingrese el mes de nacimiento");        
        int mes;
        do{
            mes = leer.nextInt();
        } while ((mes<1) || (mes>12));

        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();

        Date fechaNac = new Date(anio-1900, mes-1,dia);

        return fechaNac;
    }
    
    public Date fechaActual(){
        Date fecAct = new Date();        
        return fecAct;
    }
    
    public void diferencia(Date fecha1, Date fecha2){
        int anio1=fecha1.getYear()+1900;
        int anio2=fecha2.getYear()+1900;
        int dife=0;
        
        if (anio1>anio2){
            dife = anio1 - anio2;
        }else{
            dife = anio2 - anio1;
        }

        System.out.println("La diferencia entre el año " + anio1 + " y el año " +anio2+ " es " + dife);
    }
}
