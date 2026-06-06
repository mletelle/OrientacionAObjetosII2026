package unrn.punto3;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(new CalculadorLibro(), 30);
        var p2 = new Producto(new CalculadorMedicina(), 330);
        var p3 = new Producto(new CalculadorAlimento(), 130);
        var p4 = new Producto(new CalculadorOtro(), 130);
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}