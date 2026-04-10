package unrn.punto1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ConcursoTest {
    @Test
    public void inscribirUnParticipante() {
        Participante juan = new Participante(1, "Juan", "juan@mail.com");
        Registrador fake = new RegistradorFake();
        Notificador fakeNotificador = new NotificadorFake();
        Concurso concurso = new Concurso(1, "Concurso de Programacion", LocalDate.now().minusDays(1), LocalDate.now().plusDays(10), fake, fakeNotificador);
        concurso.inscribirA(juan);
        assertTrue(concurso.estaInscripto(juan));
        assertEquals(0, juan.cuantosPuntos());

    }

    @Test
    public void inscribirConBonificacion() {
        Participante juan = new Participante(1, "Juan", "juan@mail.com");
        Registrador fake = new RegistradorFake();
        Notificador fakeNotificador = new NotificadorFake();
        Concurso concurso = new Concurso(1, "Concurso de Programacion", LocalDate.now(), LocalDate.now().plusDays(10), fake, fakeNotificador);
        concurso.inscribirA(juan);
        assertTrue(concurso.estaInscripto(juan));
        assertEquals(10, juan.cuantosPuntos());
    }

    @Test
    public void inscribirAntesDeInicio() {
        Participante juan = new Participante(1, "Juan", "juan@mail.com");
        Registrador fake = new RegistradorFake();
        Notificador fakeNotificador = new NotificadorFake();
        Concurso concurso = new Concurso(1, "Concurso de Programacion", LocalDate.now().plusDays(1), LocalDate.now().plusDays(10), fake, fakeNotificador);
        assertThrows(IllegalArgumentException.class, () -> concurso.inscribirA(juan));
    }

    @Test
    public void inscribirDespuesDeFin() {
        Participante juan = new Participante(1, "Juan", "juan@mail.com");
        Registrador fake = new RegistradorFake();
        Notificador fakeNotificador = new NotificadorFake();
        Concurso concurso = new Concurso(1, "Concurso de Programacion", LocalDate.now().minusDays(4), LocalDate.now().minusDays(2), fake, fakeNotificador);
        assertThrows(IllegalArgumentException.class, () -> concurso.inscribirA(juan));
    }

    @Test
    public void verificarIguales() {
        Participante p1 = new Participante(1, "Juan", "juan@mail.com");
        Participante p2 = new Participante(1, "Juan", "juan@mail.com");
        assertEquals(p1, p2);
    }
}

