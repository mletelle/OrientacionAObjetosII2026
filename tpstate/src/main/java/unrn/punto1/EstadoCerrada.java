package unrn.punto1;

public class EstadoCerrada implements EstadoPuerta {
    private Puerta puerta;

    public EstadoCerrada(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo la puerta...");
        puerta.estadoCambio(new EstadoAbierta(puerta));
    }

    @Override
    public String nombre() {
        return "Cerrada";
    }

    @Override
    public void cerrar() {
        System.out.println("no se puede cerrar una puerta cerrada");
    }
}
