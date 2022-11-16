package com.demo.githubActions;

import org.junit.jupiter.api.*;

import org.springframework.boot.test.context.SpringBootTest;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import static java.net.http.HttpResponse.BodyHandlers.ofString;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class GithubActionsDemoApplicationTests {

    static HttpClient client = HttpClient.newBuilder().build();
    @Test
    void shouldCheckTheApiText() {
        try {
            HttpRequest req = HttpRequest.newBuilder(URI.create("http://localhost:8080/greet")).build();
            HttpResponse<String> response = client.send(req, ofString(StandardCharsets.UTF_8));
            String body = response.body();
            String expected = "Hello World";
            assertEquals(expected, body);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();

        }
    }

}
