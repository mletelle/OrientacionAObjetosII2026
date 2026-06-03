package unrn.punto2;

public abstract class Cargo {
    public abstract boolean puedeTenerA(Cargo subordinado);

    public abstract boolean puedeSerSubordinadoDeDirector();

    public abstract boolean puedeSerSubordinadoDeMandoMedio();
}