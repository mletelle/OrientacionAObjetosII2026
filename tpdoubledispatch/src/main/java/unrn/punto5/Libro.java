package unrn.punto5;

public class Libro implements Articulo {
    private String titulo;
    private String autor;
    private int paginas;
    private Condicion condicion;

    public Libro(String titulo, String autor, int paginas, Condicion condicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.condicion = condicion;
    }

    @Override
    public int diasDePrestamo() {
        return condicion.diasPara(this);
    }

    public int diasSegunPaginas() {
        return (int) Math.ceil(paginas / 100.0);
    }


}
