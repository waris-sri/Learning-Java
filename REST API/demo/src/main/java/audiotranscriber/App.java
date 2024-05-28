package audiotranscriber;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        // create `transcript` object from the `Transcript` class and set `audio_url`
        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://raw.githubusercontent.com/johnmarty3/JavaAPITutorial/main/Thirsty.mp4");

        // use GSON to create a JSON request
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(transcript);
        System.out.println(jsonRequest);

        // create a POST request with `audio_url` as the body of the request
        HttpRequest postRequest = HttpRequest.newBuilder()
                // set the base API link
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                // set the "Authorization" header to given API key
                .header("Authorization", "b44fb4fe28854b45b347c27d3aa6c64f")
                // state the HTTP method and input the body (parameter)
                .POST(BodyPublishers.ofString(jsonRequest))
                // finish the request
                .build();

        // send the created POST request with `HttpClient` (response handler)
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
        System.out.println(postResponse.body());

        // get the completed `Transcript` object from the JSON response
        transcript = gson.fromJson(postResponse.body(), Transcript.class);
        transcript.getId();

        // create a GET request with `audio_url` as the body of the request
        HttpRequest getRequest = HttpRequest.newBuilder()
                // set the base API link
                .uri(new URI("https://api.assemblyai.com/v2/transcript" + transcript.getId()))
                // set the "Authorization" header to given API key and use GET method (default)
                .header("Authorization", "b44fb4fe28854b45b347c27d3aa6c64f")
                // finish the request
                .build();

        // keep sending the GET request until it is ready or an error occurs
        while (true) {
            // send the created GET request
            HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
            transcript = gson.fromJson(getResponse.body(), Transcript.class);
            // print the current status
            System.out.println(transcript.getStatus());
            // if the status is "completed" or "error," break off the loop
            if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
                break;
            }
            // wait for 1s then retry
            Thread.sleep(1000);
        }

        // when completed transcribing
        System.out.println("Transcription Complete!");
        System.out.println(transcript.getText());
    }
}