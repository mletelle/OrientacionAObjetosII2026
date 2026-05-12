package unrn.punto4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadorTest {
    @Test
    void calcularPrecioNoJubiladoEnMesPromocion() {
        LogTransaction logFake = new LogTransactionFake();
        int mes = 5;
        LocalDate fechaEnMayo = LocalDate.of(2026, 5, 12);
        Calculador calc = new CalculadorNoJubilado(logFake, mes, fechaEnMayo);
        double resultado = calc.calcularPrecio(100);
        assertEquals(115, resultado);
    }

    @Test
    void calcularPrecioJubiladoEnMesPromocion() {
        LogTransaction logFake = new LogTransactionFake();
        int mes = 5;  // Mayo es mes de promoción
        LocalDate fechaEnMayo = LocalDate.of(2026, 5, 12);
        Calculador calc = new CalculadorJubilado(logFake, mes, fechaEnMayo);
        double resultado = calc.calcularPrecio(100);
        assertEquals(100, resultado);
    }
}

class LogTransactionFake implements LogTransaction {
    @Override
    public void log(String name) {
        System.out.println("Log: " + name);
    }
}