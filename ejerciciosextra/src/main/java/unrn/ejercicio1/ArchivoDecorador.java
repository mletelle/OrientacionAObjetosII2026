package unrn.ejercicio1;

import java.time.LocalDate;

public abstract class ArchivoDecorador implements ArchivoMostrable {
    protected ArchivoMostrable archivo;

    public ArchivoDecorador(ArchivoMostrable archivo) {
        this.archivo = archivo;
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint();
    }

    @Override
    public String nombre() {
        return archivo.nombre();
    }

    @Override
    public String extension() {
        return archivo.extension();
    }

    @Override
    public long tamanio() {
        return archivo.tamanio();
    }

    @Override
    public LocalDate fechaCreacion() {
        return archivo.fechaCreacion();
    }

    @Override
    public LocalDate fechaModificacion() {
        return archivo.fechaModificacion();
    }

    @Override
    public String permiso() {
        return archivo.permiso();
    }

    public String agregar(String texto) {
        return prettyPrint() + " " + texto;
    }
}
