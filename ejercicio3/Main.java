package ejercicio3;

public class Main {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();

        Rectangulo r1 = new Rectangulo();

        double areaCirculo = c1.area(5.0);

        double areaRectangulo = r1.area(5.0, 4.0);

        System.out.println("El area del circulo es " + areaCirculo);

        System.out.println("El area del rectangulo es " + areaRectangulo);
    }
}

