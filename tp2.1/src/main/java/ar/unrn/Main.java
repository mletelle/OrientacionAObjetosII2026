package ar.unrn;

public class Main {
    public static void main(String[] args) {
        AprendiendoLambdas a = new AprendiendoLambdas();

        // 2.a) true si el largo del String es par
        a.unMetodo(c -> c.length() % 2 == 0);

        // 2.b) true si el String empieza con "a" minuscula
        a.unMetodo(c -> c.startsWith("a"));
    }
}
