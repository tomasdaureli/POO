package ejercicio6;

public class Alumno {
    
    private int id_alumno;
    private String tipoDoc;
    private int nroDoc;
    private String nombre;

    public Alumno(String tipoDoc, int nroDoc, String nombre) {
        this.tipoDoc = tipoDoc;
        this.nroDoc = nroDoc;
        this.nombre = nombre;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    
    
}
