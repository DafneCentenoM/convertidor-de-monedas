import com.google.gson.Gson;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaConversor {

    public Monedas buscaMonedas(String monedaBase, String cambioMoneda) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8e73fad9f8481fb3451f368d/latest/" + monedaBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Monedas monedas = new Gson().fromJson(response.body(), Monedas.class);
            if (monedas.conversion_rates().containsKey(cambioMoneda)) {
                return monedas;
            } else {
                throw new RuntimeException("No se encontró la moneda a cambiar");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al realizar la consulta de monedas" + e.getMessage());
        }
    }
}
