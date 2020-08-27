package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.MalformedURLException;

public class HTTPClient {

    public HTTPClient() { }

    public String getFiveDayForecast(String cityID, String passedKey) throws MalformedURLException {
        HttpUrl httpUrl = buildURL(cityID, passedKey);
        Request request = buildRequest(httpUrl);
        String output = executeRequest(request);
        return output;
    }

    private String executeRequest(Request request) throws MalformedURLException {
        int responseCode = -1;
        OkHttpClient httpClient = new OkHttpClient();

        try (Response response = httpClient.newCall(request).execute()) {
            responseCode = response.code();
            if (responseCode == 200) {
                return response.body().string();
            }
        } catch (IOException e) { }
        // catches all cases
        if (responseCode != 200) {
            throw new MalformedURLException("Error Code: " + responseCode);
        }
        return null;
    }

    private HttpUrl buildURL(String cityID, String passedKey) {
        return new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(cityID)
                .addQueryParameter("apikey", passedKey)
                .addQueryParameter("language", "en-us")
                .addQueryParameter("details", "false")
                .addQueryParameter("metric", "true")
                .build();
    }

    private Request buildRequest(HttpUrl httpUrl) {
        return new Request.Builder()
                .url(httpUrl)
                .build();
    }
}
