package kz.iitu.movieservice;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class MovieController {


    private MovieRepository movieRepository;
    private MovieService movieService;

    @GetMapping("/movie/all")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<List<Movie>> getMovie(@PathVariable String id) {
        return new ResponseEntity<>(movieService.searchMovies(id), HttpStatus.OK);
    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        return new ResponseEntity<>(movieService.addMovie(movie), HttpStatus.CREATED);
    }

}
