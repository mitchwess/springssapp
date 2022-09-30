package mw.streamsearchapp.Models;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="disney")
public class disney {
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
}