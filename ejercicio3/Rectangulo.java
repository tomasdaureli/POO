package ejercicio3;

public class Rectangulo {
    
    double x, y;

    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }
}
