package ethuware.lambda.test6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//imports not shown
class Movie{

    static enum Genre  {DRAMA, THRILLER, HORROR, ACTION };

    private Genre genre;
    private String name;
    Movie(String name, Genre genre){
        this.name = name; this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
public class FilteringStuff {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("On the Waterfront", Movie.Genre.DRAMA),
                new Movie("Psycho", Movie.Genre.THRILLER),
                new Movie("Oldboy", Movie.Genre.THRILLER),
                new Movie("Shining", Movie.Genre.HORROR)
        );
        Predicate<Movie> horror = mov->mov.getGenre() == Movie.Genre.THRILLER;
        Predicate<Movie> name = mov->mov.getName().startsWith("O");
        //1 INSERT CODE HERE
        movies.stream().filter(horror).filter(name).forEach(mov->System.out.println(mov.getName()));
    }

}
