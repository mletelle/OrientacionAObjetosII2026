package unrn.punto2;

public interface EstadoCalculadora {
    void valor(double valor);

    void mas();

    void menos();

    void por();

    void dividido();

    String mostrar();

    void borrar();

    String nombre();
}