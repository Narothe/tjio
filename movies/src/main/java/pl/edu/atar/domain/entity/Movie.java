//package pl.edu.atar.domain.entity;
//
//import jakarta.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "movies")
//public class Movie implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "movie_id")
//    private Long movieId;
//
//    @Column(name = "title")
//    private String title;
//
//    @Column(name = "image")
//    private String image;
//
//    @Column(name = "release_year")
//    private Integer releaseYear;
//
//    public Movie() {
//    }
//
//    public Long getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(Long movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public Integer getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setReleaseYear(Integer releaseYear) {
//        this.releaseYear = releaseYear;
//    }
//}

package pl.edu.atar.domain.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "release_year")
    private Integer releaseYear;

    private Movie(Builder builder) {
        this.movieId = builder.movieId;
        this.title = builder.title;
        this.image = builder.image;
        this.releaseYear = builder.releaseYear;
    }

    public Movie() {

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

        public Movie build() {
            return new Movie(this);
        }
    }
}
