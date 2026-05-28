package unrn.punto6;

public abstract class Torta {
    private final float COSTO = 10;

    public float precio() {
        return COSTO;
    }

    public abstract String descripcion();
}
