package database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Exemplar {
    @PrimaryKey
    int id;
    String name;
    String city;
    String country;
    String histry;
    String achievement;
    double coordinates;

    public Exemplar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Exemplar(int id, String name, String city, String country) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public Exemplar(int id, String name, String city, String country, String histry, String achievement, double coordinates) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.histry = histry;
        this.achievement = achievement;
        this.coordinates = coordinates;


    }
}
