package ejercicio5;

public class Vehiculos {
    
    private String patente;
    private String marca;
    private String modelo;
    private TipoVehiculo tipo;
    private int cantPuertas;
    private int año;
    private double kilometraje;
    private double precio;

    public Vehiculos(String patente, String marca, String modelo, TipoVehiculo tipo, int cantPuertas, int año,
            double d, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cantPuertas = cantPuertas;
        this.año = año;
        this.kilometraje = d;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculos [marca = " + marca + ", modelo = " + modelo + ", patente = " + patente + ", año = " + 
        año + ", kilometraje = " + kilometraje + ", cantPuertas = " + cantPuertas + ", tipo = " + tipo + 
        ", precio = " + precio + "]";
    }

    

    
    
}
