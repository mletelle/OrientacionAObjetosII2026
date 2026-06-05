package unrn.punto3;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(TipoProducto.LIBRO, 30);
        var p2 = new Producto(TipoProducto.MEDICINA, 330);
        var p3 = new Producto(TipoProducto.ALIMENTO, 130);
        var p4 = new Producto(TipoProducto.OTRO, 130);
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}