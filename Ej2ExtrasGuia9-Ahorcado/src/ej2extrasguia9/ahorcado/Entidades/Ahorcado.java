/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2extrasguia9.ahorcado.Entidades;

/**
 *
 * @author Risko
 */
public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int jugadasRealizadas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMaximas, int jugadasRealizadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.jugadasRealizadas = jugadasRealizadas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getJugadasRealizadas() {
        return jugadasRealizadas;
    }

    public void setJugadasRealizadas(int jugadasRealizadas) {
        this.jugadasRealizadas = jugadasRealizadas;
    }
    
    
}
