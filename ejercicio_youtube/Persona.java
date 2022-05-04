package ejercicio_youtube;

public class Persona {
    
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;

    public Persona(int dni, String nombre, String apellido, int telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + ", nombre=" + nombre
                + ", telefono=" + telefono + "]";
    }

    
}
