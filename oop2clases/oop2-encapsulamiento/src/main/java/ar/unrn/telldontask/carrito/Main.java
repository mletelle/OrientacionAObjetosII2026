package ar.unrn.telldontask.carrito;

public class Main {
    public static void main(String[] args) {
        var cliente = new Cliente();
        var carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("p1", 3F));
        carrito.agregarProducto(new Producto("p2", 20F));
        var productos = carrito.getProductos();
        productos.add(new Producto("p3", 10F));
        System.out.println(carrito.getProductos().toString());
    }
}
