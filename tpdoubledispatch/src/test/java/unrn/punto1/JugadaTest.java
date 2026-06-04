package unrn.punto1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadaTest {

    @Test
    void piedraLeGanaATijera() {
        String resultado = new Jugada().jugar(new Piedra(), new Tijera());
        assertEquals(Jugada.GANASTE, resultado);
    }

    @Test
    void piedraPierdeConPapel() {
        String resultado = new Jugada().jugar(new Piedra(), new Papel());
        assertEquals(Jugada.PERDISTE, resultado);
    }

    @Test
    void piedraEmpataConPiedra() {
        String resultado = new Jugada().jugar(new Piedra(), new Piedra());
        assertEquals(Jugada.EMPATE, resultado);
    }

    @Test
    void papelLeGanaAPiedra() {
        String resultado = new Jugada().jugar(new Papel(), new Piedra());
        assertEquals(Jugada.GANASTE, resultado);
    }

    @Test
    void papelPierdeConTijera() {
        String resultado = new Jugada().jugar(new Papel(), new Tijera());
        assertEquals(Jugada.PERDISTE, resultado);
    }

    @Test
    void papelEmpataConPapel() {
        String resultado = new Jugada().jugar(new Papel(), new Papel());
        assertEquals(Jugada.EMPATE, resultado);
    }

    @Test
    void tijeraLeGanaAPapel() {
        String resultado = new Jugada().jugar(new Tijera(), new Papel());
        assertEquals(Jugada.GANASTE, resultado);
    }

    @Test
    void tijeraPierdeConPiedra() {
        String resultado = new Jugada().jugar(new Tijera(), new Piedra());
        assertEquals(Jugada.PERDISTE, resultado);
    }

    @Test
    void tijeraEmpataConTijera() {
        String resultado = new Jugada().jugar(new Tijera(), new Tijera());
        assertEquals(Jugada.EMPATE, resultado);
    }
}