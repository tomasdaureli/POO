package ejercicio7;

public class Cliente {
    
    // public int id_cliente;
    public TipoCliente tipo;
    public String nombre;
    public String apellido;
    public int dni;
    // public static int contID = 1;
    public int cantReservas = 0;

    public Cliente(String nombre, String apellido, int dni, int cantReservas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantReservas = cantReservas;
        // this.id_cliente = contID++;
    }

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente " + apellido + " " + nombre + "[DNI N°: " + dni + "], es un cliente " + tipo + ".";
    }
    
    
}
