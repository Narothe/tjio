package pl.edu.atar.domain.mapper;

@FunctionalInterface
public interface Converter<S, T> {
    T convert(S source);
}
