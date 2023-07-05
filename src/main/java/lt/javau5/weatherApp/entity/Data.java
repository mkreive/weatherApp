package lt.javau5.weatherApp.entity;

import java.util.List;

public class Data {
    Station station;
    List<Observation> observations;

    public Data() {
    }

    public Data(Station station, List<Observation> observations) {
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
