package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.MalformedURLException;

class HTTPClient {

    HTTPClient() { }

    String getFiveDayForecast(String cityID, String apikeyParam) throws MalformedURLException {
        HttpUrl httpUrl = buildURL(cityID, apikeyParam);
        Request request = buildRequest(httpUrl);
        String output = executeRequest(request);
        return output;
    }

    private String executeRequest(Request request) throws MalformedURLException {
        int responseCode = -1;
        String responseBody = null;
        Response response;

        try {
            response = new OkHttpClient().newCall(request).execute();
            responseCode = response.code();
            responseBody = response.body().string();
        } catch (IOException e) {
        }
        if (responseCode == 200) {
            return responseBody;
        } else {
            throw new MalformedURLException("API Error Code: " + responseCode);
        }
    }

    private HttpUrl buildURL(String cityID, String apikeyParam) {
        return new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(cityID)
                .addQueryParameter("apikey", apikeyParam)
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
