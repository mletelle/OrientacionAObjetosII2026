package unrn.punto4;

public class ClienteRegular extends TipoCliente {
    @Override
    float impuestoParaProductoFisico(ProductoFisico producto) {
        return producto.precio() * 0.21f;
    }

    @Override
    float impuestoParaServicioDigital(ServicioDigital servicio) {
        return servicio.precio() * 0.10f;
    }

    @Override
    float costoEnvioFisico(ProductoFisico producto) {
        return producto.precio() * producto.peso();
    }

    @Override
    float costoEnvioDigital(ServicioDigital servicio) {
        return 0;
    }
}
