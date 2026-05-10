package unrn.punto3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguro implements ItemSeguro {
    public static final double DESCUENTO_ACUMULATIVO = 0.05;
    private TipoSeguro tipo;
    private List<ItemSeguro> items;

    public PaqueteSeguro() {
        this.items = new ArrayList<>();
    }

    public void agregarSeguro(ItemSeguro item) {
        items.add(item);
    }

    @Override
    public double calcularMonto() {
        double montoTotal = 0;
        for (ItemSeguro item : items) {
            montoTotal += item.calcularMonto() * 0.95;
        }
        return montoTotal;
    }
}
