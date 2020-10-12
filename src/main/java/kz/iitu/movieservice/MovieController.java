package kz.iitu.movieservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movie/info")
public class MovieController {

    @GetMapping("/{userId}")
    public UserMovie getMoviesByUserId(
            @PathVariable("userId") String userId) {

        List<Movie> userMovieList =  Arrays.asList(
                new Movie("1", "Title 1", "Overview 1", "Action, Comedy"),
                new Movie("2", "Title 2", "Overview 2", "Thriller, Horror"));

        UserMovie userMovie = new UserMovie(userMovieList);

        return userMovie;
    }
    @GetMapping("/detail/{id}")
    public Movie getBookById(@PathVariable("id") String id) {

        return new Movie(id,  "Title", "Overview", "Genres");
    }

    @GetMapping("")
    public List<Movie> getAllMovies(){
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("1","title","overview","action"));
        movieList.add(new Movie("1","title","overview","action"));
        movieList.add(new Movie("1","title","overview","action"));
        movieList.add(new Movie("1","title","overview","action"));
        movieList.add(new Movie("1","title","overview","action"));
        movieList.add(new Movie("1","title","overview","action"));
        return movieList;
    }

}
