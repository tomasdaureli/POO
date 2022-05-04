package ejercicio4;

public class Main {
    public static void main (String[] args) {
    
        Compras bob = new Compras(3.4,2.1,1.5,2);
        
        int baldes = bob.obtenerCuantosBaldes(3.4,1.5);
        
        System.out.println(baldes);
    }
    
}
