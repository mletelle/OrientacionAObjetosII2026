package unrn.punto4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenDeCompraTest {
    @Test
    public void carritoTestInicia() {
        Producto p1 = new Producto("a", 100);
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        ordenDeCompra.agregarProducto(p1);
        assertEquals("INICIADA", ordenDeCompra.estado());
    }

    @Test
    public void carritoTestEnPreparacion() {
        Producto p1 = new Producto("a", 100);
        Producto p2 = new Producto("b", 200);
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        ordenDeCompra.agregarProducto(p1);
        ordenDeCompra.agregarProducto(p2);
        ordenDeCompra.confirmarCompra();
        assertEquals(300, ordenDeCompra.monto());
        assertEquals("EN_PREPARACION", ordenDeCompra.estado());
    }

    @Test
    public void carritoTestEnviada() {
        Producto p1 = new Producto("a", 100);
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        ordenDeCompra.agregarProducto(p1);
        ordenDeCompra.confirmarCompra();
        ordenDeCompra.enviar();
        assertEquals("ENVIADA", ordenDeCompra.estado());
    }

    @Test
    public void carritoTestCancelar() {
        Producto p1 = new Producto("a", 100);
        Producto p2 = new Producto("b", 200);
        Producto p3 = new Producto("c", 300);
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        ordenDeCompra.cancelar();
        assertEquals("CANCELADA", ordenDeCompra.estado());
    }

    @Test
    public void noPuedeConfirmarCompraSinProductos() {
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        var e = assertThrows(IllegalStateException.class, ordenDeCompra::confirmarCompra);
        assertEquals(OrdenDeCompra.MSG_ERROR_SIN_PRODUCTOS, e.getMessage());
    }

    @Test
    public void noPuedeEnviarIniciada() {
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        var e = assertThrows(IllegalStateException.class, ordenDeCompra::enviar);
        assertEquals(OrdenDeCompra.MSG_ERROR_ENVIAR, e.getMessage());
    }

    @Test
    public void noPuedeAgregarPreparacion() {
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        ordenDeCompra.agregarProducto(new Producto("a", 100));
        ordenDeCompra.confirmarCompra();
        var e = assertThrows(IllegalStateException.class, () -> ordenDeCompra.agregarProducto(new Producto("b", 200)));
        assertEquals(OrdenDeCompra.MSG_ERROR_AGREGAR_PRODUCTO, e.getMessage());
    }

    @Test
    public void noPuedeCancelarEnviada() {
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
        ordenDeCompra.agregarProducto(new Producto("a", 100));
        ordenDeCompra.confirmarCompra();
        ordenDeCompra.enviar();
        var e = assertThrows(IllegalStateException.class, ordenDeCompra::cancelar);
        assertEquals(OrdenDeCompra.MSG_ERROR_CANCELAR, e.getMessage());
    }
}