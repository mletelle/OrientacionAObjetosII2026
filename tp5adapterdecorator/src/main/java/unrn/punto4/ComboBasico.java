package unrn.punto4;

public class ComboBasico implements Combo {
    @Override
    public String descripcion() {
        return "Combo basico hamburguesa y bebida";

    }

    @Override
    public double precio() {
        return 15000;
    }
}
