package pl.edu.atar.movie;

import jakarta.persistence.Access;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.atar.movie.domain.MovieFacade;
import pl.edu.atar.movie.dto.MovieDto;
import pl.edu.atar.service.MovieService;

import java.util.List;
@RestController
@RequestMapping(value="/api")
public class MovieApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieApiController.class);

    private final MovieFacade movieFacade;

    public MovieApiController(MovieFacade movieFacade) {
        this.movieFacade = movieFacade;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<MovieDto>> getMovies() {
        LOGGER.info("find all movies");

        List<MovieDto> moviesDto = movieFacade.findAll();
        return new ResponseEntity<>(moviesDto, HttpStatus.OK);
    }
}
