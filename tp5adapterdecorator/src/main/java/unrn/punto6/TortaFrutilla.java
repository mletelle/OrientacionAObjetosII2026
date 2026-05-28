package unrn.punto6;

public class TortaFrutilla extends Torta {
    @Override
    public float precio() {
        return super.precio() * 2;
    }

    @Override
    public String descripcion() {
        return "Torta de bizcochuelo sabor frutilla";
    }
}
