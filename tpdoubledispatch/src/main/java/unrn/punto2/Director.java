package unrn.punto2;

public class Director extends Cargo {
    @Override
    public boolean puedeTenerA(Cargo subordinado) {
        return subordinado.puedeSerSubordinadoDeDirector();
    }

    @Override
    public boolean puedeSerSubordinadoDeDirector() {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDeMandoMedio() {
        return false;
    }
}
