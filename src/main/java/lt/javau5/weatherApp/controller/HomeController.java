package lt.javau5.weatherApp.controller;

import lt.javau5.weatherApp.entity.WeatherData;
import lt.javau5.weatherApp.service.MeteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    MeteoService service;

    @GetMapping("/home")
    public String getHome(Model model) {

        return "home";
    }

    @GetMapping("/vilnius")
    public String getVilnius(Model model) {

        String url = "https://api.meteo.lt/v1/stations/vilniaus-ams/observations/latest";

        WeatherData weatherData = service.getWeather(url);

        model.addAttribute("xData", weatherData.getHours());
        model.addAttribute("yData", weatherData.getTemperatures());
        model.addAttribute("tData", weatherData.getFeelsLike());
        model.addAttribute("wData", weatherData.getWindSpeed());
        model.addAttribute("cData", weatherData.getClouds());

        return "station";
    }

    @GetMapping("/kaunas")
    public String getKaunas(Model model) {

        String url = "https://api.meteo.lt/v1/stations/kauno-ams/observations/latest";

        WeatherData weatherData = service.getWeather(url);

        model.addAttribute("xData", weatherData.getHours());
        model.addAttribute("yData", weatherData.getTemperatures());
        model.addAttribute("tData", weatherData.getFeelsLike());
        model.addAttribute("wData", weatherData.getWindSpeed());
        model.addAttribute("cData", weatherData.getClouds());

        return "station";
    }

    @GetMapping("/klaipeda")
    public String getKlaipeda(Model model) {

        String url = "https://api.meteo.lt/v1/stations/klaipedos-ams/observations/latest";

        WeatherData weatherData = service.getWeather(url);

        model.addAttribute("xData", weatherData.getHours());
        model.addAttribute("yData", weatherData.getTemperatures());
        model.addAttribute("tData", weatherData.getFeelsLike());
        model.addAttribute("wData", weatherData.getWindSpeed());
        model.addAttribute("cData", weatherData.getClouds());

        return "station";
    }
}
