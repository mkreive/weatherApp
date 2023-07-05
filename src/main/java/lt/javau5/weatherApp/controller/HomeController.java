package lt.javau5.weatherApp.controller;

import lt.javau5.weatherApp.entity.WeatherData;
import lt.javau5.weatherApp.service.MeteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    MeteoService service;

    @GetMapping("/home")
    public String getHome(Model model) {
        List<Integer> xData = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> yData = Arrays.asList(10, 20, 15, 30, 25);
        model.addAttribute("xData", xData);
        model.addAttribute("yData", yData);
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


        return "home";
    }
}
