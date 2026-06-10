# Ejercicios Adicionales Patrones de Diseño

## 1. File Manager

Existe un File Manager que permite crear nuevos archivos, la cantidad que fuere y listarlos. De los archivos se conoce:

- Nombre
- Extensión
- Tamaño
- Fecha de creación
- Fecha de modificación
- Permisos (Lectura solo o lectura/escritura)

Implemente la clase Archivo para que gestione estas propiedades. En el File Manager el cliente debe poder elegir cómo se
muestra un archivo (instancia de la clase Archivo), es decir, cuáles de las propiedades mencionadas anteriormente se
muestran, y en qué orden. Esto quiere decir que un cliente podría querer ver los archivos de muchas maneras. Algunas de
ellas son:

- nombre - extensión
- nombre - extensión - fecha de creación
- permisos - nombre - extensión - tamaño

Para esto, el objeto o los objetos que representen a los archivos debe o deben entender el mensaje prettyPrint(). Es
decir, un objeto cliente (digamos el FileManager) le enviará al objeto que Ud. determine, el mensaje prettyPrint(). De
acuerdo a cómo el usuario lo haya configurado se deberá retornar un String con los aspectos seleccionados por el usuario
en el orden especificado por éste. En una misma ejecución del programa la misma lista de archivos debería poder
mostrarse de dos maneras diferentes segun elija el cliente.

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la clase FileManager, Archivo y la o las clases necesarias para permitir que los archivos se impriman según
  elección del cliente.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.

Fuente: Ejercicio tomado de la materia Objetos 2 de la UNLP.

## 2. Exportador

Refactorice el código que se encuentra en el paquete `ejercicio2` para permitir realizar la exportacion a json además de
con la implementación actual, con la librería [gson](https://github.com/google/gson). El diseño debe permitir a los
clientes elegir que implementacion utilizar.

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la solución.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.

Fuente: Ejercicio tomado de la materia Objetos 2 de la UNLP.

## 3. Media Player

Usted ha implementado las clases que se encuentran en el paquete `ejercicio3`, para reproducir archivos de audio y video
en formatos que usted ha diseñado. Cada `Media` se puede reproducir con el mensaje `play()`. Para continuar con el
desarrollo, usted desea incorporar la posibilidad de reproducir Video stream. Para ello, dispone de la clase
`VideoStream` que pertenece a una librería de terceros y usted no puede ni debe modificarla. El desafío que se le
presenta es hacer que la clase MediaPlayer pueda interactuar con la clase VideoStream.

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la solución.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.

- Fuente: Ejercicio tomado de la materia Objetos 2 de la UNLP.

## 4. Calculo de suelos de Empleados

Dada la implementación del cálculo de sueldo que se encuentra en el paquete `ejercicio4`, donde existen tres tipos de
empleados: Temporarios, Pasantes y Planta y el sueldo se compone de 3 elementos: sueldo básico, adicionales y
descuentos.

| Concepto  | Temporario                                      | Pasante                                         | Planta                                                                           |
|-----------|-------------------------------------------------|-------------------------------------------------|----------------------------------------------------------------------------------|
| Básico    | $20.000 + (horas trabajadas * $300)             | $20.000                                         | $50.000                                                                          |
| Adicional | $5.000 si está casado + $2.000 por cada hijo    | $2.000 por examen rendido                       | $5.000 si está casado + $2.000 por cada hijo + $2.000 por cada año de antigüedad |
| Descuento | 13% del sueldo básico + 5% del sueldo adicional | 13% del sueldo básico + 5% del sueldo adicional | 13% del sueldo básico + 5% del sueldo adicional                                  |

Se pide:

- Incoporar al calculo del sueldo la idea de convenio, donde existen dos tipos: regular y jubilacion anticipada. Donde,
  ahora tenemos los siguientes cambios en el cálculo

| Concepto                        | Temporario                                      | Pasante                                         | Planta                                                                            |
|---------------------------------|-------------------------------------------------|-------------------------------------------------|-----------------------------------------------------------------------------------|
| Básico Regular                  | $20.000 + (horas trabajadas * $300)             | $20.000                                         | $50.000                                                                           |
| Básico Jubilacion Anticipada    | $15.000 + (horas trabajadas * $150)             | $19.000                                         | $45.000                                                                           |
| Adicional Regular               | $5.000 si está casado + $2.000 por cada hijo    | $2.000 por examen rendido                       | $5.000 si está casado + $20.000 por cada hijo + $2.000 por cada año de antigüedad |
| Adicional Jubilacion Anticipada | $2.000 por cada hijo                            | $1.000 por examen rendido                       | $2.000 por cada hijo + $15.000 por cada año de antigüedad                         |
| Descuento Regular               | 13% del sueldo básico + 5% del sueldo adicional | 13% del sueldo básico + 5% del sueldo adicional | 13% del sueldo básico + 5% del sueldo adicional                                   |
| Descuento Jubilacion Anticipada | 15% del sueldo básico + 5% del sueldo adicional | 15% del sueldo básico + 5% del sueldo adicional | 15% del sueldo básico + 5% del sueldo adicional                                   |

- Implemente los tests necesarios para comprobar la solución implementada.

- Fuente: Ejercicio inspirado en un ejercicio de la materia Objetos 2 de la UNLP.

## 5. Items de Trabajo

Se desea definir un sistema de seguimiento de tareas. En este sistema hay tareas en las cuales se puede definir el
nombre y una serie de comentarios. Las tareas atraviesan diferentes etapas a lo largo de su ciclo de vida y ellas
son: `pending` (ni bien son creadas), `in-progress`, `paused` y `finished`. Cada tarea debe estar modelada mediante la
clase `ToDoItem` (cuya firma se encuentra en el paquete `ejercicio5`.

El mensaje de error específico que se espera en este ejercicio debe ser descriptivo del caso. Por ejemplo, para el
método `togglePause()` , el mensaje de error debe indicar que el `ToDoItem` no se encuentra en in-progress o paused:
`throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");`

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la solución.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.
