package modelo;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmpleadoTest {

    @Test
    public void esElCumpleDe() {
        var empleado = new Empleado("Juan", "Perez", LocalDate.of(1990, 5, 15), "a@mail.com");
        assertTrue(empleado.esElCumpleDe(LocalDate.of(2026, 5, 15)));
    }

    @Test
    public void mandarMensajesAEmpleadoTrue() {
        ListaEmpleados fakeEmpleados = new FakeListaEmpleados() {
            @Override
            public List<Empleado> totalEmpleados() {
                return List.of(
                        new Empleado("Carlos", "Gomez", LocalDate.of(2000, 3, 29), "c@mail.com")
                );
            }
        };
        FakeNotificador fakeNotificador = new FakeNotificador();
        SaludadorCumple saludador = new SaludadorCumple(fakeEmpleados, fakeNotificador);
        saludador.saludarEmpleados(LocalDate.of(2026, 3, 29));
        assertEquals("c@mail.com", fakeNotificador.ultimoEmailEnviado());
    }
}