package unrn.ejercicio1;

import java.time.LocalDate;

public class Archivo implements ArchivoMostrable {
    private String nombre;
    private String extension;
    private long tamanio;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Permiso permiso;

    public Archivo(String nombre, String extension, long tamanio, LocalDate fechaCreacion, LocalDate fechaModificacion, Permiso permiso) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permiso = permiso;
    }

    @Override
    public String prettyPrint() {
        return nombre();
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String extension() {
        return extension;
    }

    @Override
    public long tamanio() {
        return tamanio;
    }

    @Override
    public LocalDate fechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public LocalDate fechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public String permiso() {
        return permiso.descripcion();
    }
}
