package pl.edu.atar.movie.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.atar.movie.domain.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, CrudRepository<Movie, Long> {

    @Query("SELECT m FROM Movie m ORDER BY m.releaseYear ASC")
    List<Movie> findAll();
}
