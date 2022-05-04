package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    Scanner entrada = new Scanner(System.in);
    
    ArrayList <Sucursal> listaSucursales;
    ArrayList <Cliente> listaClientes;

    public Empresa() {
        this.listaSucursales = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.listaSucursales.add(sucursal);
    }

    public void agregarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public void mostrarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public boolean estaRegistrado(int dni) {
        //int datoaBuscar = dni;//Cliente.getDocumento();
        //boolean encontrado = false;
        for (Cliente cliente : listaClientes) {
            //int posicion = listaClientes.indexOf(datoaBuscar);
            if(dni == cliente.documento) {
                System.out.println("Cliente ya registrado.");
                return true;
                //break;
            } /*else {
                //System.out.println("El cliente no se encuentra registrado.");
                //break;
            }*/
        }
        return false;
        // if (encontrado == false) {
        //     System.out.println("El cliente no se encuentra registrado.");
        // }
    }

    public Cliente crearCliente(int dni) {
        System.out.print("Nombre del cliente: ");
        String nom = entrada.next();
        System.out.println("Documento del cliente: " + dni);
        int documento = dni;
        System.out.print("Telefono del cliente: ");
        int tel = entrada.nextInt();
        System.out.print("Direccion del cliente: ");
        String direccion = entrada.next();
        return new Cliente(documento, nom, direccion, tel);
    }
    
}
