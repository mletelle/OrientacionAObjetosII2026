package unrn.punto1;

public class Piedra extends Elemento {
    @Override
    public boolean leGanaA(Elemento otra) {
        return otra.pierdeContraPiedra();
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }

    @Override
    public boolean pierdeContraPapel() {
        return true;
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

}
