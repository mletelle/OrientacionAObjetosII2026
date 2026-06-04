package unrn.punto5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrestamoTest {
    @Test
    void prestaLibroNuevoDe250PaginasPorTresDias() {
        Articulo libro = new Libro("Libro", "Autor", 250, new Nuevo());
        Prestamo prestamo = new Prestamo(new Cliente("Juan"), LocalDate.of(2026, 6, 4), libro);
        assertEquals(LocalDate.of(2026, 6, 7), prestamo.fechaFin());
    }

    @Test
    void prestaDiscoNuevo1975() {
        Articulo disco = new Disco("Disco", "Banda", 1975, new Nuevo());
        Prestamo prestamo = new Prestamo(new Cliente("Juan"), LocalDate.of(2026, 6, 4), disco);
        assertEquals(LocalDate.of(2026, 6, 7), prestamo.fechaFin());
    }

    @Test
    void prestaDiscoUsado1980() {
        Articulo disco = new Disco("Disco", "Banda", 1980, new Usado());
        Prestamo prestamo = new Prestamo(new Cliente("Juan"), LocalDate.of(2026, 6, 4), disco);
        assertEquals(LocalDate.of(2026, 6, 9), prestamo.fechaFin());
    }

    @Test
    void noPrestaDiscoDeteriorado1979() {
        Articulo disco = new Disco("Disco", "Banda", 1979, new Deteriorado());
        assertThrows(RuntimeException.class, () -> new Prestamo(new Cliente("Juan"), LocalDate.of(2026, 6, 4), disco));
    }

    @Test
    void prestaRevistaNuevaMenos100() {
        Articulo revista = new Revista("Revista", "Autor", 80, LocalDate.of(2026, 1, 1), new Nuevo());
        Prestamo prestamo = new Prestamo(new Cliente("Juan"), LocalDate.of(2026, 6, 4), revista);

        assertEquals(LocalDate.of(2026, 6, 6), prestamo.fechaFin());
    }

    @Test
    void prestaRevistaDeteriorada() {
        Articulo revista = new Revista("Revista", "Autor", 2500, LocalDate.of(2000, 1, 1), new Deteriorado());
        Prestamo prestamo = new Prestamo(new Cliente("Juan"), LocalDate.of(2026, 6, 4), revista);
        assertEquals(LocalDate.of(2026, 6, 6), prestamo.fechaFin());
    }

}