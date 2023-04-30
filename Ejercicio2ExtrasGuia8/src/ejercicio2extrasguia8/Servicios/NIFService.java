/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extrasguia8.Servicios;

import ejercicio2extrasguia8.Entidades.NIF;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class NIFService {
    
    public void elmetodo(){
        String cade = "1234";
        Integer num = 12345;
        int num2=0;

        Date mifecha = new Date();

    }
    
    private Scanner leer = new Scanner(System.in);

    private NIF elNif = new NIF();

    public NIF crearNif(){
        String cadena = "TRWAGNMYFPDXBNJZSQVHLCKE";
        String vectorLetras[] = new String [23];

        for (int i=0;i<23;i++){
            vectorLetras[i]= cadena.substring(i, i+1);
        }

        System.out.println("Ingrese el número del DNI");
        long numdni;       
        do{
            numdni = leer.nextLong();
            String cadenaNumdni = String.valueOf(numdni);
            elNif.setDNI(numdni);            
            numdni=cadenaNumdni.length();
        } while (numdni != 8);
            
        

        int resto = (int) elNif.getDNI() % 23;
        String laletra = cadena.substring(resto, resto+1);

        elNif.setLetra(vectorLetras[resto]);
        System.out.println("La letra es " + elNif.getLetra());

        return elNif;
    }

    public void mostrar(){                
        System.out.println("El NIF es " + String.valueOf(elNif.getDNI()) + "-" + elNif.getLetra());        
    }
}
