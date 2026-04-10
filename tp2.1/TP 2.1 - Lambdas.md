# Trabajo Práctico: Repaso sobre Expresiones Lambda 


### 1. ¿Qué métodos de la clase AprendiendoLambdas se invocan en cada caso?

```java
a.unMetodo((b) -> { System.out.println("abcd" + b); });
```
Se invoca unMetodo(B b) porque la lambda tiene un parámetro y no devuelve nada

```java
a.unMetodo(() -> System.out.println("abcd"));
```
Se invoca unMetodo(A a) porque la lambda no tiene parámetros y no devuelve nada.


```java
a.unMetodo((variable) -> { System.out.println("abcd"); });
```
Se invoca unMetodo(B b) porque tiene un parámetro, no devuelve nada


```java
a.unMetodo((variable) -> { System.out.println("abcd"); return true; });
```
Se invoca unMetodo(C c) porque tiene un parámetro y devuelve booleano.


```java
a.unMetodo((Long variable) -> {
    System.out.println("abcd");
    return 10L;
});
```
Se invoca unMetodo(D<Long, Long> d) porque tiene un parámetro Long y devuelve Long.


### 2. Escriba  una  clase  Main  para  poder  llamar  al  metodo  `AprendiendoLambdas*unMetodo(C c)`  de  la  siguiente  forma: 


- Utilizando  un  lambda  dado  que  imprima  true  si  el  largo  del  String  es  par,  false  en  caso  contrario.


- Utilizando  un  lambda  dado  que  imprima  true  si  el  String  empieza  con  "a"  minúscula, false  en  caso  contrario.

El código se encuentra en: src/main/java/ar/unrn/Main.java

#### a) Lambda que verifica si el largo del String es par:
```java
a.unMetodo(c -> c.length() % 2 == 0);
```
La lambda recibe un string, calcula su largo con length(), y devuelve verdadero si es divisible por 2 (par). Como abcd tiene 4 caracteres devuelve true.

#### b) Lambda que verifica si el String empieza con "a" minuscula:
```java
a.unMetodo(c -> c.startsWith("a"));
```
La lambda recibe un String  y devuelve verdadero si empieza con "a". Como "abcd", empieza con a, imprime `true`.


### 3, 4, 5, y 6:

El código se encuentra en: src/main/java/oop2/
