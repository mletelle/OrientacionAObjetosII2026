package unrn.punto2;

public class MandoMedio extends Cargo {
    @Override
    public boolean puedeTenerA(Cargo subordinado) {
        return subordinado.puedeSerSubordinadoDeMandoMedio();

    }

    @Override
    public boolean puedeSerSubordinadoDeDirector() {
        return true;
    }

    @Override
    public boolean puedeSerSubordinadoDeMandoMedio() {
        return false;
    }
}
