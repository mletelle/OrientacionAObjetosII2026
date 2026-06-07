package unrn.punto3;

public class EstadoEuforica implements EstadoGolondrina {
    private final Golondrina golondrina;
    private static final int KILOMETROS_DEL_PASEO = 5;

    public EstadoEuforica(Golondrina golondrina) {
        this.golondrina = golondrina;
    }

    @Override
    public void realizarDeseo() {
        this.golondrina.volar(KILOMETROS_DEL_PASEO);
        this.golondrina.volar(KILOMETROS_DEL_PASEO);// vuelta
    }
}
