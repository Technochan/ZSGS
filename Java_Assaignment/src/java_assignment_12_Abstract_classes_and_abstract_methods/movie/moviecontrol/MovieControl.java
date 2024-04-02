package java_assignment_12_Abstract_classes_and_abstract_methods.movie.moviecontrol;


import java_assignment_12_Abstract_classes_and_abstract_methods.movie.abstractclass.Movie;
import java_assignment_12_Abstract_classes_and_abstract_methods.movie.horrermovie.HorrorMovie;
import java_assignment_12_Abstract_classes_and_abstract_methods.movie.romanticmovie.RomComMovie;

public class MovieControl {
    public void initialControl() {
        Movie movie1 = new RomComMovie("Vaaranam Aayiram", 5, "Surya", "Sameera","Someone","Someone");
        Movie movie2 = new HorrorMovie("Conjuring", 1, "Veronica","James Wan","Someone","Someone");

        System.out.println(movie1.getMovieDetails());
        System.out.println(movie2.getMovieDetails());
    }
}
