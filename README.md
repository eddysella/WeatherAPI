# WeatherAPI
A REST API service for Investiere Internship

# Instructions

It is recommended to access both the deployed version and the local version with Postman by sending a GET request to the index page ( / ).

The index ( / ) page lists instructions and the available endpoints with query params.
![alt text](https://github.com/eddysella/WeatherAPI/blob/master/readmeImages/indexSample.png?raw=true)

GET: /weatherRoute
![alt text](https://github.com/eddysella/WeatherAPI/blob/master/readmeImages/GETweatherRouteSample.jpg?raw=true)

GET: /lastFiveWeatherRoutes
![alt text](https://github.com/eddysella/WeatherAPI/blob/master/readmeImages/GETLastFiveQueriesSample.png?raw=true)

DELETE: /lastFiveWeatherRoutes
![alt text](https://github.com/eddysella/WeatherAPI/blob/master/readmeImages/DELETELastFiveQueriesSample.png?raw=true)

# Deployed Version

Heroku Deployment: https://edoardo-sella-weather-api.herokuapp.com/

# Local Deployment - Requires Java Version: 14

Once downloaded and unzipped the project can be loaded in an IDE and the main class found at: edoardosella.WeatherAPI.WeatherApiApplication.java can be executed to launch the service.

The service is then accessible at the URL: http://localhost:8080/
