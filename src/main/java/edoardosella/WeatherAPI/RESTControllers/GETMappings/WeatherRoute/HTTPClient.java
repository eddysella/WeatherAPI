package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.MalformedURLException;

public class HTTPClient {

    public HTTPClient() {
    }

    public String getFiveDayForecast(String cityID, String passedKey) throws MalformedURLException{
        OkHttpClient httpClient = new OkHttpClient();
        String output = "";
        int responseCode = -1;

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

        try (Response response = httpClient.newCall(request).execute()){
            responseCode = response.code();
            System.out.println("Code : " + responseCode);
            if (responseCode == 200){
                output = response.body().string();
            }
        }catch (IOException e){}

        if (responseCode != 200){
            throw new MalformedURLException("Error Code: " + responseCode);
        }

        return output;
    }
}
