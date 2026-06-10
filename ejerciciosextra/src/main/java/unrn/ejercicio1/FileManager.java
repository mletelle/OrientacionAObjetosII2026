package unrn.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManager {
    private List<Archivo> archivos = new ArrayList<>();

    public void crearArchivo(Archivo archivo) {
        this.archivos.add(archivo);
    }

    public List<Archivo> archivos() {
        return Collections.unmodifiableList(archivos);
    }
}
