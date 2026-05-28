package unrn.punto1;

public class MotorComun implements Motor {
    @Override
    public String arrancar() {
        return "Motor Comun arrancar";
    }

    @Override
    public String acelerar() {
        return "Motor Comun acelerar";
    }

    @Override
    public String apagar() {
        return "Motor Comun apagar";
    }
}
