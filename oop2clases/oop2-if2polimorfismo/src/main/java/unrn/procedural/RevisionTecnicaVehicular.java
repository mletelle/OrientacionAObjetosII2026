package unrn.procedural;


public class RevisionTecnicaVehicular {

    public static double calcularCostoRevisionParaAnio(String tipoVehiculo,
                                                       int anioFabricacion,
                                                       boolean dobleCabina,
                                                       int numeroPasajeros,
                                                       int anioActual) {
        double costoBase = 0;

        switch (tipoVehiculo.toLowerCase()) {
            case "auto":
                costoBase = 10000.0;
                // Calcular porcentaje adicional basado en el año de fabricación
                double porcentajeAdicional = (anioActual - anioFabricacion) * 0.1;
                costoBase += costoBase * (porcentajeAdicional / 100);
                break;
            case "pickup":
                costoBase = 15000.0;
                if (dobleCabina) {
                    costoBase += 2000.0;
                }
                break;
            case "transporte pasajeros":
                // Costo base
                costoBase = 30000.0;
                // Agregar costo adicional por pasajero
                costoBase += numeroPasajeros * 500.0; // Supongamos que se cobran $500 por cada pasajero adicional
                break;
            default:
                throw new RuntimeException("Tipo de vehículo no válido");
        }

        return costoBase;
    }
}