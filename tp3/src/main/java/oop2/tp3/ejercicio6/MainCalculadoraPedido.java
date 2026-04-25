package oop2.tp3.ejercicio6;

public class MainCalculadoraPedido {
    public static void main(String[] args) {
        Pedido pedidoVip = new Pedido(10000, new DescuentoVip());
        Pedido pedidoPrioritario = new Pedido(10000, new DescuentoPrioritario());
        Pedido pedidoSinDescuento = new Pedido(10000, new DescuentoSinDescuento());

        System.out.println("Total con descuento VIP: " + pedidoVip.total());
        System.out.println("Total con descuento por envio prioritario: " + pedidoPrioritario.total());
        System.out.println("Total sin descuento: " + pedidoSinDescuento.total());
        
    }
}

