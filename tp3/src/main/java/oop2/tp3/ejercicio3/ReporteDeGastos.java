package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;


public class ReporteDeGastos {
    List<Gasto> gastos;

    public ReporteDeGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    public String imprimir() {
        int total = 0;
        int gastosDeComida = 0;
        String salida = "";
        salida += "Expenses " + LocalDate.now().toString() + "\n";

        for (Gasto gasto : gastos) {
            salida += gasto.nombreDelGasto() + "\t";
            salida += gasto.calcularGasto() + "\t";
            salida += gasto.gastoEnExceso() + "\n";
            gastosDeComida += gasto.gastoComida();
            total += gasto.calcularGasto();

        }

        salida += "Gastos de comida: " + gastosDeComida + "\n";
        salida += "Total de gastos: " + total + "\n";
        return salida;
    }
}
