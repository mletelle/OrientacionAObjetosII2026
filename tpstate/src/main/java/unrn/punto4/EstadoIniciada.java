package unrn.punto4;

import static unrn.punto4.OrdenDeCompra.MSG_ERROR_ENVIAR;

public class EstadoIniciada implements EstadoOrden {
    private OrdenDeCompra orden;

    public EstadoIniciada(OrdenDeCompra orden) {
        this.orden = orden;
    }

    @Override
    public void agregarProducto(Producto p) {
        orden.agregar(p);
    }

    @Override
    public void confirmarCompra() {
        this.orden.aPreparacion();
    }

    @Override
    public void enviar() {
        throw new IllegalStateException(MSG_ERROR_ENVIAR);
    }

    @Override
    public void cancelar() {
        this.orden.aCancelada();
    }

    @Override
    public String estado() {
        return "INICIADA";
    }
}
