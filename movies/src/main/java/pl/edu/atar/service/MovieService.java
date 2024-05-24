package pl.edu.atar.service;

import pl.edu.atar.movie.dto.*;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();
}
