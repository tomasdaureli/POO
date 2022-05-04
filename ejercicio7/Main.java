package ejercicio7;

import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        cargarHotel(hotel);

        int menu;

        do {
            System.out.println("====");
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("Crear una reserva [1]");
            System.out.println("...");
            System.out.print("Indique que opcion desea seleccionar... ");
            menu = entrada.nextInt();
            switch (menu) {
                case 1: // Crear reserva...
                    // Solicitar datos del cliente...
                    System.out.print("Indique el dni del cliente: ");
                    int cliente = entrada.nextInt();
                    if (hotel.estaRegistrado(cliente) == false) {
                        // Si el cliente no esta registrado, se procede a registrar al cliente.
                        System.out.println("REGISTRO DEL CLIENTE");
                        System.out.print("Nombre: ");
                        String nombre = entrada.next();
                        System.out.print("Apellido: ");
                        String apellido = entrada.next();
                        System.out.print("Dni nro. " + cliente);
                        System.out.print("\n");
                        hotel.agregarCliente(new Cliente(nombre, apellido, cliente));
                    }
                    Cliente clienteC = hotel.devolverCliente(cliente);
                    System.out.println(clienteC.nombre + clienteC.apellido + " es un cliente " + clienteC.tipo + ".");
                    int descuento = 0;
                    if (clienteC.tipo == TipoCliente.Habitual) {
                        System.out.println("Por ser un cliente habitual se le hara un descuento determinado por el administrador.");
                        System.out.print("Indique el porcentaje del descuento: %");
                        descuento = entrada.nextInt();
                    }
                    // System.out.println(clienteC);
                    // Verificar que habitaciones estan disponibles segun su tipo...
                    TipoHabitacion tipo = null;
                    do {
                        System.out.println("Indique que tipo de habitacion desea escoger:");
                        System.out.println("[1] Simple");
                        System.out.println("[2] Doble");
                        System.out.println("[3] Matrimonial");
                        int tipoHab = entrada.nextInt();
                        switch (tipoHab) {
                            case 1:
                                tipo = TipoHabitacion.Simple;
                                break;
                            case 2:
                                tipo = TipoHabitacion.Doble;
                                break;
                            case 3:
                                tipo = TipoHabitacion.Matrimonial;
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                    } while (tipo == null);
                    hotel.mostrarHabitacionesDisponibles(tipo);
                    // Reservar habitacion...
                    System.out.println("Indique la habitacion requerida: ");
                    int habitacion = entrada.nextInt();
                    System.out.println("Indique la fecha de comienzo de la reserva: ");
                    String fechaInicio = entrada.next();
                    System.out.println("Indique la cantidad de dias de la reserva: ");
                    int dias = entrada.nextInt();
                    Habitacion habitacionH = hotel.devolverHabitacion(habitacion);
                    Reserva reserva = hotel.crearReserva(clienteC, habitacionH, fechaInicio, dias, descuento);
                    // hotel.mostrarReserva(reserva);
                    break;
                case 2:

            }
        } while (menu != 0);
    }

    private static void cargarHotel(Hotel hotel) {

        hotel.agregarHabitacion(new Habitacion(TipoHabitacion.Simple, 15, 8, 1500.0, EstadoHabitacion.Disponible));
        hotel.agregarHabitacion(new Habitacion(TipoHabitacion.Doble, 10, 8, 2500.0, EstadoHabitacion.Disponible));
        hotel.agregarHabitacion(new Habitacion(TipoHabitacion.Doble, 28, 10, 4000.0, EstadoHabitacion.Disponible));

        hotel.agregarCliente(new Cliente("Tomas", "Daureli", 43859901));

        hotel.mostrarClientes();
        hotel.mostrarHabitaciones();

    }

}
