package unrn.punto2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements ItemProyecto {
    private List<ItemProyecto> itemProyectos;

    public Proyecto() {
        this.itemProyectos = new ArrayList<ItemProyecto>();
    }

    @Override
    public int calcularTiempo() {
        int tiempoTotal = 0;
        for (ItemProyecto item : itemProyectos) {
            tiempoTotal += item.calcularTiempo();
        }
        return tiempoTotal;
    }

    public void agregarItem(ItemProyecto itemProyecto) {
        itemProyectos.add(itemProyecto);
    }
}
