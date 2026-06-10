package unrn.ejercicio1;

public enum Permiso {
    LECTURA("solo lectura"),
    ESCRITURA("solo escritura");
    private final String descripcion;

    Permiso(String descripcion) {
        this.descripcion = descripcion;
    }

    public String descripcion() {
        return descripcion;
    }
}
