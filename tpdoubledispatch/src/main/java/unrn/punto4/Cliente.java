package unrn.punto4;

import java.util.List;

public class Cliente {
    private List<Producto> compra;
    private String nombre;
    private TipoCliente tipo;

    public Cliente(String nombre, TipoCliente tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void agregarProducto(Producto producto) {
        this.compra.add(producto);
    }

    public TipoCliente tipo() {
        return tipo;
    }

    public List<Producto> compra() {
        return List.copyOf(compra);
    }
}