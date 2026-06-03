package unrn.punto4;


public class ProductoFisico implements Producto {
    private float precio;
    private float iva;
    private String nombre;
    private int peso;

    public ProductoFisico(String nombre, float precio, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.iva = 0.21f;
    }

    public int peso() {
        return this.peso;
    }

    @Override
    public float precio() {
        return precio;
    }

    @Override
    public float costoEnvio(TipoCliente tipo) {
        return tipo.costoEnvioFisico(this);
    }

    @Override
    public float impuesto(TipoCliente tipo) {
        return tipo.impuestoParaProductoFisico(this);
    }
}
