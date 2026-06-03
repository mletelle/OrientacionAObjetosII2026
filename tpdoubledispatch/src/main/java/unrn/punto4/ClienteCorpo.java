package unrn.punto4;

public class ClienteCorpo extends TipoCliente {
    @Override
    float impuestoParaProductoFisico(ProductoFisico producto) {
        return producto.precio() * 0.21f;
    }

    @Override
    float impuestoParaServicioDigital(ServicioDigital servicio) {
        return 0;
    }

    @Override
    float costoEnvioFisico(ProductoFisico producto) {
        float precio = (producto.precio() * producto.peso());
        return precio * (0.5f);
    }

    @Override
    float costoEnvioDigital(ServicioDigital servicio) {
        return 0;
    }
}
