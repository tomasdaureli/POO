package ejercicio6;

import java.util.ArrayList;

public class Carrera {
    
    private int codigo;
    private String descripcion;
    private ArrayList<Materia> listadoMaterias;
    private Estado estado;
    
    public boolean carreraActiva() {
        if (estado == Estado.Activa) {
            return true;
        } else {
            return false;
        } 
        
    }

    
}
