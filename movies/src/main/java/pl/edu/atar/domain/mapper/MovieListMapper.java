package pl.edu.atar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.atar.domain.dto.MovieDto;
import pl.edu.atar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieListMapper {

    public List<MovieDto> mapToDto(List<Movie> movies) {
        List<MovieDto> moviesDto = new ArrayList<>();

//        for(Movie movie: movies) {
//            MovieDto movieDto = new MovieDto();
//
//            movieDto.setMovieId(movie.getMovieId());
//            movieDto.setTitle(movie.getTitle());
//            movieDto.setImage(movie.getImage());
//            movieDto.setReleaseYear(movie.getReleaseYear());
//
//            moviesDto.add(movieDto);
//        }

        //strumień w mapperze
        movies.stream()
                .map(movie -> new MovieDto.Builder()
                        .movieId(movie.getMovieId())
                        .title(movie.getTitle())
                        .image(movie.getImage())
                        .releaseYear(movie.getReleaseYear())
                        .build())
                .forEach(moviesDto::add);

        return moviesDto;
    }
}
