package pl.edu.atar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.atar.domain.dto.MovieDto;
import pl.edu.atar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieListMapper implements Converter<Movie, MovieDto> {

    @Override
    public MovieDto convert(Movie movie) {
        return new MovieDto.Builder()
                .movieId(movie.getMovieId())
                .title(movie.getTitle())
                .image(movie.getImage())
                .releaseYear(movie.getReleaseYear())
                .build();
    }

    public List<MovieDto> mapToDto(List<Movie> movies) {
        List<MovieDto> moviesDto = new ArrayList<>();

        movies.stream()
                .map(this::convert)
                .forEach(moviesDto::add);

        return moviesDto;
    }
}
