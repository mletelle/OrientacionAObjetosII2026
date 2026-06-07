package unrn.punto2;

public class EstadoError implements EstadoCalculadora {
    private Calculadora calculadora;

    public EstadoError(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void valor(double valor) {
    }

    @Override
    public void mas() {
    }

    @Override
    public void menos() {
    }

    @Override
    public void por() {
    }

    @Override
    public void dividido() {
    }

    @Override
    public String mostrar() {
        return Calculadora.MSG_ESTADO_ERROR;
    }

    @Override
    public void borrar() {
        this.calculadora.reiniciarValor();
        this.calculadora.aInicial();
    }

    @Override
    public String nombre() {
        return "Error";
    }
}