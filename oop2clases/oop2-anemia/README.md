# Anemia en Objetos

- Martin Fowler, definición de Modelo de Dominio Anémico:
    - https://www.martinfowler.com/bliki/AnemicDomainModel.html
- Cuando observamos los nombres de las clases en un proyecto de software vemos que muchos de ellos
  fueron nombrados a partir de los sustantivos del dominio. El problema surge cuando vemos la implementación
  y no se observa comportamiento alguno. Solo setters y getters.
- Esta forma de diseñar las clases tiene mas que ver con programación procedural (C/Pascal, etc).
- La idea fundamental de POO es siempre asignar comportamiento a las clases (Datos y Lógica juntos).
    - No es simple siempre y a veces simplemente no conviene.
    - Vemos varías técnicas para lograrlo
- ¿Por qué es importante respetar la idea fundamental de POO y asignar comportamiento a las clases?
    - Logramos objetos más desacoplados.
    - Evitamos que al hacer cambios éstos repercutan sobre más clases, haciendo los diseñas mas complicados de
      modificar.
