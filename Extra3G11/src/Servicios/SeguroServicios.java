/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Risko
 */
public class SeguroServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Cliente cliente = new Cliente();

    List<Cliente> clientes;
    List<Vehiculo> vehiculos;
    List<Cuota> cuotas;
    List<Poliza> polizas;

    public SeguroServicios() {
        clientes = new ArrayList();
        vehiculos = new ArrayList();
        cuotas = new ArrayList();
        polizas = new ArrayList();
    }

    public void cargarClientes() {
        System.out.print("Ingrese la cantidad de clientes a ingresar: ");
        int cantidadClientes = leer.nextInt();

        for (int i = 1; i <= cantidadClientes; i++) {
            System.out.println("\nIngresando datos del cliente " + i + ":");

            System.out.print("Nombre: ");
            String nombre = leer.next();

            System.out.print("Apellido: ");
            String apellido = leer.next();

            System.out.print("Documento: ");
            String documento = leer.next();

            System.out.print("Mail: ");
            String mail = leer.next();

            System.out.print("Domicilio: ");
            String domicilio = leer.next();

            System.out.print("Teléfono: ");
            String telefono = leer.next();

            Cliente cliente = new Cliente(nombre, apellido, documento, mail, domicilio, telefono);
            clientes.add(cliente);
        }
    }

    public void cargarVehiculos() {
        System.out.print("\nIngrese la cantidad de vehículoa: ");
        int cantidadVehiculos = leer.nextInt();

        for (int i = 1; i <= cantidadVehiculos; i++) {
            Vehiculo vehiculo = new Vehiculo();

            System.out.println("\nIngresando datos del vehículo " + i + ":");

            System.out.print("Marca: ");
            vehiculo.setMarca(leer.next());
            System.out.print("Modelo: ");
            vehiculo.setModelo(leer.next());
            System.out.print("Año: ");
            vehiculo.setAnio(leer.nextInt());
            System.out.print("Nº Motor: ");
            vehiculo.setNumeroMotor(leer.next());
            System.out.print("Chasis: ");
            vehiculo.setChasis(leer.next());
            System.out.print("Color: ");
            vehiculo.setColor(leer.next());
            System.out.print("Tipo: ");
            vehiculo.setTipo(leer.next());

            vehiculos.add(vehiculo);
        }
    }
    
    public void cargarPolizas(){
        for (Cliente cliente : clientes) {
            Poliza poliza = new Poliza();
            Cuota cta = new Cuota();

            System.out.println("\nCreando póliza para el cliente: " + cliente.getNombre() + " " + cliente.getApellido());

            // Obtener información para la nueva póliza
            System.out.print("Número de póliza: ");
            poliza.setNumeroPoliza(leer.nextInt());

            System.out.print("Fecha de inicio (dd/mm/aaaa): ");
            String fechaInicioStr = leer.next();
            poliza.setFechaInicio(parseFecha(fechaInicioStr));

            System.out.print("Fecha de fin (dd/mm/aaaa): ");
            String fechaFinStr = leer.next();
            poliza.setFechaFin(parseFecha(fechaFinStr));

            System.out.print("Cantidad de cuotas: ");
            poliza.setCantidadCuotas(leer.nextInt());

            System.out.print("Forma de pago: ");
            poliza.setFormaPago(leer.next());

            System.out.print("Monto total asegurado: ");
            poliza.setMontoTotalAsegurado(leer.nextDouble());

            System.out.print("Incluye granizo (S/N): ");
            String incluyeGranizoStr = leer.next();
            boolean incluyeGranizo = incluyeGranizoStr.equalsIgnoreCase("S");
            poliza.setIncluyeGranizo(incluyeGranizo);

            double montoMaximoGranizo = 0.0;
            if (incluyeGranizo) {
                System.out.print("Monto máximo por granizo: ");
                montoMaximoGranizo = leer.nextDouble();
            }
            poliza.setMontoMaximoGranizo(montoMaximoGranizo);

            System.out.print("Tipo de cobertura: ");
            poliza.setTipoCobertura(leer.next());

            poliza.setCliente(cliente);

            System.out.println("");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("Chasis Nº: " + vehiculo.getChasis() + " (" + vehiculo.getMarca() + " " + vehiculo.getModelo() + ")");
            }

            boolean encontro = false;

            do {
                System.out.println("\nIngrese Nº de chasis del vehículo del cliente: ");
                String chasis = leer.next();

                for (Vehiculo vehiculo : vehiculos) {
                    if (vehiculo.getChasis().equalsIgnoreCase(chasis)) {
                        poliza.setVehiculo(vehiculo);
                        encontro = true;
                        break;
                    }
                }
                if (!encontro) {
                    System.out.println("Ese Nº de chasis no existe");
                }
            } while (!encontro);

            System.out.println("\nIngrese la cantidad de cuotas de la póliza: ");
            int cantidadCuotas = leer.nextInt();

            for (int i = 1; i <= cantidadCuotas; i++) {
                cta.setNumeroCuota(i);

                System.out.println("Monto de la cuota Nº:" +i);
                cta.setMontoTotalCuota(leer.nextDouble());

                char paga = ' ';
                do {
                    System.out.println("Pagada (S/N): ");
                    paga = leer.next().charAt(0);

                    cta.setPagada(false);
                    if (paga == 's' || paga == 'S') {
                        cta.setPagada(true);
                    }
                } while (paga != 's' && paga != 'S' && paga != 'n' && paga != 'N');

                System.out.println("Fecha de vencimiento:");
                String fechaVenStr = leer.next();
                cta.setFechaVencimiento(parseFecha(fechaVenStr));

                System.out.println("Forma de pago:");
                cta.setFormaPago(leer.next());

                cuotas.add(cta);
                System.out.println("");
            }            
            polizas.add(poliza);
        }        
    }
    
    public void mostrarPolizas(){        
        System.out.println("\nLista de pólizas de seguro");
        System.out.println("--------------------------");
        
        for (Poliza poli : polizas) {
            System.out.println(poli);
        }
    }
        
    // Método auxiliar para convertir una cadena de fecha en un objeto Date
    private static Date parseFecha(String fechaStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return format.parse(fechaStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
