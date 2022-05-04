package ejercicio6;

import java.util.ArrayList;

public class Profesor {
    
    private int id_profesor;
    private String tipoDoc;
    private int nroDoc;
    private String nombre;
    private ArrayList<Materia> listaMaterias;

    public int getId_profesor() {
        return id_profesor;
    }
    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Profesor(String tipoDoc, int nroDoc, String nombre) {
        this.tipoDoc = tipoDoc;
        this.nroDoc = nroDoc;
        this.nombre = nombre;
    }

}
