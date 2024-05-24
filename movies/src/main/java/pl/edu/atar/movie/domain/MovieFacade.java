package pl.edu.atar.movie.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.edu.atar.movie.dto.MovieDto;

import java.util.List;

public class MovieFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieFacade.class);

    private final MovieRepository movieRepository;

    public MovieFacade(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> findAll() {
        return movieRepository
                .findAll().stream()
                .map(Movie::dto)
                .toList();
    }
}
