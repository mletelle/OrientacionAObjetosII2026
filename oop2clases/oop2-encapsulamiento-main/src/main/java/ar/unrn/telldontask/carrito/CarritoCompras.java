package ar.unrn.telldontask.carrito;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarritoCompras {
    private List<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        Objects.nonNull(producto);
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return this.productos;
        //si dejamos el getter, devolver copias y no objetos mutables
        // return Collections.unmodifiableList(this.productos);
        //return List.copyOf(this.productos);
        //return this.productos.stream();
    }
}
