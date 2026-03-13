package ar.unrn.telldontask.carrito;

public class Producto {

    private String descripcion;
    private Float precio;

    public Producto(String descripcion,
                    Float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float precio() {
        return precio;
    }

    public String descripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
