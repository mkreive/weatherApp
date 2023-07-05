package lt.javau5.weatherApp.controller;

import lt.javau5.weatherApp.entity.WeatherData;
import lt.javau5.weatherApp.service.MeteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    MeteoService service;

    @GetMapping("/vilnius")
    public WeatherData getVilniausData() {

        String url = "https://api.meteo.lt/v1/stations/vilniaus-ams/observations/2023-07-04";

        return service.getWeather(url);

    }
}
