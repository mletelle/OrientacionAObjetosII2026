package unrn.punto3;

public class Epica extends TipoTarea {
    @Override
    public boolean puedeContenerA(TipoTarea tipo) {
        return tipo.puedeSerContenidaPorEpica();
    }

    @Override
    public boolean puedeSerContenidaPorHistoriaUsuario() {
        return false;
    }

    @Override
    public boolean puedeSerContenidaPorEpica() {
        return false;
    }

    @Override
    public boolean esTareaSimple() {
        return false;
    }

    @Override
    public boolean esTareaCompleja() {
        return true;
    }
}
