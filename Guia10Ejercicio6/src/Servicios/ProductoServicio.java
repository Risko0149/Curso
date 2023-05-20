/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Producto> productos;

    public ProductoServicio() {
        productos = new HashMap();

    }

    public Producto crearProducto() {
        Producto p1 = new Producto();
        System.out.println("Ingrese el nombre del producto:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el precio del producto:");
        p1.setPrecio(leer.nextDouble());
        return p1;
    }

    public void agregarProducto(Producto p1) {
        if (productos.containsKey(p1.getNombre())) {
            System.out.println("El producto ya existe");
        } else {
            productos.put(p1.getNombre(), p1);
        }
    }

    public void modificarPrecio() {
        System.out.println("Ingrese nombre del producto a modificar:");
        String nombre = leer.next();
        if (productos.containsKey(nombre)) {
            Producto p1 = productos.get(nombre);

            //Imprimo el producto sin modificar
            System.out.println("Producto: " + p1.getNombre());
            System.out.println("Precio: " + p1.getPrecio());

            System.out.println("Ingrese el nuevo precio:");
            p1.setPrecio(leer.nextDouble());
            productos.remove(nombre);
            productos.put(nombre, p1);
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese nombre del producto a eliminar:");
        String nombre = leer.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        } else {
            System.out.println("El producto que desea elimniar no existe");
        }
    }

    public void mostrarProductos() {
        System.out.println("Lista de Productos");
        for (Producto producto : productos.values()) {
            System.out.println(producto.getNombre() + " $" + producto.getPrecio());
        }
    }

    public void menu() {
        int opc = 0;
        do {
            System.out.println("1- Crear Producto");
            System.out.println("2- Modificar Precio ");
            System.out.println("3- Eliminar Producto");
            System.out.println("4- Mostrar Productos");
            System.out.println("5- Salir ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Producto p1 = crearProducto();
                    agregarProducto(p1);
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
            }
        } while (opc != 5);
    }
}
