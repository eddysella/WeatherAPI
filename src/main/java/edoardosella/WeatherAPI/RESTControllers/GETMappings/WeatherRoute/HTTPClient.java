package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HTTPClient {

    public HTTPClient(){}

    public synchronized String getFiveDayForecast(String cityID, String passedKey){
        OkHttpClient httpClient = new OkHttpClient();

        try {

            HttpUrl httpUrl = new HttpUrl.Builder()
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

            Request request = new Request.Builder()
                    .url(httpUrl)
                    .build();

            try (Response response = httpClient.newCall(request).execute()) {
                if (response.isSuccessful()){
                    return response.body().string();
                }else{
                    return "Unexpected code " + response + request;
                }
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}