package unrn.punto1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EstrategiaEnvioTest {
    @Test
    void calculaCostoTotalConColectivosSurCapitalFederalMenosDeCincoKilos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(10000, 2));
        productos.add(new Producto(5000, 3));

        Carrito carrito = new Carrito(productos);

        assertEquals(16000, carrito.costoTotal(new ColectivosSur(), "Capital Federal"));
    }

    @Test
    void calculaCostoTotalConCorreoArgentinoAOtroDestino() {
        ServicioDistanciaAr distanciaFake = destino -> 100;

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(10000, 1));

        Carrito carrito = new Carrito(productos);

        assertEquals(11300, carrito.costoTotal(new CorreoArgentino(distanciaFake), "Bariloche"));
    }
}