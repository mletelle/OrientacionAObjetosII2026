package unrn.ejercicio4;

public class ConvenioRegular implements Convenio {

    @Override
    public double sueldoPara(Temporario temporario) {
        double basico = 20000 + temporario.horasTrabajadas() * 300;
        double adicional = temporario.cantidadDeHijos() * 2000;
        if (temporario.esCasado()) {
            adicional += 5000;
        }
        return calcularNeto(basico, adicional);
    }

    @Override
    public double sueldoPara(Pasante pasante) {
        double basico = 20000;
        double adicional = pasante.cantidadExamenesRendidos() * 2000;
        return calcularNeto(basico, adicional);
    }

    @Override
    public double sueldoPara(Planta planta) {
        double basico = 50000;
        double adicional = planta.cantidadDeHijos() * 20000 + planta.aniosAntiquedad() * 2000;
        if (planta.esCasado()) {
            adicional += 5000;
        }
        return calcularNeto(basico, adicional);
    }

    private double calcularNeto(double basico, double adicional) {
        return basico * 0.87 + adicional * 0.95;
    }
}
