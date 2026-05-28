package unrn.punto4;

public class ConCarne extends ComboDecorador {
    public ConCarne(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return descripcionCombo() + ", carne extra";
    }

    @Override
    public double precio() {
        return precioCombo() + 5000;
    }

}
