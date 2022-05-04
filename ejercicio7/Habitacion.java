package ejercicio7;

public class Habitacion {

    public TipoHabitacion tipo;
    public int nroHabitacion;
    private int piso;
    public double precioXDia;
    public EstadoHabitacion estado;


    public Habitacion(TipoHabitacion tipo, int nroHabitacion, int piso, double precio, EstadoHabitacion estado) {
        this.tipo = tipo;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.precioXDia = precio;
        this.estado = estado;
    }


    @Override
    public String toString() {
        return 
        "\nHabitacion N" + nroHabitacion + 
        "\n Piso: " + piso + 
        "\n Tipo: " + tipo +
        "\n Precio: $" + precioXDia +
        "\n Estado: " + estado;
    }
    

}
