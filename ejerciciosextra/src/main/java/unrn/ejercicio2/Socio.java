package unrn.ejercicio2;

public class Socio {
	private String nombre;
	private String legajo;
	private String email;


	public Socio(String nombre, String email, String legajo) {
		this.nombre = nombre;
		this.email = email;
		this.legajo = legajo;
	}

	public String nombre() {
		return nombre;
	}
	public String email() {
		return email;
	}
	public String legajo() {
		return legajo;
	}
}
