/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Servicios.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        crearElectrodomestico();
        
        System.out.println("Ingressr resoluciòn del televisor");
        this.resolucion = leer.nextInt();
        
        System.out.println("¿Tiene sintonizador TDT (S/N)?");
        String resp = leer.next();
        
        if (resp.equalsIgnoreCase("s")){
            this.sintonizadorTDT=true;
        }else{
            this.sintonizadorTDT=false;
        }
        
        
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (this.resolucion > 40) {
            precioFinal *= 1.3;
        }

        if (this.sintonizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}
