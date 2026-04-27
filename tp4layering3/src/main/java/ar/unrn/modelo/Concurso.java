package ar.unrn.modelo;


import java.time.LocalDate;

public class Concurso {
    private int id;
    private String name;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Concurso(int id, String name, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.name = name;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public LocalDate fechaInicio() {
        return fechaInicio;
    }

    public LocalDate fechaFin() {
        return fechaFin;
    }

    public boolean estaAbiertoPara(LocalDate hoy) {
        return !hoy.isBefore(fechaInicio) && !hoy.isAfter(fechaFin);
    }
}