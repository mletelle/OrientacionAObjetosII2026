# Tiempo - Anemico vs No Anemico

### Modelo Anemico
La clase Tiempo solo guarda datos (dia, mes, anio) con getters y setters. La logica de formateo esta en un servicio, en este caso esta en Main.java, lo que viola el pcpio de abstracccion. 
El problema es que la responsabilidad de formatear queda afuera de la clase. Si necesito otro formato, tengo que cambiar Main.

### Modelo No Anemico
La clase Tiempo guarda datos y tiene metodos getFormatoLargo() y getFormatoCorto().
La ventaja es que la clase sabe como representarse a si misma. Es mas coherente y facil de usar.

## Por que noanemico es mejor en este caso?
Porque tiene sentido que Tiempo sepa dar la fecha en un formato largo o corto. Es su responsabilidad. El modelo anemico deja la clase vacia sin hacer nada(violando el principio de encapsulacion), la clase Tiempo debe comportarse como un objeto de verdad, no como un contenedor vacio de datos.
