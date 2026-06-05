package unrn.punto2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatoFechaNacimientoTest {

    @Test
    void fechaDeNacimientoCorto() {
        Persona persona = new Persona(LocalDate.of(1986, 6, 3), new FormatoFechaCorto());
        assertEquals("3-6-1986", persona.fechaNacimiento());
    }

    @Test
    void fechaDeNacimientoLargo() {
        Persona persona = new Persona(LocalDate.of(1986, 6, 3), new FormatoFechaLargo());
        assertEquals("3 de Junio de 1986", persona.fechaNacimiento());
    }
}