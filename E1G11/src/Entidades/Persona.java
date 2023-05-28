package Entidades;


import Entidades.Perro;

public class Persona {

    private String nombre;

    private String apellido;

    private int dni;

    private int edad;

    private Perro perrito;

    public Persona(String nombre, String apellido, int dni, int edad, Perro perrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.perrito = perrito;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerrito() {
        return perrito;
    }

    public void setPerrito(Perro perrito) {
        this.perrito = perrito;
    }
  
    
      @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", perrito=" + perrito.toString()  + '}';
    }
    
}
