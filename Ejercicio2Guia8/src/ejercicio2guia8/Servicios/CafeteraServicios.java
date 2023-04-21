/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia8.Servicios;

import ejercicio2guia8.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class CafeteraServicios {
    
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera cafe = new Cafetera();
    
    public Cafetera llenarCafetera(){       

        cafe.setCantidadActual(cafe.getCapacidadMaxima());

        //System.out.println("La capacidad máxima es: " + llenar.getCapacidadMaxima());
        //System.out.println("La cantidad actual es: "+llenar.getCantidadActual());

        return cafe;
    }
    
    public Cafetera servirTaza(){
        System.out.println("Ingrese el tamaño de la taza");
        int tamanioTaza = leer.nextInt();

        if (tamanioTaza>=cafe.getCantidadActual()){
            tamanioTaza -=cafe.getCantidadActual();
            cafe.setCantidadActual(0);
        }else{
            tamanioTaza = 0;
            cafe.setCantidadActual(cafe.getCantidadActual()-tamanioTaza);            
        }

        System.out.println("Queda en la cafetera "+ cafe.getCantidadActual());
        if (tamanioTaza==0){
            System.out.println("La taza se llenó");
        }else{            
            System.out.println("A la taza le queda " + tamanioTaza);
        }
        return null;
    }
    
    public Cafetera vaciarCafetera(){
        cafe.setCantidadActual(0);
        return cafe;
    }
    
    public Cafetera agregarCafe(){
        System.out.println("Indique cuánto café desea agregar");
        int cuanto = leer.nextInt();
        
        int totalCafe = cuanto + cafe.getCantidadActual();
        
        if (totalCafe>cafe.getCapacidadMaxima()){
            System.out.println("Supera la cantidad máxima de la cafetera");
        }else{
            cafe.setCantidadActual(totalCafe);
            System.out.println("Se agregó " + cuanto +" de café y ahora la cafetera tiene " + cafe.getCantidadActual());
        }        
        return null;
    }
}
