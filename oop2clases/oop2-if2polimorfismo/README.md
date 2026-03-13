# Transformando IFs en polimorfismo

Programando en objetos no podemos tener sentencias *ifs* que pregunten por el tipo de un objeto (`instanceof` o
similar). Si es el caso refactoricemoslo aplicando los siguientes pasos:

1. Creamos una jerarquía polimórfica con una abstracción por cada condición.
2. Agregamos el método polimórfico en cada abstracción.
3. Llevamos el *cuerpo del if* a cada abstracción.
    - Diferenciar que va como parámetro del método polimórfico y que va como variable de instancia.
4. Reemplazar el if por envío de mensaje polimórfico.

¿Por qué esto es mejor?

1. Agregar nuevos tipos, es tan simple como agregar una nueva clase. No toco código que existe y evito errores.
2. Tengo mas clases, pero mas cohesivas. Los cambios estan localizados y no van a parar todos a la misma clase.
