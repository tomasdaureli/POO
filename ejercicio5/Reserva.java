package ejercicio5;

import java.util.ArrayList;

public class Reserva {
    
    private int id_reserva;
    private String fechaInicio;
    private String fechaFin;
    private float kilometraje;
    private EstadoReserva estado;
    private static int contID = 1;
    ArrayList<Vehiculos> vehiculosLista = new ArrayList<>();
    
    public Reserva(EstadoReserva estado, String fechaInicio, String fechaFin) {
        this.id_reserva = contID++;
        this.estado = estado;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }
   
}