package unrn.punto5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemeraTest {
    @Test
    public void remeraNacionalTest() {
        Remera r = new RemeraNacional(100);
        assertEquals(93.38, r.calcularPrecioFinal(), 0.01);
    }

    @Test
    public void remeraImportadaTest() {
        Remera r = new RemeraImportada(100);
        assertEquals(135.18, r.calcularPrecioFinal(), 0.01);
    }
}