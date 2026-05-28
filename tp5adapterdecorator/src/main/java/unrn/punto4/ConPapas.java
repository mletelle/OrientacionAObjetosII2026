package unrn.punto4;

public class ConPapas extends ComboDecorador {
    public ConPapas(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return descripcionCombo() + ", papas";
    }

    @Override
    public double precio() {
        return precioCombo() + 4500;
    }
}
