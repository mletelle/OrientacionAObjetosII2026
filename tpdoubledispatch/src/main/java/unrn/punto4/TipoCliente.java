package unrn.punto4;

public abstract class TipoCliente {
    abstract float impuestoParaProductoFisico(ProductoFisico producto);

    abstract float impuestoParaServicioDigital(ServicioDigital servicio);

    abstract float costoEnvioFisico(ProductoFisico producto);

    abstract float costoEnvioDigital(ServicioDigital servicio);
}