package unrn.punto1;

public class ColectivosSur implements EstrategiaEnvio {
    @Override
    public int costoEnvio(String destino, double pesoTotal) {
        int costo;

        if (destino.equalsIgnoreCase("Capital Federal")) {
            costo = 1000;
        } else if (destino.equalsIgnoreCase("Gran Buenos Aires")) {
            costo = 1500;
        } else {
            costo = 3000;
        }

        if (pesoTotal > 30) {
            costo += 2000;
        } else if (pesoTotal > 5) {
            costo += 500;
        }

        return costo;
    }
}
