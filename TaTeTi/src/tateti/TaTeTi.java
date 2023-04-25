/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;


import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class TaTeTi {
    private static final int FILAS = 3;
    private static final int COLUMNAS = 3;
    private static char[][] tablero = new char[FILAS][COLUMNAS];
    private static char jugadorActual = 'X';
    private static boolean juegoTerminado = false;
    
    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();
        
        while (!juegoTerminado) {
            jugarTurno();
            mostrarTablero();
            if (hayGanador()) {
                System.out.println("¡Felicidades jugador " + jugadorActual + ", has ganado!");
                juegoTerminado = true;
            } else if (tableroLleno()) {
                System.out.println("El juego ha terminado en empate.");
                juegoTerminado = true;
            } else {
                cambiarJugador();
            }
        }
    }
    
    private static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    
    private static void mostrarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static void jugarTurno() {
        System.out.println("Turno del jugador " + jugadorActual);
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        do {
            System.out.print("Ingrese la fila (1-3): ");
            fila = scanner.nextInt() - 1;
            System.out.print("Ingrese la columna (1-3): ");
            columna = scanner.nextInt() - 1;
        } while (!movimientoValido(fila, columna));
        tablero[fila][columna] = jugadorActual;
    }
    
    private static boolean movimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
            System.out.println("Movimiento inválido. La posición seleccionada está fuera del tablero.");
            return false;
        } else if (tablero[fila][columna] != '-') {
            System.out.println("Movimiento inválido. La posición seleccionada ya ha sido ocupada.");
            return false;
        } else {
            return true;
        }
    }

private static boolean hayGanador() {
        // Verificar filas
        for (int i = 0; i < FILAS; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < COLUMNAS; j++) {
            if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                return true;
            }
        }
        // Verificar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }
        // Si no hay ganador, devolver false
        return false;
    }

private static boolean tableroLleno() {
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            if (tablero[i][j] == '-') {
                return false;
            }
        }
    }
    return true;
}

private static void cambiarJugador() {
    if (jugadorActual == 'X') {
        jugadorActual = 'O';
    } else {
        jugadorActual = 'X';
    }
}


}
