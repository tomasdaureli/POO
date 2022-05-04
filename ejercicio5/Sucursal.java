package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Sucursal {
    
    private int numAgencia;
    private String direccion;
    private String nombre;
    private String barrio;
    ArrayList <Vehiculos> listaVehiculos = new ArrayList<Vehiculos>();
    Scanner entrada = new Scanner(System.in);

    public Sucursal(int numAgencia, String direccion, String nombre) {
        this.numAgencia = numAgencia;
        this.direccion = direccion;
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Sucursal [numAgencia = " + numAgencia + ", nombre = " + nombre + ", direccion = " + direccion 
        + "barrio = " + barrio + ", listaVehiculos = " + listaVehiculos + "]";
    }

    public void agregarVehiculo(Vehiculos vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        for (Vehiculos vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
    }

    public void crearReserva() {
        
    }
    
}
