package ejercicio2;

public class Distancia {
    
    double kilometrosPorHora;

    public Distancia(double kilometrosPorHora) {
        this.kilometrosPorHora = kilometrosPorHora;
    }

    public long aMillasPorHora(double kilometrosPorHora) {
        if (kilometrosPorHora < 0) {
            return (long) -1;
        } else {
            long valor = (long) Math.ceil(kilometrosPorHora*0.621);
            return valor;
        }
    }

    public void imprimirConversion(double kilometrosPorHora) {
        if (kilometrosPorHora < 0) {
            System.out.println("Valor no valido");
        } else {
            double valor = (double) Math.round(kilometrosPorHora*0.621);
            System.out.println(kilometrosPorHora+"km/h = "+valor+"mi/h");
        }
    }
}
