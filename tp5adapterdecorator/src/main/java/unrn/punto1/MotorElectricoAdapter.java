package unrn.punto1;

public class MotorElectricoAdapter implements Motor {
    private MotorElectrico motor;

    public MotorElectricoAdapter(MotorElectrico motor) {
        this.motor = motor;
    }

    @Override
    public String arrancar() {
        return motor.conectar() + "\n" + motor.activar();
    }

    @Override
    public String acelerar() {
        return motor.moverMasRapido();
    }

    @Override
    public String apagar() {
        return motor.detener() + "\n" + motor.desconectar();
    }
}
