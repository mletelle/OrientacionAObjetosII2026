package unrn.punto4;

public class ConTomate extends ComboDecorador {
    public ConTomate(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return descripcionCombo() + ", tomate";
    }

    @Override
    public double precio() {
        return precioCombo() + 1000;
    }
}
