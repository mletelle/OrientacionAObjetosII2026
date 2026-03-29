package unrn.punto1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ConcursoTest {
    @Test
    public void inscribirUnParticipante() {
        Participante juan = new Participante("Juan");
        Concurso concurso = new Concurso("Concurso de Programacion", LocalDate.now().minusDays(1), LocalDate.now().plusDays(10));
        concurso.inscribirA(juan);
        assertTrue(concurso.estaInscripto(juan));
        assertEquals(0, juan.cuantosPuntos());

    }

    @Test
    public void inscribirConBonificacion() {
        Participante juan = new Participante("Juan");
        Concurso concurso = new Concurso("Concurso de Programacion", LocalDate.now(), LocalDate.now().plusDays(10));
        concurso.inscribirA(juan);
        assertTrue(concurso.estaInscripto(juan));
        assertEquals(10, juan.cuantosPuntos());
    }

    @Test
    public void inscribirDespuesDeFin() {
        Participante juan = new Participante("Juan");
        Concurso concurso = new Concurso("Concurso de Programacion", LocalDate.now().plusDays(1), LocalDate.now().plusDays(10));
        assertThrows(IllegalArgumentException.class, () -> concurso.inscribirA(juan));
    }

    @Test
    public void inscribirAntesDeIniciar() {
        Participante juan = new Participante("Juan");
        Concurso concurso = new Concurso("Concurso de Programacion", LocalDate.now().minusDays(4), LocalDate.now().minusDays(2));
        assertThrows(IllegalArgumentException.class, () -> concurso.inscribirA(juan));
    }

    @Test
    public void verificarIguales() {
        Participante p1 = new Participante("Juan");
        Participante p2 = new Participante("Juan");
        assertEquals(p1, p2);
    }
}

