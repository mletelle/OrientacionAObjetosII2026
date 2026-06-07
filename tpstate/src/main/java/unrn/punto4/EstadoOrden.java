package unrn.punto4;

public interface EstadoOrden {
    void agregarProducto(Producto p);

    void confirmarCompra();

    void enviar();

    void cancelar();

    String estado();
}
