package unrn.punto2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements ItemProyecto {
    private List<Tarea> tareas;

    public HistoriaUsuario() {
        this.tareas = new ArrayList<Tarea>();
    }

    @Override
    public int calcularTiempo() {
        int tiempoTotal = 0;
        for (Tarea tarea : tareas) {
            tiempoTotal += tarea.calcularTiempo();
        }
        return tiempoTotal;
    }

    public void agregarItem(Tarea t) {
        tareas.add(t);
    }
}
