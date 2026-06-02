package unrn.clima;

import java.util.ArrayList;
import java.util.List;

public class Medidor {
    private String temperatura;
    private ClimaOnline clima;
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    private void notificar(String temperatura) {
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
        }
    }

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    public String leerTemperatura() {
        this.temperatura = this.clima.temperatura();
        this.notificar(this.temperatura);
        return this.temperatura;
    }
}
