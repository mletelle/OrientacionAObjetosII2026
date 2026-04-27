package modelo;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private String email;

    public Empleado(String nombre, String apellido, LocalDate fechaDeNacimiento, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
    }

    public String email() {
        return email;
    }

    public boolean esElCumpleDe(LocalDate fecha) {
        //return this.fechaDeNacimiento.isEqual(LocalDate.now());
        return this.fechaDeNacimiento.getMonth() == fecha.getMonth() && this.fechaDeNacimiento.getDayOfMonth() == fecha.getDayOfMonth();
    }
}
