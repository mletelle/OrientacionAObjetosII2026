package unrn.punto4;

public abstract class ComboDecorador implements Combo {
    private final Combo combo;

    public ComboDecorador(Combo combo) {
        this.combo = combo;
    }

    public String descripcionCombo() {
        return combo.descripcion();
    }

    public double precioCombo() {
        return combo.precio();
    }
}
