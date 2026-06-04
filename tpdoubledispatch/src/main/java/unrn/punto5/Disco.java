package unrn.punto5;

public class Disco implements Articulo {
    private String titulo;
    private String autor;
    private int anioBanda;
    private Condicion condicion;

    public Disco(String titulo, String autor, int anioBanda, Condicion condicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioBanda = anioBanda;
        this.condicion = condicion;
    }

    @Override
    public int diasDePrestamo() {
        return condicion.diasPara(this);
    }

    public boolean bandaAnteriorA1980() {
        return anioBanda < 1980;
    }

    public int diasNormal() {
        if (bandaAnteriorA1980()) {
            return 3;
        }
        return 5;
    }

}
