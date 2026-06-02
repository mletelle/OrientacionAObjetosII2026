package unrn.clima;

public class ObservadorConsola implements Observador {
    @Override
    public void actualizar(String temperatura) {
        double valor = convertirANumero(temperatura);
        if (valor < 12) {
            System.out.println("Hace frio, se encenderá la caldera");
        }

        if (valor > 17) {
            System.out.println("Hace calor, se encenderá el aire acondicionado");
        }
    }

    private double convertirANumero(String temperatura) {
        return Double.parseDouble(temperatura.replace(" c", "").trim());
    }
}
