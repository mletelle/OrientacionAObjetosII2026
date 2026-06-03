package unrn.punto3;

public abstract class TipoTarea {
    public abstract boolean puedeContenerA(TipoTarea tipo);

    public abstract boolean puedeSerContenidaPorHistoriaUsuario();

    public abstract boolean puedeSerContenidaPorEpica();

    public abstract boolean esTareaSimple();

    public abstract boolean esTareaCompleja();
}