package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Scope("request")
@RestController(value = "GETWeatherRouteController")
class Controller {

    @Autowired
    private ResponseProcessor responseProcessor;

    private int dateDifference;
    private List<String> citiesList;
    private List<String> errorsList = new ArrayList<>();

    Controller() { }

    @GetMapping(value = "/weatherRoute")
    public ResponseEntity<String> getWeatherRoute(@RequestParam(value = "date") String dateParam, @RequestParam(value = "cities") String citiesParam, @RequestParam(value = "apikey") String apikeyParam) {
        evaluateParameters(dateParam, citiesParam, apikeyParam);
        if (errorsList.size() > 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(String.join(", ", errorsList));
        } else {
            try {
                return ResponseEntity.ok(responseProcessor.getResponseString(citiesList, apikeyParam, dateDifference));
            } catch (MalformedURLException e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("API key invalid or Weather service unavailable, " + e.getMessage());
            }
        }
    }

    private void evaluateParameters(String dateParam, String citiesParam, String apikeyParam) {
        evaluateApikeyParam(apikeyParam);
        evaluateCitiesParam(citiesParam);
        evaluateDateParam(dateParam);
    }

    private void evaluateApikeyParam(String apikeyParam) {
        if (apikeyParam.length() < 1) {
            errorsList.add("An API key at least 1 char long must be included in the request");
        }
    }

    private void evaluateCitiesParam(String citiesParam) {
        if (citiesParam.length() < 1) {
            errorsList.add("At least one city must be included in the request");
        } else if (checkCitiesParamFormatInvalid(citiesParam)) {
            errorsList.add("Invalid cities parameter format");
        } else {
            citiesList = new ArrayList<>(Arrays.asList(citiesParam.split("&")));
        }

    }

    private boolean checkCitiesParamFormatInvalid(String citiesParam) {
        for (int i = 0; i < citiesParam.length(); i++) {
            if (!(Character.isDigit(citiesParam.charAt(i)) || citiesParam.charAt(i) == '&')) {
                return true;
            }
        }
        return false;
    }

    private void evaluateDateParam(String dateParam) {
        if (dateParam.length() < 1) {
            errorsList.add("A valid date must be included in the request");
        } else {
            try {
                dateDifference = calculateDateDifference(dateParam);
            } catch (IllegalArgumentException e) {
                errorsList.add("Date is malformed: " + e.getMessage());
            }
            if (dateDifference < 0) {
                errorsList.add("Selected date already passed");
            } else if (dateDifference > 4) {
                errorsList.add("Selected date too far in the future (max 4 days ahead)");
            }
        }
    }

    private int calculateDateDifference(String dateParam) throws IllegalArgumentException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        DateTime pastDate = DateTime.parse(dateParam, formatter).withTimeAtStartOfDay();
        DateTime today = new DateTime().withTimeAtStartOfDay();
        return Days.daysBetween(today, pastDate).getDays();
    }
}
