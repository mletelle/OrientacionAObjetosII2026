package ar.unrn.modelo;

public class Participante {
    String nombre;
    String region;
    String telefono;

    public Participante(String nombre, String region, String telefono) {
        if (!telefonoEsValido(telefono)) {
            throw new IllegalArgumentException("Telefono no valido");
        }
        if (!regionEsValida(region)) {
            throw new IllegalArgumentException("Region no valida");
        }
        if (!nombreEsValido(nombre)) {
            throw new IllegalArgumentException("Region no valida");
        }
        this.nombre = nombre;
        this.region = region;
        this.telefono = telefono;
    }

    private boolean nombreEsValido(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    private boolean regionEsValida(String region) {
        return region.equals("China") || region.equals("US") || region.equals("Europa");
    }

    public String nombreParticipante() {
        return nombre;
    }

    public String regionParticipante() {
        return region;
    }

    public String telefonoParticipante() {
        return telefono;
    }

    private boolean telefonoEsValido(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        return telefono.matches(regex);
    }
}
