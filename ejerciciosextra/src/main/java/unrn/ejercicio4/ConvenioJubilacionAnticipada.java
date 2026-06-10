package unrn.ejercicio4;

public class ConvenioJubilacionAnticipada implements Convenio {

    @Override
    public double sueldoPara(Temporario temporario) {
        double basico = 15000 + temporario.horasTrabajadas() * 150;
        double adicional = temporario.cantidadDeHijos() * 2000;
        return calcularNeto(basico, adicional);
    }

    @Override
    public double sueldoPara(Pasante pasante) {
        double basico = 19000;
        double adicional = pasante.cantidadExamenesRendidos() * 1000;
        return calcularNeto(basico, adicional);
    }

    @Override
    public double sueldoPara(Planta planta) {
        double basico = 45000;
        double adicional = planta.cantidadDeHijos() * 2000 + planta.aniosAntiquedad() * 15000;

        return calcularNeto(basico, adicional);
    }

    private double calcularNeto(double basico, double adicional) {
        return basico * 0.85 + adicional * 0.95;
    }
}
