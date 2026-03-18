package ar.unrn.punto2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RestoTest {

    @Test
    void testVisa() {
        Pedido pedidoTest = new Pedido(Tarjeta.VISA, Propina.CINCO);
        pedidoTest.agregarProducto(new Bebida(100));
        pedidoTest.agregarProducto(new Plato(100));
        var valorEsperado = ((100 * 0.97) + (100)) * 1.05;
        assertEquals(valorEsperado, pedidoTest.calcularPrecioTotal());
    }

    @Test
    void testMastercard() {
        Pedido pedidoTest = new Pedido();
        pedidoTest.agregarProducto(new Bebida(100));
        pedidoTest.agregarProducto(new Plato(100));
        pedidoTest.datosPago(Tarjeta.MASTERCARD, Propina.DOS);
        var valorEsperado = ((100) + (100 * 0.98)) * 1.02;
        assertEquals(valorEsperado, pedidoTest.calcularPrecioTotal());
    }

    @Test
    void testComarcaPlus() {
        Pedido pedidoTest = new Pedido();
        pedidoTest.agregarProducto(new Bebida(100));
        pedidoTest.agregarProducto(new Plato(100));
        pedidoTest.datosPago(Tarjeta.COMARCA, Propina.TRES);
        var valorEsperado = (((100) + (100)) * 1.03) * 0.98;
        assertEquals(valorEsperado, pedidoTest.calcularPrecioTotal());
    }

    @Test
    void testViedma() {
        Pedido pedidoTest = new Pedido();
        pedidoTest.agregarProducto(new Bebida(100));
        pedidoTest.agregarProducto(new Plato(100));
        pedidoTest.datosPago(Tarjeta.OTRA, Propina.TRES);
        var valorEsperado = ((100) + (100)) * 1.03;
        assertEquals(valorEsperado, pedidoTest.calcularPrecioTotal());
    }

    @Test
    void testError() {
        Pedido pedidoTest = new Pedido();
        pedidoTest.agregarProducto(new Bebida(100));
        pedidoTest.agregarProducto(new Plato(100));
        assertThrows(IllegalArgumentException.class, () -> pedidoTest.calcularPrecioTotal());
    }

}