package unrn.punto4;

public class Main {
    public static void main(String[] args) {
        Combo pedido1 = ComboBuilder.basico().conPapas().conQueso().build();
        Combo pedido2 = ComboBuilder.familiar().conCarne().conTomate().build();
        mostrarPedido(pedido1);
        mostrarPedido(pedido2);
    }

    private static void mostrarPedido(Combo combo) {
        System.out.println(combo.descripcion());
        System.out.println("Precio total " + combo.precio());
    }
}