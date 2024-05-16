package java_assignment_7_class_and_object_and_encapsulation;

// Create a Movie DTO class
import java.util.ArrayList;

public class MovieDTO {
    private String title;
    private int releaseYear;
    private String director;
    private String producer;
    private String genre;
    private String censorDetail;
    private ArrayList<Actors> actors;

    // Constructors
    public MovieDTO(String title, int releaseYear, String director,String producer, String genre,String censorDetail, ArrayList<Actors> actors) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.producer = producer;
        this.actors = actors;
        this.genre = genre;
        this.censorDetail = censorDetail;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Actors> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actors> actors) {
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCensorDetail() {
        return censorDetail;
    }

    public void setCensorDetail(String censorDetail) {
        this.censorDetail = censorDetail;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
class Actors{
    private String heroName;
    private String heroinName;
    private String comedianName;
    private String musicianName;
    private String villainName;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroinName() {
        return heroinName;
    }

    public void setHeroinName(String heroinName) {
        this.heroinName = heroinName;
    }

    public String getComedianName() {
        return comedianName;
    }

    public void setComedianName(String comedianName) {
        this.comedianName = comedianName;
    }

    public String getMusicianName() {
        return musicianName;
    }

    public void setMusicianName(String musicianName) {
        this.musicianName = musicianName;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }
}
