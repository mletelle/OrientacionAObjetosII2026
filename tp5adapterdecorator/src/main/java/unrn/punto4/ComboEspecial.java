package unrn.punto4;

public class ComboEspecial implements Combo {
    @Override
    public String descripcion() {
        return "Combo especial hamburguesa completa con fritas y bebida";
    }

    @Override
    public double precio() {
        return 20000;
    }
}
