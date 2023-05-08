/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2extrasguia9.ahorcado.Servicios;

import ej2extrasguia9.ahorcado.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class AhorcadoService {
    
    Ahorcado ah = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    
    public char vectorDibujado[];
    
    public void crearJuego() {        

        System.out.print("Ingrese la palabra a buscar: ");
        String palabraUsuario = leer.nextLine();

        //System.out.print("Ingrese la cantidad máxima de jugadas: ");
        //ah.setJugadasMaximas(leer.nextInt());
        ah.setJugadasMaximas(palabraUsuario.length()+2);
        
        vectorDibujado = new char[palabraUsuario.length()];
        
        Arrays.fill(vectorDibujado,'-');
        
        muestraAhorcado();        

        ah.setPalabra(palabraUsuario.toCharArray());
        ah.setLetrasEncontradas(0);
        ah.setJugadasRealizadas(0);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es de: " + ah.getPalabra().length+" letras");
        System.out.println("Solo tiene "+ah.getJugadasMaximas()+ " intentos... \r\n");
    }

    public void buscar(char letra) {
        boolean encontrada = false;

        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (ah.getPalabra()[i] == letra) {
                encontrada = true;
                ah.setLetrasEncontradas(ah.getLetrasEncontradas()+1);
                vectorDibujado[i]=letra;                
            }
        }
        muestraAhorcado();
        if (encontrada) {
            System.out.println("La letra '" + letra + "' está en la palabra.");
        } else {
            System.out.println("La letra '" + letra + "' no está en la palabra.");            
        }
        ah.setJugadasRealizadas(ah.getJugadasRealizadas()+1);
    }

    public boolean encontradas(char letra) {
        int letrasFaltantes = ah.getPalabra().length - ah.getLetrasEncontradas();

        System.out.println("Letras encontradas: " + ah.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + letrasFaltantes);

        return ah.getLetrasEncontradas() > 0;
    }

    public void intentos() {
        int intentosRestantes = ah.getJugadasMaximas() - ah.getJugadasRealizadas();
        System.out.println("Intentos restantes: " + intentosRestantes);
    }

    public void juego() {
        char[] vector = new char[ah.getJugadasMaximas()];
        boolean yaEsta = false;
        int posicion = 0;

        do  {
            System.out.print("Ingrese una letra: ");
            char letra = leer.next().charAt(0);
            
            for (int i = 0; i < vector.length; i++) {
                if (letra == vector[i]) {
                    yaEsta = true;
                    System.out.println("Letra repetida");
                    ah.setJugadasRealizadas(ah.getJugadasRealizadas() + 1);
                    intentos();
                    break;
                }
            }
            if (yaEsta != true) {
                vector[posicion] = letra;
                posicion++;
                buscar(letra);
                encontradas(letra);
                intentos();
                System.out.println();
            }else{
                yaEsta=false;
            }
        } while ((ah.getJugadasRealizadas() < ah.getJugadasMaximas()) && (ah.getLetrasEncontradas() != ah.getPalabra().length));

        if (ah.getLetrasEncontradas() == ah.getPalabra().length) {
            System.out.println("¡Felicitaciones! Has encontrado la palabra.");
        } else {
            System.out.println("Se han agotado los intentos. La palabra era: " + new String(ah.getPalabra()));
        }
    }
    
    public void muestraAhorcado(){
        System.out.println("Ahorcado: "+Arrays.toString(vectorDibujado));
    }  
  
}
