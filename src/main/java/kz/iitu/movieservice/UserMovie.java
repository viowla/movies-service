package kz.iitu.movieservice;

import java.util.List;

public class UserMovie {
    private List<Movie> userMovies;

    public UserMovie() {
    }

    public UserMovie(List<Movie> userMovies) {
        this.userMovies = userMovies;
    }
}
