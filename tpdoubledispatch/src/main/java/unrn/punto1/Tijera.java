package unrn.punto1;

public class Tijera extends Elemento{
    @Override
    public boolean leGanaA(Elemento otra) {
        return otra.pierdeContraTijera();
    }

    @Override
    public boolean pierdeContraPiedra() {
        return true;
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }


}
