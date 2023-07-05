package lt.javau5.weatherApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "observations")
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "observation_time_utc")
    private String observationTimeUtc;

    @Column(name = "air_temperature")
    private double airTemperature;

    @Column(name = "feels_like_temperature")
    private double feelsLikeTemperature;

    @Column(name = "wind_speed")
    private double windSpeed;

    @Column(name = "wind_gust")
    private double windGust;

    @Column(name = "wind_direction")
    private double windDirection;

    @Column(name = "cloud_cover")
    private double cloudCover;

    @Column(name = "see_level_pressure")
    private double seeLevelPressure;

    @Column(name = "relative_humidity")
    private double relativeHumidity;

    @Column(name = "precipitation")
    private double precipitation;

    @Column(name = "condition_code")
    private String conditionCode;

    public Observation() {
    }

    public Observation(String observationTimeUtc, double airTemperature,
                       double feelsLikeTemperature, double windSpeed,
                       double windGust, double windDirection, double cloudCover,
                       double seeLevelPressure, double relativeHumidity, double precipitation,
                       String conditionCode) {
        this.observationTimeUtc = observationTimeUtc;
        this.airTemperature = airTemperature;
        this.feelsLikeTemperature = feelsLikeTemperature;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windDirection = windDirection;
        this.cloudCover = cloudCover;
        this.seeLevelPressure = seeLevelPressure;
        this.relativeHumidity = relativeHumidity;
        this.precipitation = precipitation;
        this.conditionCode = conditionCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObservationTimeUtc() {
        return observationTimeUtc;
    }

    public void setObservationTimeUtc(String observationTimeUtc) {
        this.observationTimeUtc = observationTimeUtc;
    }

    public double getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(double airTemperature) {
        this.airTemperature = airTemperature;
    }

    public double getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(double feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getSeeLevelPressure() {
        return seeLevelPressure;
    }

    public void setSeeLevelPressure(double seeLevelPressure) {
        this.seeLevelPressure = seeLevelPressure;
    }

    public double getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    @Override
    public String toString() {
        return "Observation{" +
                "id=" + id +
                ", observationTimeUtc='" + observationTimeUtc + '\'' +
                ", airTemperature=" + airTemperature +
                ", feelsLikeTemperature=" + feelsLikeTemperature +
                ", windSpeed=" + windSpeed +
                ", windGust=" + windGust +
                ", windDirection=" + windDirection +
                ", cloudCover=" + cloudCover +
                ", seeLevelPressure=" + seeLevelPressure +
                ", relativeHumidity=" + relativeHumidity +
                ", precipitation=" + precipitation +
                ", conditionCode='" + conditionCode + '\'' +
                '}';
    }
}
