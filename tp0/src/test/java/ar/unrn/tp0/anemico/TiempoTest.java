package ar.unrn.tp0.anemico;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TiempoTest {

    @Test
    public void testTiempoInstanciacion() {
        Tiempo tiempo = new Tiempo();
        LocalDate hoy = LocalDate.now();

        assertEquals(hoy.getDayOfMonth(), tiempo.getDia());
        assertEquals(hoy.getMonthValue(), tiempo.getMes());
        assertEquals(hoy.getYear(), tiempo.getAnio());
    }

    @Test
    public void testSetters() {
        Tiempo tiempo = new Tiempo();
        tiempo.setDia(15);
        tiempo.setMes(6);
        tiempo.setAnio(2020);

        assertEquals(15, tiempo.getDia());
        assertEquals(6, tiempo.getMes());
        assertEquals(2020, tiempo.getAnio());
    }
}
