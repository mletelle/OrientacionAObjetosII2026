package oop2.tp3.ejercicio3;

public class GastoAuto implements Gasto {
    private int monto;

    public GastoAuto(int monto) {
        this.monto = monto;
    }

    @Override
    public int calcularGasto() {
        return monto;
    }

    @Override
    public String nombreDelGasto() {
        return "Alquiler de Autos";
    }

    @Override
    public int gastoComida() {
        return 0;
    }

    @Override
    public String gastoEnExceso() {
        return " ";
    }

}
