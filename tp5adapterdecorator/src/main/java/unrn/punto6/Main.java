package unrn.punto6;

public class Main {
    public static void main(String[] args) {
        Orden orden = new Orden();
        Torta torta1 = TortaBuilder.chocolate().conBanioChocolate().build();
        Torta torta2 = TortaBuilder.vainilla().conRockets().build();
        Torta torta3 = TortaBuilder.frutilla().conRockets().conBanioChocolate().build();
        orden.agregarTorta(torta1);
        orden.agregarTorta(torta2);
        orden.agregarTorta(torta3);
        orden.imprimirOrden();
    }
}