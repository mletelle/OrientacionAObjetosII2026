package unrn.punto4;

import static unrn.punto4.OrdenDeCompra.MSG_ERROR_AGREGAR_PRODUCTO;
import static unrn.punto4.OrdenDeCompra.MSG_ERROR_PREPARACION;

public class EstadoEnPreparacion implements EstadoOrden {
    private OrdenDeCompra orden;

    public EstadoEnPreparacion(OrdenDeCompra orden) {
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
        this.orden.aEnviada();
    }

    @Override
    public void cancelar() {
        this.orden.aCancelada();
    }

    @Override
    public String estado() {
        return "EN_PREPARACION";
    }
}
