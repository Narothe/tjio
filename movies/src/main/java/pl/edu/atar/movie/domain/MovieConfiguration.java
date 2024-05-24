package pl.edu.atar.movie.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfiguration {
    @Bean
    MovieFacade movieFacade(MovieRepository movieRepository) {
        return new MovieFacade(movieRepository);
    }
}