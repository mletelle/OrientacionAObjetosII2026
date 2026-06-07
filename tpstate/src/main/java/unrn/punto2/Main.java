package unrn.punto2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Estado inicial: " + calculadora.estado());
        calculadora.valor(10);
        System.out.println("Estado después de ingresar operando: " + calculadora.estado());
        calculadora.mas();
        calculadora.mas();
        calculadora.borrar();
        System.out.println("Estado después de ingresar operando cero: " + calculadora.estado());
        calculadora.valor(10);
        System.out.println(calculadora.mostrar());
        
        calculadora.mas();
        calculadora.valor(5);
        System.out.println("Después de sumar 5: " + calculadora.mostrar());
        calculadora.menos();
        calculadora.valor(3);
        System.out.println("Después de restar 3: " + calculadora.mostrar());
        calculadora.por();
        calculadora.valor(2);
        System.out.println("Después de multiplicar por 2: " + calculadora.mostrar());
        calculadora.dividido();
        calculadora.valor(0);
        System.out.println("Después de dividir por cero: " + calculadora.mostrar());
    }
}