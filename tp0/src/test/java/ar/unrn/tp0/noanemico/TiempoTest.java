package ar.unrn.tp0.noanemico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TiempoTest {

    @Test
    public void testFormatoCorto() {
        Tiempo tiempo = new Tiempo();
        String formato = tiempo.getFormatoCorto();

        assertNotNull(formato);
        assertTrue(formato.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    @Test
    public void testFormatoLargo() {
        Tiempo tiempo = new Tiempo();
        String formato = tiempo.getFormatoLargo();

        assertNotNull(formato);
        assertTrue(formato.contains("de") && formato.length() > 10);
    }
}
