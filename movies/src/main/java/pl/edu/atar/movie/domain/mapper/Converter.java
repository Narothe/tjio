package pl.edu.atar.movie.domain.mapper;

@FunctionalInterface
public interface Converter<S, T> {
    T convert(S source);
}
