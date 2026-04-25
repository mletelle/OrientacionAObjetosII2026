package oop2.tp3.ejercicio5;

import java.util.List;
import java.util.Map;

public class Calculador {
    private Map<String, CalcularEvento> calculoPorTipo = Map.of("Drama", new EventoDrama(), "Comedia", new EventoComedia());

    public String reporte(Factura factura, List<Evento> eventos) {
        float totalAmount = 0;
        float creditos = 0;
        var result = "Facturación para " + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            var tipo = eventos.stream().filter(e -> e.nombreEvento().equals(actuacion.nombreEvento())).findFirst().orElseThrow(() -> new RuntimeException("Evento no encontrado")).tipo();
            CalcularEvento calculo = calculoPorTipo.get(tipo);
            float monto = calculo.calcularMonto(actuacion.numberoEspectadores());
            creditos += calculo.calcularCreditos(actuacion.numberoEspectadores());
            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.numberoEspectadores() + System.lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
            totalAmount += monto;
        }
        result += "Monto ganado: " + totalAmount + System.lineSeparator();
        result += "Créditos ganados: " + creditos + System.lineSeparator();

        return result;
    }
}
