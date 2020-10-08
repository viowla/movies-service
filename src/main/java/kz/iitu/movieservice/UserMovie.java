package kz.iitu.movieservice;

import java.util.List;

public class UserMovie {
    private List<Movie> userBooks;

    public UserMovie() {
    }

    public UserMovie(List<Movie> userBooks) {
        this.userBooks = userBooks;
    }
}
