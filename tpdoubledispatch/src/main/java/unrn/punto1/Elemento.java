package unrn.punto1;

public abstract class Elemento {
    abstract boolean leGanaA(Elemento otra);
    abstract boolean pierdeContraPiedra();
    abstract boolean pierdeContraPapel();
    abstract boolean pierdeContraTijera();
    boolean empataCon(Elemento otra){
        return this.getClass().equals(otra.getClass());
    }
}
