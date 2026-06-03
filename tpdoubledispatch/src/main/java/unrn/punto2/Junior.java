package unrn.punto2;

public class Junior extends Cargo {

    @Override
    public boolean puedeTenerA(Cargo subordinado) {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDeDirector() {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDeMandoMedio() {
        return true;
    }
}
