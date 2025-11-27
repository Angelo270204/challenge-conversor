package lad.com.alura.conversor;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion{
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public RespuestaPeticion obtenerDatos() throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e83be608fe711cce4725dd9d/latest/USD");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return gson.fromJson(json, RespuestaPeticion.class);
    }
}
