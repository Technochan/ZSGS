package java_assignment_12_Abstract_classes_and_abstract_methods.movie.abstractclass;

public abstract class Movie {
    private String movieName;
    private int songsCount;
    public Movie(String movieName, int songsCount) {
        this.movieName = movieName;
        this.songsCount = songsCount;
    }

    public abstract String getDirectorName();
    public abstract String getProducerName();
    public String getMovieDetails(){
        return "Movie Name : "+movieName+" Song Count : "+songsCount;
    }
}
