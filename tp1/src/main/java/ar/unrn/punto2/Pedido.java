package ar.unrn.punto2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private Tarjeta tarjeta;
    private Propina propina;

    public Pedido(Tarjeta tarjeta, Propina propina) {
        this.productos = new ArrayList<>();
        this.tarjeta = tarjeta;
        this.propina = propina;
    }

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void datosPago(Tarjeta tarjeta, Propina propina) {
        this.tarjeta = tarjeta;
        this.propina = propina;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotal() {
        if (this.tarjeta == null || this.propina == null) {
            throw new IllegalArgumentException("Debe ingresar los datos");
        }
        double subtotal = this.productos.stream().mapToDouble(producto -> producto.calcularPrecio(this.tarjeta)).sum();
        return this.propina.calcularPropina(subtotal);
    }
}
