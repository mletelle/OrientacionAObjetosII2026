package oop2.tp3.ejercicio3;

public class GastoDesayuno implements Gasto {
    private int monto;

    public GastoDesayuno(int monto) {
        this.monto = monto;
    }

    @Override
    public String nombreDelGasto() {
        return "Desayuno";
    }

    @Override
    public int calcularGasto() {
        return monto;
    }

    @Override
    public int gastoComida() {
        return monto;
    }

    @Override
    public String gastoEnExceso() {
        return monto > 1000 ? "X" : " ";
    }
}
