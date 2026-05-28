package unrn.punto1;

public class MotorEconomico implements Motor {
    @Override
    public String arrancar() {
        return "Motor Economico arrancar";
    }

    @Override
    public String acelerar() {
        return "Motor Economico acelerar";
    }

    @Override
    public String apagar() {
        return "Motor Economico apagar";
    }
}
