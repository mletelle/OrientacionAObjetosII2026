package unrn.punto5;


public class Participante {
    private final int id;
    private final String nombre;
    private int puntos;
    private String mail;

    public Participante(int id, String nombre, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = 0;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int cuantosPuntos() {
        return this.puntos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Participante that = (Participante) obj;
        return id == that.id && nombre.equals(that.nombre);
    }

    public String getMail() { //para el registradormail
        return mail;
    }

}
