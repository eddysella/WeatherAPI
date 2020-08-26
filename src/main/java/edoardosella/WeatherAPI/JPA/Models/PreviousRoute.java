package edoardosella.WeatherAPI.JPA.Models;

import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.Route;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "previousroutes")
public class PreviousRoute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "route")
    private String route;

    public PreviousRoute(){}

    public PreviousRoute(String route) {
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
        PreviousRoute previousRoute = (PreviousRoute) o;
        return id == previousRoute.id &&
                route.equals(previousRoute.route);
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
