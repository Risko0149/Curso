
package Servicios;

import Entidades.cuentaBancaria;
import java.util.Scanner;


public class cuentaBancariaServicio {
    public Scanner leer = new Scanner(System.in);

    public cuentaBancaria crearCuenta () {
        cuentaBancaria numc = new cuentaBancaria ();
        System.out.println("ingrese numero de cuenta");
        numc.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese DNI");
        numc.setDniCliente(leer.nextLong());
        System.out.println("ingrese Saldo");
        numc.setSaldoActual(leer.nextDouble()); 
       
    return numc;
    }
    public cuentaBancaria ingresaDinero (){
        System.out.println("ingrese la cantidad de dinero que desea sumar");
        double saldo = leer.nextDouble();
        cuentaBancaria numc= new cuentaBancaria ();
        saldo = saldo + numc.getSaldoActual();
        numc.setSaldoActual(saldo);
        return numc; 
}
    public cuentaBancaria retiraDinero (){
        System.out.println("ingrese la cantidad de dinero que desea retirar");
        double saldo = leer.nextDouble();
        cuentaBancaria numc= new cuentaBancaria ();
        if (saldo>=numc.getSaldoActual()){
        saldo=numc.getSaldoActual();}
        
        saldo = numc.getSaldoActual() - saldo;
        numc.setSaldoActual(saldo);
        return numc; 
        }
     public cuentaBancaria extraccionRapida (){
        System.out.println("se está realizando una extracción rapida");
        cuentaBancaria numc= new cuentaBancaria ();
        double saldo = numc.getSaldoActual()*0.20;           
        saldo = numc.getSaldoActual() - saldo;
        numc.setSaldoActual(saldo);
        return numc; 
        }
     public cuentaBancaria consultarSaldo () {
        cuentaBancaria numc= new cuentaBancaria ();
        System.out.println("El saldo actual es "+ numc.getSaldoActual());
        return null;
     }
     public cuentaBancaria consultarDatos () {
        cuentaBancaria numc= new cuentaBancaria ();
         System.out.println("El dni del cliente es  " + numc.getDniCliente() );
         System.out.println("El numero de cuenta es " + numc.getNumeroCuenta());
         System.out.println("El saldo de la cuenta es "+ numc.getSaldoActual());
       return null;
     }
}
    

