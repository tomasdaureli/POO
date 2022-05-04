package ejercicio7;

public class Reserva {
    
    private Cliente datosCliente;
    private Habitacion datosHabitacion;
    private String fechaIngreso;
    private int nroDiasReserva;
    private double importeTotal;
    private double seña;
    private EstadoReserva estado;


    public Reserva(Cliente datosCliente, Habitacion datosHabitacion, String fechaIngreso, int nroDiasReserva,
            double seña, EstadoReserva estado) {
        this.datosCliente = datosCliente;
        this.datosHabitacion = datosHabitacion;
        this.fechaIngreso = fechaIngreso;
        this.nroDiasReserva = nroDiasReserva;
        this.seña = seña;
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Reserva [datosCliente=" + datosCliente + ", datosHabitacion=" + datosHabitacion + ", estado=" + estado
                + ", fechaIngreso=" + fechaIngreso + ", importeTotal=" + importeTotal + ", nroDiasReserva="
                + nroDiasReserva + ", seña=" + seña + "]";
    }

    
    
}
