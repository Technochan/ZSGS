package java_assignment_12_Abstract_classes_and_abstract_methods.movie.horrermovie;

import java_assignment_12_Abstract_classes_and_abstract_methods.movie.abstractclass.Movie;

public class HorrorMovie extends Movie {

    private String hero;
    private String heroin;
    private String directorName;
    private String produceName;
    public HorrorMovie(String movieName, int songCount, String hero, String heroin, String directorName, String producerName) {
        super(movieName, songCount);
        this.hero = hero;
        this.heroin = heroin;
        this.directorName = directorName;
        this.produceName = producerName;
    }

    @Override
    public String getMovieDetails() {
        return super.getMovieDetails() + " Genre: Horror | Hero : " + hero + " | Heroin : " + heroin + " | "+ getDirectorName()+ " | "+ getProducerName();
    }

    @Override
    public String getDirectorName() {
        return " Director Name : " + directorName;
    }

    @Override
    public String getProducerName() {
        return " Producer Name : " +produceName;
    }
}
