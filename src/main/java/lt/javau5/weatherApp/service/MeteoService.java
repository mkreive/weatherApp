package lt.javau5.weatherApp.service;

import lt.javau5.weatherApp.entity.WeatherData;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class MeteoService {

    public WeatherData getWeather(String weatherUrl) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<WeatherData> response = restTemplate.exchange(weatherUrl, HttpMethod.GET, entity, WeatherData.class);


        if (response.getStatusCode() == HttpStatus.OK ) {
            return response.getBody();
        } else {
            // Handle error response
            return null;
        }
    }

}
