package unrn.punto2;

public class EstadoInicial implements EstadoCalculadora {
    private Calculadora calculadora;

    public EstadoInicial(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void valor(double valor) {
        this.calculadora.asignarValor(valor);
    }

    @Override
    public void mas() {
        this.calculadora.aEsperando("+");
    }

    @Override
    public void menos() {
        this.calculadora.aEsperando("-");
    }

    @Override
    public void por() {
        this.calculadora.aEsperando("*");
    }

    @Override
    public void dividido() {
        this.calculadora.aEsperando("/");
    }

    @Override
    public String mostrar() {
        return this.calculadora.valorAcumulado();
    }

    @Override
    public void borrar() {
        this.calculadora.reiniciarValor();
    }

    @Override
    public String nombre() {
        return "Inicial";
    }
}