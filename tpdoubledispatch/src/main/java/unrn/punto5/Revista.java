package unrn.punto5;


import java.time.LocalDate;
import java.time.Period;

public class Revista implements Articulo {
    private String titulo;
    private String autor;
    private int paginas;
    private LocalDate fechaPubli;
    private Condicion condicion;

    public Revista(String titulo, String autor, int paginas, LocalDate fechaPubli, Condicion condicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.fechaPubli = fechaPubli;
        this.condicion = condicion;
    }

    @Override
    public int diasDePrestamo() {
        return condicion.diasPara(this);
    }

    public boolean tieneMasDeDiezAnios() {
        return Period.between(fechaPubli, LocalDate.now()).getYears() > 10;
    }

    public int diasNormal() {
        if (paginas < 100) {
            return 2;
        }
        if (paginas < 2000) {
            return 3;
        }
        return 5;
    }
}