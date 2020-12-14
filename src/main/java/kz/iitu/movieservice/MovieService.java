package kz.iitu.movieservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private MovieRepository movieRepository;

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> searchMovies(String id) {
        return movieRepository.findMovieById(id);
    }
}
