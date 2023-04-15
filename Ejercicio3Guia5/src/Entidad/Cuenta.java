/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Risko
 */
/*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
    de dinero del saldo de la cuenta. 
    Asegúrate de que el saldo nunca sea negativo después 
    de realizar una transacción de retiro.
*/
public class Cuenta {
    
    public double saldo;
    public double monto; 
    public String titular;
    
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(){
        System.out.println("Ingrese el monto a retirar:");
        monto = leer.nextDouble();
    }
    
}
