package ejercicio5;

import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();

        cargarEmpresa(empresa);

        System.out.println("Indique que opcion desea seleccionar...");
        int menu = entrada.nextInt();    

        switch (menu) {
            case 1:
                // Crear reserva
                System.out.print("Indique el documento del cliente: ");
                int cliente = entrada.nextInt();
                //System.out.println("Cliente 1");
                //boolean verificacion = empresa.estaRegistrado(cliente);
                if (empresa.estaRegistrado(cliente) == false) {
                    // Crear cliente
                    empresa.crearCliente(cliente);
                }
                // Hacer reserva...
                
                break;
            case 2: 
                // Crear cliente
        
            default:
                System.out.println("Programa finalizado");
                break;
        }

    }

    private static void cargarEmpresa(Empresa empresa) {

        Sucursal s1 = new Sucursal(1,"Buenos Aires","Sucursal A");
        Sucursal s2 = new Sucursal(2, "Tucuman","Sucursal B");
        Sucursal s3 = new Sucursal(3, "CABA", "Sucursal C");

        empresa.agregarSucursal(s1);
        empresa.agregarSucursal(s2);

        empresa.agregarCliente(new Cliente(43859901, "Tomas", "Calle123", 1149707457));
        empresa.agregarCliente(new Cliente(25659388, "Ezequiel", "Calle123", 1135792147));

        empresa.mostrarClientes();

        s1.agregarVehiculo(new Vehiculos("AB199FF", "Peugeot", "208", TipoVehiculo.Hatchback, 5, 2017, 53000.0, 20000.0));
        s1.agregarVehiculo(new Vehiculos("AD140RA", "Audi", "Q5", TipoVehiculo.SUV, 5, 2020, 30500.0, 35500.0));
        s2.agregarVehiculo(new Vehiculos("AF300JS", "BMW", "140", TipoVehiculo.Deportivo, 3, 2021, 8000.0, 25000.0));
        s2.agregarVehiculo(new Vehiculos("AA365LA", "Volkswagen", "UP!", TipoVehiculo.Hatchback, 3, 2016, 56000.0, 15000.50));
        s3.agregarVehiculo(new Vehiculos("AD240LA", "Volkswagen", "UP!", TipoVehiculo.Hatchback, 5, 2019, 21000.0, 15000.0));
        
        s1.mostrarVehiculos();


    
    }

}
