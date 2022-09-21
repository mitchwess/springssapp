package mw.streamsearchapp.Models;
import lombok.Data;
import org.hibernate.type.TextType;

import javax.persistence.*;

@Data
@Entity
@Table(name="netflix")
public class netflix {
    @Id
    @Column(name="show_id", nullable = false)
    private String show_id;
    @Column(name="show_type")
    private String show_type;
    @Column(name="title")
    private String title;
    @Column(name="director")
    private String director;
    @Column(name="show_cast")
    private String show_cast;
    @Column(name="country")
    private String country;
    @Column(name="date_added")
    private String date_added;
    @Column(name="release_year")
    private Integer release_year;
    @Column(name="rating")
    private String rating;
    @Column(name="duration")
    private String duration;
    @Column(name="listed_in")
    private String listed_in;
    @Column(name="show_description")
    private String show_description;

    public netflix(String show_id, String show_type, String title,
                   String director, String show_cast, String country,
                   String date_added, Integer release_year, String rating,
                   String duration, String listed_in, String show_description) {
        this.show_id = show_id;
        this.show_type = show_type;
        this.title = title;
        this.director = director;
        this.show_cast = show_cast;
        this.country = country;
        this.date_added = date_added;
        this.release_year = release_year;
        this.rating = rating;
        this.duration = duration;
        this.listed_in = listed_in;
        this.show_description = show_description;
    }
}
