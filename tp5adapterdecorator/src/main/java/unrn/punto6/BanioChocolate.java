package unrn.punto6;

public class BanioChocolate extends DecoradorTorta {
    public BanioChocolate(Torta torta) {
        super(torta);
    }

    @Override
    public float precio() {
        return precioTorta() * 1.15f;
    }

    @Override
    public String descripcion() {
        return descripcionTorta() + " con banio de chocolate";
    }

}
