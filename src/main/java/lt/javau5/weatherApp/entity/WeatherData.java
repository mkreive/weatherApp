package lt.javau5.weatherApp.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WeatherData {

    @Autowired
    Station station;
    List<Observation> observations;

    public List<Double> getTemperatures() {
        return observations
                .stream()
                .map(d -> d.getAirTemperature())
                .toList();
    }

    public List<Integer> getHours(){
        return observations
                .stream()
                .map( d -> Integer.parseInt(d.getObservationTimeUtc().substring(11,13) ))
                .toList();
    }

    public List<Double> getFeelsLike() {
        return observations
                .stream()
                .map(Observation::getFeelsLikeTemperature)
                .toList();
    }

    public List<Double> getWindSpeed() {
        return observations
                .stream()
                .map(Observation::getWindSpeed)
                .toList();
    }

    public List<Double> getClouds() {
        return observations
                .stream()
                .map(Observation::getCloudCover)
                .toList();
    }

    public WeatherData() {
    }

    public WeatherData(Station station, List<Observation> observations) {
        this.station = station;
        this.observations = observations;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Data{" +
                "station=" + station +
                ", observations=" + observations +
                '}';
    }



}
