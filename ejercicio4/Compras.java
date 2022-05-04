package ejercicio4;

public class Compras {
    
    double ancho;
    double altura;
    double areaPorBalde;
    int baldesExtra;

    public Compras(double ancho, double altura, double areaPorBalde, int baldesExtra) {
        this.ancho = ancho;
        this.altura = altura;
        this.areaPorBalde = areaPorBalde;
        this.baldesExtra = baldesExtra;
    }
    
    public int obtenerCuantosBaldes(double ancho, double altura, double areaPorBalde, int baldesExtra) {
        if (ancho <= 0 || altura <= 0 || areaPorBalde <= 0 || baldesExtra < 0) {
            return -1;
        } else {
            double area = ancho * altura;
            double baldes = Math.ceil(area / areaPorBalde);
            if (area > areaPorBalde) {
                double faltante = baldes - baldesExtra;
                return (int) faltante;
            } else {
                if (baldesExtra == 0) {
                    return (int) baldes;
                } else {
                    double faltante = baldes - baldesExtra;
                    return (int) faltante;
                }
            }
        }
    }

    public int obtenerCuantosBaldes(double ancho, double altura, double areaPorBalde) {
        if (ancho <= 0 || altura <= 0 || areaPorBalde <= 0) {
            return -1;
        } else {
            double area = ancho * altura;
            double baldes = Math.ceil(area / areaPorBalde);
            return (int) baldes;
        }
    }

    public int obtenerCuantosBaldes(double area, double areaPorBalde) {
        if (area <= 0 || areaPorBalde <= 0) {
            return -1;
        } else {
            double baldes = Math.ceil(area / areaPorBalde);
            return (int) baldes;
        }
    }
}
