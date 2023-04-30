/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Utilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Date mifecha = new Date();
        
        System.out.println("Fecha " + mifecha);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        
        System.out.println("DIA");
        int dia = leer.nextInt();
        System.out.println("MES");
        int mes = leer.nextInt();
        System.out.println("AÑO");
        int anio = leer.nextInt();
        
        Date mifecha2 = new Date(anio-1900, mes-1, dia);

        System.out.println("Mi fecha "+mifecha2);

        boolean y = mifecha.after(mifecha2);
        System.out.println("Es anterior? "+ y);
        
        boolean z = mifecha.before(mifecha2);
        System.out.println("Es posterior? "+ z);
        
        System.out.println("Dia de la semana " + mifecha.getDay());
        mifecha.setDate(15);
        System.out.println("la fecha " + mifecha);
        System.out.println("Estringueado "+ mifecha.toString());
    }
}
