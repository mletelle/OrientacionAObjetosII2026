package unrn.punto2;

public class EstadoEsperando implements EstadoCalculadora {
    private Calculadora calculadora;
    private String operacion;

    public EstadoEsperando(Calculadora calculadora, String operacion) {
        this.calculadora = calculadora;
        this.operacion = operacion;
    }

    @Override
    public void valor(double valor) {
        if (this.operacion.equals("+")) {
            this.calculadora.sumar(valor);
            this.calculadora.aInicial();
            return;
        }

        if (this.operacion.equals("-")) {
            this.calculadora.restar(valor);
            this.calculadora.aInicial();
            return;
        }

        if (this.operacion.equals("*")) {
            this.calculadora.multiplicar(valor);
            this.calculadora.aInicial();
            return;
        }

        if (this.operacion.equals("/")) {
            if (valor == 0) {
                this.calculadora.aError();
                return;
            }

            this.calculadora.dividir(valor);
            this.calculadora.aInicial();
            return;
        }

        this.calculadora.aError();
    }

    @Override
    public void mas() {
        this.calculadora.aError();
    }

    @Override
    public void menos() {
        this.calculadora.aError();
    }

    @Override
    public void por() {
        this.calculadora.aError();
    }

    @Override
    public void dividido() {
        this.calculadora.aError();
    }

    @Override
    public String mostrar() {
        this.calculadora.aError();
        return Calculadora.MSG_ESTADO_ERROR;
    }

    @Override
    public void borrar() {
        this.calculadora.reiniciarValor();
        this.calculadora.aInicial();
    }

    @Override
    public String nombre() {
        return "Esperando";
    }
}