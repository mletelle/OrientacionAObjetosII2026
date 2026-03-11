package ar.unrn.telldontask;

import ar.unrn.telldontask.carrito.CarritoCompras;
import ar.unrn.telldontask.carrito.Cliente;
import ar.unrn.telldontask.carrito.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoTest {
    @Test
    public void test01() {
        var cliente = new Cliente();
        var carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("p1", 3F));
        carrito.agregarProducto(new Producto("p2", 20F));

        assertEquals(23F, cliente.calcularCosto(carrito));
    }
}
