package unrn.punto2;

public class Calculadora {
    static final double VALOR_INICIAL = 0.0;
    static final String MSG_ESTADO_ERROR = "La calculadora está en estado de error";

    private double valorAcumulado;
    private EstadoCalculadora estado;

    public Calculadora() {
        this.valorAcumulado = VALOR_INICIAL;
        this.estado = new EstadoInicial(this);
    }

    String estado() {
        return this.estado.nombre();
    }

    public void valor(double valor) {
        this.estado.valor(valor);
    }

    public void mas() {
        this.estado.mas();
    }

    public void menos() {
        this.estado.menos();
    }

    public void por() {
        this.estado.por();
    }

    public void dividido() {
        this.estado.dividido();
    }

    public String mostrar() {
        return this.estado.mostrar();
    }

    public void borrar() {
        this.estado.borrar();
    }

    void asignarValor(double valor) {
        this.valorAcumulado = valor;
    }

    void sumar(double valor) {
        this.valorAcumulado += valor;
    }

    void restar(double valor) {
        this.valorAcumulado -= valor;
    }

    void multiplicar(double valor) {
        this.valorAcumulado *= valor;
    }

    void dividir(double valor) {
        this.valorAcumulado /= valor;
    }

    void reiniciarValor() {
        this.valorAcumulado = VALOR_INICIAL;
    }

    String valorAcumulado() {
        return String.valueOf(this.valorAcumulado);
    }

    void aInicial() {
        this.estado = new EstadoInicial(this);
    }

    void aError() {
        this.estado = new EstadoError(this);
    }

    void aEsperando(String operacion) {
        this.estado = new EstadoEsperando(this, operacion);
    }
}