package edoardosella.WeatherAPI.JPA.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "weatherroute")
public class WeatherRoute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "route", columnDefinition = "TEXT")
    private String route;

    public WeatherRoute() { }

    public WeatherRoute(String route) {
        this.route = route;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherRoute weatherRoute = (WeatherRoute) o;
        return id == weatherRoute.id &&
                route.equals(weatherRoute.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, route);
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", route='" + route + '\'' +
                '}';
    }
}
