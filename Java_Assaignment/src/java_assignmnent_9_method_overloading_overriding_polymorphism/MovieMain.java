package java_assignmnent_9_method_overloading_overriding_polymorphism;

class Movie {
    private String movieName;
    private int songsCount;

    public Movie(String movieName, int songsCount) {
        this.movieName = movieName;
        this.songsCount = songsCount;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public String getMovieDetails() {
        return "Title : " + movieName + " |  SongsCount : " + songsCount ;
    }
}

class RomComMovie extends Movie {
    private String hero;
    private String heroin;
    public RomComMovie(String movieName, int songCount, String hero, String heroin) {
        super(movieName, songCount);
        this.hero = hero;
        this.heroin = heroin;
    }

    @Override
    public String getMovieDetails() {
        return super.getMovieDetails() + " Genre: Romantic | Hero : " + hero + " | Heroin : " + heroin ;
    }
}

class ThrillerMovie extends Movie {
    private String ghostName;
    private String director;

    public ThrillerMovie(String movieName, int songCount, String ghostName, String director) {
        super(movieName, songCount);
        this.ghostName = ghostName;
        this.director = director;
    }

    @Override
    public String getMovieDetails() {
        return super.getMovieDetails() + " Genre: Thriller " +" GhostName : "+ ghostName +" Director: " + director;
    }
}

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new RomComMovie("Vaaranam Aayiram", 5, "Surya", "Sameera");
        Movie movie2 = new ThrillerMovie("Conjuring", 1, "Veronica","James Wan");

        System.out.println(movie1.getMovieDetails());
        System.out.println(movie2.getMovieDetails());
    }
}
