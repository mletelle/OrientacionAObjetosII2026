package unrn.punto3;

public class EstadoDebil implements EstadoGolondrina {
    private final Golondrina golondrina;
    private static final int GRAMOS_NECESARIOS = 50;

    public EstadoDebil(Golondrina golondrina) {
        this.golondrina = golondrina;
    }

    @Override
    public void realizarDeseo() {
        this.golondrina.comer(GRAMOS_NECESARIOS);
    }
}
