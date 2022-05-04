package ejercicio_youtube;

public class TarjetaCredito {
    
    private String entidadBancaria;
    private int nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona datosTitular;
    
    public TarjetaCredito(String entidadBancaria, int nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera,
            Persona datosTitular) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.datosTitular = datosTitular;
    }

    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }

    public void descontar(double monto) {
        saldo -= monto;
    }

    public String nombreCompletoTitular() {
        return datosTitular.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaCredito [datosTitular=" + datosTitular + ", entidadBancaria=" + entidadBancaria
                + ", entidadFinanciera=" + entidadFinanciera + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + "]";
    }

}
