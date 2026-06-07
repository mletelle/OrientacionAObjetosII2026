package unrn.punto1;

public class EstadoAbierta implements EstadoPuerta {
    private Puerta puerta;

    public EstadoAbierta(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void abrir() {
        System.out.println("NO se puede abrir una puerta abierta");
    }

    @Override
    public String nombre() {
        return "Abierta";
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando la puerta...");
        puerta.estadoCambio(new EstadoCerrada(puerta));
    }
}
