package ejercicio3;

public class Circulo {
    
    double radio;

    public double area(double radio) {
        if (radio < 0) {
            return -1;
        } else {
            return radio * radio * Math.PI;
            
        }
    }
}
