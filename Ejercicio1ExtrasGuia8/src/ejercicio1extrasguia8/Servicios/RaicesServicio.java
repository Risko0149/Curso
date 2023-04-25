/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extrasguia8.Servicios;

import ejercicio1extrasguia8.Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class RaicesServicio {
    private Scanner leer = new Scanner(System.in);
    private Raices rai = new Raices();
    
    public double getDiscriminante(){
        double discriminante = (Math.pow(rai.getB(),2))-4*rai.getA()*rai.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(){
        boolean tRaices = false;
        double discriminante = getDiscriminante();

        if (discriminante >=0){
            tRaices=true;
        }

        return tRaices;
    }
    
    public boolean tieneRaiz(){
        boolean tRaiz = false;
        double discriminante = getDiscriminante();
        if (discriminante ==0){
            tRaiz=true;
        }
        return tRaiz;
    }

}
