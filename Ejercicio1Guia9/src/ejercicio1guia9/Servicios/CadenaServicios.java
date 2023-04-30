/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9.Servicios;

import ejercicio1guia9.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in);
    private Cadena lacade = new Cadena();
    public Cadena c1 = new Cadena(lacade.getFrase());

    public int mostrarVocales(){
        int cantidadVocales = 0;
        
        for (int i=0;i<lacade.getLongitud();i++){
            String estrin = lacade.getFrase().substring(i,i+1);

            switch (estrin.toUpperCase()){
                case "A":
                    cantidadVocales++;
                    break;                        
                case "E":
                    cantidadVocales++;
                    break;                        
                case "I":
                    cantidadVocales++;
                    break;                        
                case "O":
                    cantidadVocales++;
                    break;                        
                case "U":
                    cantidadVocales++;
                    break;                        
            }
        }
        return cantidadVocales;
    }

    public Cadena invertirFrase(){
        lacade.setFrase("casa blanca");

        String esarf ="";
        for (int i=c1.getLongitud()-1;i>=0;i--){
           esarf = esarf + lacade.getFrase().substring(i, i+1);
        }

        System.out.println("Esarf = "+esarf );

        return null;
    }

    public int vecesRepetido(String letra){
        int cantidad=0;
        int largo = c1.getLongitud();

        for (int i=0;i<largo;i++){
            if (c1.getFrase().substring(i, i+1).equals(letra)){
                cantidad++;
            }        
        }
        return cantidad;
    }
    
    public String leerFrase(){
        String lafrase = "";
        System.out.println("Ingrese la frase");
        lafrase = leer.nextLine();
        c1.setFrase(lafrase);
        return lafrase;
    }
}