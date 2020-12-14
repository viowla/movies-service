package kz.iitu.movieservice;

import kz.iitu.genresservice.Genre;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;
    private String overview;

    /*@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "movie_genre",
            joinColumns = {@JoinColumn(name="movie_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name="genre_id", referencedColumnName = "id")})
    private List<Genre> genres;*/



    


}
