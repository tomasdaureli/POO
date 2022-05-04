package ejercicio_youtube;

public class Main {
    public static void main(String[] args) {
        
        Posnet posnet = new Posnet();
        Persona p1 = new Persona(43859901, "Tomas", "D'Aureli", 42371893, "tomasdaureli@gmail.com");
        TarjetaCredito t1 = new TarjetaCredito("Galicia", 444000087 , 7000, EntidadFinanciera.VISA, p1);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t1);
        System.out.println();
        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t1, 10000, 4);
        System.out.println(ticketGenerado);
        System.out.println();
        System.out.println("Tarjeta despues del pago");
        System.out.println(t1);
    }
}
