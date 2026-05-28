package unrn.punto6;

public class Rockets extends DecoradorTorta {

    public Rockets(Torta torta) {
        super(torta);
    }

    @Override
    public float precio() {
        return precioTorta() + 5;
    }

    @Override
    public String descripcion() {
        return descripcionTorta() + " con rocklets";
    }
}
