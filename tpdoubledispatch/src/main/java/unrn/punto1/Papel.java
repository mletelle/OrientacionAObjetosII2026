package unrn.punto1;

public class Papel extends Elemento{
    @Override
    public boolean leGanaA(Elemento otra) {
        return otra.pierdeContraPapel();
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraTijera() {
        return true;
    }

}
