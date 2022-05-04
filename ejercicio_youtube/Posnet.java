package ejercicio_youtube;

public class Posnet {
    
    public static final double RECARGO_CUOTAS = 0.03;
    public static final int MIN_CUOTAS = 1;
    public static final int MAX_CUOTAS = 6;

    public Ticket efectuarPago(TarjetaCredito tarjeta, double monto, int cantCuotas) {
        Ticket elTicket = null;
        if (datosValidos(tarjeta, monto, cantCuotas)) {
            double montoFinal = monto + monto * recargoSegunCuotas(cantCuotas);
            if (tarjeta.tieneSaldoDisponible(montoFinal)) {
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return elTicket;
    }

    private boolean datosValidos(TarjetaCredito t, double monto, int cuotas) {
        boolean esTarjetaValida = t != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cuotas >= MIN_CUOTAS && cuotas <= MAX_CUOTAS;

        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }

    private double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_CUOTAS;
    }
}
