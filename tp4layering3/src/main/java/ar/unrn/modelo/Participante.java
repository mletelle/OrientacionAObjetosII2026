package ar.unrn.modelo;

public class Participante {
    private String name;
    private String lastName;
    private String id;
    private String email;
    private String telefono;
    private Concurso concurso;

    public Participante(String name, String lastName, String id, String email, String telefono, Concurso concurso) {
        validations(name, lastName, id, email, telefono, concurso);
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.concurso = concurso;
    }

    private void validations(String name, String lastName, String id, String email, String telefono, Concurso concurso) {
        if (name.isEmpty() || lastName.isEmpty() || id.isEmpty() || email.isEmpty() || telefono.isEmpty()) {
            throw new IllegalArgumentException("Todos los campos son obligatorios");
        }
        if (!checkEmail(email)) {
            throw new IllegalArgumentException("El email es invalido");
        }
        if (!checkPhone(telefono)) {
            throw new IllegalArgumentException("El telefono es invalido");
        }
        if (concurso == null) {
            throw new IllegalArgumentException("El concurso es invalido");
        }
    }

    private boolean checkEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    private boolean checkPhone(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        return telefono.matches(regex);
    }

    // Getters
    public String name() {
        return name;
    }

    public String lastName() {
        return lastName;
    }

    public String id() {
        return id;
    }

    public String email() {
        return email;
    }

    public String telefono() {
        return telefono;
    }

    public Concurso concurso() {
        return concurso;
    }
}
