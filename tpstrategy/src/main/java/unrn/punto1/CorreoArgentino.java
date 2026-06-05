package unrn.punto1;

public class CorreoArgentino implements EstrategiaEnvio {
    private ServicioDistanciaAr servicioDistancia;

    public CorreoArgentino(ServicioDistanciaAr servicioDistancia) {
        this.servicioDistancia = servicioDistancia;
    }

    @Override
    public int costoEnvio(String destino, double pesoTotal) {
        if (destino.equalsIgnoreCase("Capital Federal")) {
            return 500;
        }

        return 800 + 5 * this.servicioDistancia.distanciaEntreCapitalY(destino);
    }
}
