package unrn.ejercicio4;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {
    @Test
    void calculaSueldoDePlanta() {
        var empleado = new Planta(true, 2, Year.now().minusYears(3), new ConvenioRegular());
        // Basico: 50000. Adicional: 5000 (casado) + 4000 (hijos) + 60000 (antiguedad)
        var expected = 50000 * 0.87 + 51000 * 0.95;
        assertEquals(expected, empleado.sueldo(), 0.001);
    }

    @Test
    void calculaSueldoDeTemporario() {
        var empleado = new Temporario(true, 1, Year.now(), 10, new ConvenioRegular());
        // Basico: 20000 + (10 * 300). Adicional: 5000 (casado) + 2000 (hijo)
        var expected = 23000 * 0.87 + 7000 * 0.95;
        assertEquals(expected, empleado.sueldo(), 0.001);
    }

    @Test
    void calculaSueldoDePasante() {
        var empleado = new Pasante(false, 0, Year.now(), 4, new ConvenioRegular());
        // Basico: 20000. Adicional: 4 * 2000 (examenes)
        var expected = 20000 * 0.87 + 8000 * 0.95;
        assertEquals(expected, empleado.sueldo(), 0.001);
    }

}