package ejercicio7;

import java.util.ArrayList;

public class Hotel {
    
    private ArrayList<Cliente> listadoClientes;
    private ArrayList<Habitacion> listadoHabitaciones;
    private ArrayList<Reserva> listadoReservas;


    public Hotel() {
        this.listadoClientes = new ArrayList<>();
        this.listadoHabitaciones = new ArrayList<>();
        this.listadoReservas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.listadoClientes.add(cliente);
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.listadoHabitaciones.add(habitacion);
    }

    public void agregarReserva(Reserva reserva) {
        this.listadoReservas.add(reserva);
    }

    public void mostrarClientes() {
        for (Cliente cliente : listadoClientes) {
            System.out.println(cliente);
        }
    }

    public void mostrarHabitaciones() {
        for (Habitacion habitacion : listadoHabitaciones) {
            System.out.println(habitacion);            
        }
    }

    public boolean estaRegistrado(int dni) {
        for (Cliente cliente : listadoClientes) {
            if (dni == cliente.dni) {
                System.out.println("Cliente ya registrado.");
                return true;
            }
        }
        return false;
    }

    public boolean esClienteHabitual(Cliente cliente) {
        if (cliente.cantReservas > 6) {
            return true;
        } else {
            return false;
        }
    }

    public Cliente devolverCliente(int dni) {
        for (Cliente cliente : listadoClientes) {
            if (dni == cliente.dni) {
                int index = listadoClientes.indexOf(cliente);
                return listadoClientes.get(index);
            }
        }
        return null;
    }

    public Habitacion devolverHabitacion(int nroHabitacion) {
        for (Habitacion habitacion : listadoHabitaciones) {
            if (nroHabitacion == habitacion.nroHabitacion) {
                int index = listadoHabitaciones.indexOf(habitacion);
                return listadoHabitaciones.get(index);
            }
        }
        return null;
    }

    public void mostrarHabitacionesDisponibles(TipoHabitacion tipo) {
        EstadoHabitacion estado = EstadoHabitacion.Disponible;
        for (Habitacion habitacion : listadoHabitaciones) {
            if (tipo == habitacion.tipo) {
                if (estado == EstadoHabitacion.Disponible) {
                    System.out.println(habitacion);
                } else {
                    System.out.println("No hay habitaciones disponibles que coincidan con los parametros solicitados.");
                }
            }
            
        }
    }

    public Reserva crearReserva(Cliente cliente, Habitacion habitacion, String fechaComienzo, int diasReserva, int descuento) {
        // Cambiar estado habitacion
        habitacion.estado = EstadoHabitacion.Ocupada;
        // Importe total de la reserva (Calculando si el cliente tiene descuento o no)
        //if (descuento > 0) {
            String descto = "1." + descuento;
            double importeTotal = (habitacion.precioXDia * (Double.parseDouble(descto))) * diasReserva;
        //}
        // Valor de la senia
        // Imprimir comprobante de reserva
        System.out.println("======================");
        System.out.println("COMPROBANTE DE RESERVA");
        System.out.println("======================");
        System.out.println(cliente);
        System.out.println(habitacion);
        System.out.println("Fecha de inicio: " + fechaComienzo);
        System.out.println("Valor total de la reserva: $" + importeTotal);
        // Incrementar cantidad de reservas del cliente
        return null;
    }

    

}