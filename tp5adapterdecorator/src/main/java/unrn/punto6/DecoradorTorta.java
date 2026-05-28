package unrn.punto6;

public abstract class DecoradorTorta extends Torta {
    private Torta torta;

    public DecoradorTorta(Torta torta) {
        this.torta = torta;
    }

    protected String descripcionTorta() {
        return torta.descripcion();
    }

    protected float precioTorta() {
        return torta.precio();
    }
}
