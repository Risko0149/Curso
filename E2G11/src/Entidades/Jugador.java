/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.EstadoJugador;

/**
 *
 * @author Risko
 */
public class Jugador {

    private Integer id;
    private String nombre;
    private EstadoJugador estado;

    public Boolean disparo(RevolverDeAgua r) {
        Boolean q = false;
        if (r.mojar()) {
            estado = EstadoJugador.mojado;
            q = true;
        }
        r.siguienteChorro();
        return q;
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estado = EstadoJugador.seco;
    }

    @Override
    public String toString() {
        return "Jugador{ " + nombre + " " + id + ", estado=" + estado + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoJugador getEstado() {
        return estado;
    }

    public void setEstado(EstadoJugador estado) {
        this.estado = estado;
    }

    public Jugador() {
    }
}
