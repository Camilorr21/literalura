package com.alura.literalura.apiconsumption;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ConsumoAPI {

    public String obtenerDatos(String url) {
        //Instancia de HttpClient realiza solicitudes HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Solicitud HTTP GET con URL
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Solicitud HTTP y obtiene respuesta
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            // RuntimeException si hay un error de E/S
            throw new RuntimeException("Error de E/S al obtener datos de la API", e);
        } catch (InterruptedException e) {
            // RuntimeException si es interrumpida la solicitud
            throw new RuntimeException("La solicitud fue interrumpida", e);
        }

        String json = response.body();
        return json;
    }
}
