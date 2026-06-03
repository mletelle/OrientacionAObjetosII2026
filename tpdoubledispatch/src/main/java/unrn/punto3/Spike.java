package unrn.punto3;

public class Spike extends TipoTarea {
    @Override
    public boolean puedeContenerA(TipoTarea tipo) {
        return false;
    }

    @Override
    public boolean puedeSerContenidaPorHistoriaUsuario() {
        return false;
    }

    @Override
    public boolean puedeSerContenidaPorEpica() {
        return true;
    }

    @Override
    public boolean esTareaSimple() {
        return true;
    }

    @Override
    public boolean esTareaCompleja() {
        return false;
    }
}
