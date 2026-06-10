package unrn.ejercicio1;

import java.time.LocalDate;

public interface ArchivoMostrable {
    String prettyPrint();

    String nombre();

    String extension();

    long tamanio();

    LocalDate fechaCreacion();

    LocalDate fechaModificacion();

    String permiso();
}
