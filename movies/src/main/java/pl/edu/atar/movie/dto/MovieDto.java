package pl.edu.atar.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDto implements Serializable {

    private Long movieId;
    private String title;
    private String image;
    private Integer releaseYear;

//    public MovieDto() {
//    }
//
//    public Long getMovieId() {
//        return movieId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public Integer getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setMovieId(Long movieId) {
//        this.movieId = movieId;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public void setReleaseYear(Integer releaseYear) {
//        this.releaseYear = releaseYear;
//    }

    private MovieDto(Builder builder) {
        this.movieId = builder.movieId;
        this.title = builder.title;
        this.image = builder.image;
        this.releaseYear = builder.releaseYear;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public static class Builder {
        private Long movieId;
        private String title;
        private String image;
        private Integer releaseYear;

        public Builder() {
        }

        public Builder movieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder releaseYear(Integer releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public MovieDto build() {
            return new MovieDto(this);
        }


    }


}
