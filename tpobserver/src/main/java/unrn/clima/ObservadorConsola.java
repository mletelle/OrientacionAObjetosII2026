package unrn.clima;

public class ObservadorConsola implements Observador {
    private static final int UMBRAL_CALOR = 17;
    private static final int UMBRAL_FRIO = 12;

    @Override
    public void actualizar(String temperatura) {
        double valor = convertirANumero(temperatura);
        if (valor < UMBRAL_FRIO) {
            System.out.println("Hace frio, se encenderá la caldera");
        }

        if (valor > UMBRAL_CALOR) {
            System.out.println("Hace calor, se encenderá el aire acondicionado");
        }
    }

    private double convertirANumero(String temperatura) {
        return Double.parseDouble(temperatura.replace(" c", "").trim());
    }
}
