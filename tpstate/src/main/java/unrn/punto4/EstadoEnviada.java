package unrn.punto4;

import static unrn.punto4.OrdenDeCompra.*;

public class EstadoEnviada implements EstadoOrden {
    private OrdenDeCompra orden;

    public EstadoEnviada(OrdenDeCompra orden) {
        this.orden = orden;
    }

    @Override
    public void agregarProducto(Producto p) {
        throw new IllegalStateException(MSG_ERROR_AGREGAR_PRODUCTO);
    }

    @Override
    public void confirmarCompra() {
        throw new IllegalStateException(MSG_ERROR_PREPARACION);
    }

    @Override
    public void enviar() {
        throw new IllegalStateException(MSG_ERROR_ENVIAR);
    }

    @Override
    public void cancelar() {
        throw new IllegalStateException(MSG_ERROR_CANCELAR);
    }

    @Override
    public String estado() {
        return "ENVIADA";
    }
}
