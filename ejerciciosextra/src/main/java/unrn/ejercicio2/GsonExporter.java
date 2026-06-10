package unrn.ejercicio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class GsonExporter implements ExportadorSocios {
    private Gson gson;

    public GsonExporter() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @Override
    public String exportar(List<Socio> socios) {
        return gson.toJson(socios);
    }
}
