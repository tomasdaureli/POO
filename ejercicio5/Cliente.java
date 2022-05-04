package ejercicio5;

import java.util.ArrayList;

public class Cliente {
    
    public int documento;
    private String nombre;
    private String direccion;
    private int telefono;
    private int id_cliente;
    public static int contID = 1;
    ArrayList <Reserva> reservas = new ArrayList<Reserva>();
    
    public Cliente(int documento, String nombre, String direccion, int telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_cliente = contID++;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    @Override
    public String toString() {
        return "Cliente [direccion=" + direccion + ", documento=" + documento + ", id_cliente=" + id_cliente
                + ", nombre=" + nombre + ", reservas=" + reservas + ", telefono=" + telefono + "]";
    }

    

}
