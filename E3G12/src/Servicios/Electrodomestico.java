/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor();
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor() {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colValido = false;

        for (String colorValido : coloresValidos) {
            if (this.color.equalsIgnoreCase(colorValido)) {
                colValido = true;
                break;
            }
        }

        if (!colValido) {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Color del electrodoméstico:");
        this.color = leer.next();
        
        comprobarColor();
        
        System.out.println("¿Tipo de consumo eléctrico del electrodoméstico? A / B / C / D / E / F");
        
        comprobarConsumoEnergetico(leer.next().charAt(0));
        
        System.out.println("¿Cual es el peso en kg del electrodoméstico?");
        this.peso = leer.nextDouble();
    
        precioFinal();
        
        System.out.println();
    }

    public double precioFinal() {
        double precioFinal = this.precio;

        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}
