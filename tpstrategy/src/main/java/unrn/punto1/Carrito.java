package unrn.punto1;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito(ArrayList<Producto> productos) {
        this.productos = new ArrayList<>(productos);
    }

    public void agregarACarrito(Producto producto) {
        this.productos.add(producto);
    }

    public double subTotal() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.precio();
        }
        return total;
    }

    public double pesoTotal() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.peso();
        }
        return total;
    }

    public double costoTotal(EstrategiaEnvio envio, String destino) {
        return this.subTotal() + envio.costoEnvio(destino, this.pesoTotal());
    }

}
