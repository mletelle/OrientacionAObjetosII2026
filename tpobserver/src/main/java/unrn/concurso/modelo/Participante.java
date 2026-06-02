package unrn.concurso.modelo;

public class Participante {
    private String nombre;
    private String region;
    private String telefono;
    private String email;

    public Participante(String nombre, String region, String telefono, String email) {
        if (!telefonoEsValido(telefono)) {
            throw new IllegalArgumentException("Telefono no valido");
        }
        if (!regionEsValida(region)) {
            throw new IllegalArgumentException("Region no valida");
        }
        if (!nombreEsValido(nombre)) {
            throw new IllegalArgumentException("Nombre no valido");
        }
        if (!emailEsValido(email)) {
            throw new IllegalArgumentException("Email no valido");
        }
        this.nombre = nombre;
        this.region = region;
        this.telefono = telefono;
        this.email = email;
    }

    private boolean nombreEsValido(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    private boolean regionEsValida(String region) {
        return region != null && (region.equals("China") || region.equals("US") || region.equals("Europa"));
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

    public String emailParticipante() {
        return email;
    }

    private boolean emailEsValido(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    private boolean telefonoEsValido(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        return telefono != null && telefono.matches(regex);
    }
}
