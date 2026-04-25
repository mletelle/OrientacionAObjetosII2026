package oop2.tp3.ejercicio3;

public class GastoCena implements Gasto {
    private int monto;

    public GastoCena(int monto) {
        this.monto = monto;
    }

    @Override
    public String nombreDelGasto() {
        return "Cena";
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
        return monto > 5000 ? "X" : " ";
    }


}
