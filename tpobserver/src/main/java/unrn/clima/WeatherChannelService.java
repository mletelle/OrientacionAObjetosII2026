package unrn.clima;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class WeatherChannelService implements ClimaOnline {

    @Override
    public String temperatura() {
        try {
            String ciudad = URLEncoder.encode("Viedma,Argentina", StandardCharsets.UTF_8);
            String apiKey = "6dc1675b44ae313a0c11aedaa859c15e";
            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + ciudad + "&units=metric&APPID=" + apiKey;
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            String temp = extraerTemperatura(body);
            return temp + " c";
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la temperatura", e);
        }
    }

    private String extraerTemperatura(String json) {
        String marca = "\"temp\":";
        int inicio = json.indexOf(marca);
        inicio += marca.length();
        int fin = json.indexOf(",", inicio);
        return json.substring(inicio, fin).trim();
    }
}