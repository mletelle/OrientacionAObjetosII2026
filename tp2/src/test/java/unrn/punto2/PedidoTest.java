package unrn.punto2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PedidoTest {

    @Test
    void visaDescuentaTresPorcientoEnBebidasConPropinaCinco() {
        Pedido pedido = new Pedido(Tarjeta.VISA, Propina.CINCO);
        pedido.agregarProducto(new Bebida(100));
        pedido.agregarProducto(new Plato(100));
        double subtotal = (100 * 0.97) + 100;
        double valorEsperado = subtotal + subtotal * 0.05;
        assertEquals(valorEsperado, pedido.calcularPrecioTotal());
    }

    @Test
    void mastercardDescuentaDosPorcientoEnBebidasConPropinaDos() {
        Pedido pedido = new Pedido(Tarjeta.MASTERCARD, Propina.DOS);
        pedido.agregarProducto(new Bebida(100));
        pedido.agregarProducto(new Plato(100));
        double subtotal = (100 * 0.98) + 100;
        double valorEsperado = subtotal + subtotal * 0.02;
        assertEquals(valorEsperado, pedido.calcularPrecioTotal());
    }

    @Test
    void comarcaDescuentaDosPorcientoEnBebidasYPlatosConPropinaTres() {
        Pedido pedido = new Pedido(Tarjeta.COMARCA, Propina.TRES);
        pedido.agregarProducto(new Bebida(100));
        pedido.agregarProducto(new Plato(100));
        double subtotal = (100 * 0.98) + (100 * 0.98);
        double valorEsperado = subtotal + subtotal * 0.03;
        assertEquals(valorEsperado, pedido.calcularPrecioTotal());
    }

    @Test
    void otraTarjetaNoAplicaDescuentoConPropinaTres() {
        Pedido pedido = new Pedido(Tarjeta.OTRA, Propina.TRES);
        pedido.agregarProducto(new Bebida(100));
        pedido.agregarProducto(new Plato(100));
        double subtotal = 100 + 100;
        double valorEsperado = subtotal + subtotal * 0.03;
        assertEquals(valorEsperado, pedido.calcularPrecioTotal());
    }

    @Test
    void crearPedidoSinTarjetaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Pedido(null, Propina.CINCO));
    }

    @Test
    void crearPedidoSinPropinaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Pedido(Tarjeta.VISA, null));
    }
}