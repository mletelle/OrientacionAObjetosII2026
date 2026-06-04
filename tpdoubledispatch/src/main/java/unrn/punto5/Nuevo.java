package unrn.punto5;

public class Nuevo implements Condicion {

    @Override
    public int diasPara(Libro libro) {
        return libro.diasSegunPaginas();
    }

    @Override
    public int diasPara(Disco disco) {
        return disco.diasNormal();
    }

    @Override
    public int diasPara(Revista revista) {
        return revista.diasNormal();
    }
}