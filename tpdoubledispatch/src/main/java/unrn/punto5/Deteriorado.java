package unrn.punto5;

public class Deteriorado implements Condicion {
    @Override
    public int diasPara(Libro libro) {
        return libro.diasSegunPaginas();
    }

    @Override
    public int diasPara(Disco disco) {
        if (disco.bandaAnteriorA1980()) {
            throw new RuntimeException("El disco deteriorado no se puede prestar");
        }
        return Math.max(1, disco.diasNormal() - 1);
    }

    @Override
    public int diasPara(Revista revista) {
        if (revista.tieneMasDeDiezAnios()) {
            return Math.max(1, revista.diasNormal() - 3);
        }

        return Math.max(1, revista.diasNormal() - 1);
    }
}
