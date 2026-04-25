package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReporteDeGastosTest {

    @Test
    void imprimirGastosDesayuno() {
        var gastoDesa = new GastoDesayuno(1000);
        var reporte = new ReporteDeGastos(List.of(gastoDesa));
        String restultado = reporte.imprimir();
        assertEquals("Expenses " + LocalDate.now().toString() + "\nDesayuno	1000\t \nGastos de comida: 1000\nTotal de gastos: 1000\n", restultado);
    }

    @Test
    void imprimirGastosCena() {
        var gastoCena = new GastoCena(1000);
        var reporte = new ReporteDeGastos(List.of(gastoCena));
        String restultado = reporte.imprimir();
        assertEquals("Expenses " + LocalDate.now().toString() + "\nCena	1000\t \nGastos de comida: 1000\nTotal de gastos: 1000\n", restultado);

    }

    @Test
    void imprimirGastosAuto() {
        var gastoAuto = new GastoAuto(1000);
        var reporte = new ReporteDeGastos(List.of(gastoAuto));
        String restultado = reporte.imprimir();
        assertEquals("Expenses " + LocalDate.now().toString() + "\nAlquiler de Autos	1000\t \nGastos de comida: 0\nTotal de gastos: 1000\n", restultado);

    }

    @Test
    void imprimirGastosVarios() {
        var gasto1 = new GastoAuto(1000);
        var gasto2 = new GastoCena(1000);
        var gasto3 = new GastoDesayuno(1000);
        var reporte = new ReporteDeGastos(List.of(gasto1, gasto2, gasto3));
        String restultado = reporte.imprimir();
        assertEquals("Expenses " + LocalDate.now().toString() + "\nAlquiler de Autos	1000\t \nCena	1000\t \nDesayuno	1000\t \nGastos de comida: 2000\nTotal de gastos: 3000\n", restultado);
    }

    @Test
    void imprimirGastosExcede() {
        var gasto1 = new GastoAuto(3000);
        var gasto2 = new GastoCena(6000);
        var gasto3 = new GastoDesayuno(3000);
        var reporte = new ReporteDeGastos(List.of(gasto1, gasto2, gasto3));
        String restultado = reporte.imprimir();
        assertEquals("Expenses " + LocalDate.now().toString() + "\nAlquiler de Autos	3000\t \nCena	6000\tX\nDesayuno	3000\tX\nGastos de comida: 9000\nTotal de gastos: 12000\n", restultado);
    }
}