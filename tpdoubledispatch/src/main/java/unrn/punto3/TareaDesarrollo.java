package unrn.punto3;

public class TareaDesarrollo extends TipoTarea {
    @Override
    public boolean puedeContenerA(TipoTarea tipo) {
        return false;
    }

    @Override
    public boolean puedeSerContenidaPorHistoriaUsuario() {
        return true;
    }

    @Override
    public boolean puedeSerContenidaPorEpica() {
        return false;
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
