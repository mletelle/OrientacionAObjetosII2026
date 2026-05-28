package unrn.punto4;

public class ComboFamiliar implements Combo {
    @Override
    public String descripcion() {
        return "Combo familiar hamburguesa y bebida para 2";
    }

    @Override
    public double precio() {
        return 28000;
    }
}
