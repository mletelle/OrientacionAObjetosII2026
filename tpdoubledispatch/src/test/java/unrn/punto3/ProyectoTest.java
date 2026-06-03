package unrn.punto3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProyectoTest {

    @Test
    public void hitoriaNoPuedeContenerAHistoria() {
        var tareaCompleja = new TareaCompleja(10, new HistoriaUsuario());
        var tareaCompleja2 = new TareaCompleja(20, new HistoriaUsuario());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(tareaCompleja2);
        });
        assertEquals(TareaCompleja.ASIGNACION_INVALIDA, e.getMessage());
    }

    @Test
    public void hitoriaNoPuedeContenerASpike() {
        var tareaCompleja = new TareaCompleja(10, new HistoriaUsuario());
        var spike = new Tarea(20, new Spike()
        );
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(spike);
        });
        assertEquals(TareaCompleja.ASIGNACION_INVALIDA, e.getMessage());
    }

    @Test
    public void epicaNoPuedeContenerTareaDesarrollo() {
        var tareaCompleja = new TareaCompleja(10, new Epica());
        var td = new Tarea(20, new TareaDesarrollo());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(td);
        });
        assertEquals(TareaCompleja.ASIGNACION_INVALIDA, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnaEpicaComoTareaSimple() {
        var e = assertThrows(RuntimeException.class, () -> {
            new Tarea(20, new Epica());
        });
        assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnaHSComoTareaSimple() {
        var e = assertThrows(RuntimeException.class, () -> {
            new Tarea(20, new HistoriaUsuario());
        });
        assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnSpikeComoTareaCompleja() {
        var e = assertThrows(RuntimeException.class, () -> {
            new TareaCompleja(20, new Spike());
        });
        assertEquals(TareaCompleja.VALIDA_TAREA_COMPLEJA, e.getMessage());
    }

    @Test
    public void historiaPuedeContenerTareaDeDesarrollo() {
        var historia = new TareaCompleja(10, new HistoriaUsuario());
        var tarea = new Tarea(20, new TareaDesarrollo());

        historia.agregarItem(tarea);

        assertEquals(30, historia.horasTotales());
    }

    @Test
    public void epicaPuedeContenerSpike() {
        var epica = new TareaCompleja(10, new Epica());
        var spike = new Tarea(20, new Spike());

        epica.agregarItem(spike);

        assertEquals(30, epica.horasTotales());
    }
}