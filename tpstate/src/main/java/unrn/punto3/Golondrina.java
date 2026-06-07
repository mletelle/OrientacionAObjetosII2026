package unrn.punto3;

public class Golondrina {
    public static final int COSTO_FIJO = 10;
    public static final int JOULE_POR_GRAMO = 5;
    private static final int LIMITE_DEBIL = 50;
    private static final int LIMITE_EUFORICA = 500;
    private int energia; //joules

    public Golondrina() {
        this.energia = 45;
    }

    public void comer(int gramos) {
        System.out.println("Golondrina comiendo");
        energia += gramos * JOULE_POR_GRAMO;
    }

    public void volar(int km) {
        System.out.println("Golondrina volando 5km y volviendo");
        energia -= km + COSTO_FIJO;
    }

    public void realizarDeseo() {
        if (this.energia < LIMITE_DEBIL) new EstadoDebil(this).realizarDeseo();
        if (this.energia > LIMITE_EUFORICA) new EstadoEuforica(this).realizarDeseo();
    }
}