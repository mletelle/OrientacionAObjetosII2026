package unrn.punto2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Producto> productos;
    private final Tarjeta tarjeta;
    private final Propina propina;

    public Pedido(Tarjeta tarjeta, Propina propina) {
        if (tarjeta == null || propina == null) {
            throw new IllegalArgumentException(
                    "Debe ingresar tarjeta y propina");
        }
        this.productos = new ArrayList<>();
        this.tarjeta = tarjeta;
        this.propina = propina;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotal() {
        double totalBebidas = 0;
        double totalPlatos = 0;
        for (Producto producto : this.productos) {
            totalBebidas += producto.precioBebida();
            totalPlatos += producto.precioPlato();
        }
        double subtotal = this.tarjeta.descontarBebida(totalBebidas)
                + this.tarjeta.descontarPlato(totalPlatos);
        return subtotal + this.propina.calcularPropina(subtotal);
    }
}
