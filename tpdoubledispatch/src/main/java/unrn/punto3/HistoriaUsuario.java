package unrn.punto3;

public class HistoriaUsuario extends TipoTarea {
    @Override
    public boolean puedeContenerA(TipoTarea tipo) {
        return tipo.puedeSerContenidaPorHistoriaUsuario();
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
