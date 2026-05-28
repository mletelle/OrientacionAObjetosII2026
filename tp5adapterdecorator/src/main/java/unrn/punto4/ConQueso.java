package unrn.punto4;

public class ConQueso extends ComboDecorador {
    public ConQueso(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return descripcionCombo() + ", queso";
    }

    @Override
    public double precio() {
        return precioCombo() + 1800;
    }
}
