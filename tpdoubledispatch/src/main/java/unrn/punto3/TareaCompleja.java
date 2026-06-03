package unrn.punto3;


import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";
    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear TS o Spike como Tarea Compleja";
    public static final String ASIGNACION_INVALIDA = "Asignacion invalida";
    private List<ItemDeProyecto> items;
    private int horasEstimadas;
    private TipoTarea tipoTarea;

    public TareaCompleja(int horasEstimadas, TipoTarea tipoTarea) {
        if (!tipoTarea.esTareaCompleja()) {
            throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
        }
        this.items = new ArrayList<>();
        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
    }

    public void agregarItem(ItemDeProyecto item) {
        if (!this.tipoTarea.puedeContenerA(item.tipoTarea())) {
            throw new RuntimeException(ASIGNACION_INVALIDA);
        }
        this.items.add(item);
    }


    @Override
    public int horasTotales() {
        int horasTotales = this.horasEstimadas;
        for (ItemDeProyecto item : items) {
            horasTotales += item.horasTotales();
        }
        return horasTotales;
    }

    @Override
    public TipoTarea tipoTarea() {
        return this.tipoTarea;
    }
}