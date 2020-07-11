package ethuware.stest5.test17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private String genre;
    public Book(String title, String genre){
        this.title = title; this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller")
        );

        List<String> genreList = new ArrayList<>();

        //right
        books.stream().map(Book::getGenre).forEach(s->genreList.add(s));
        //genreList = books.stream().map(Book::getGenre).collect(Collectors.toList());
        //books.stream().map(Book::getGenre).forEach(genreList::add);
        //books.stream().map(b->b.getGenre()).forEach(genreList::add);

        //wrong
        //books.stream().map(Book::getGenre).collect(Collectors.toList(genreList));
        //books.stream().flatMap(b->b.getGenre()).forEach(g->genreList.add(g));

        System.out.println(genreList);

    }
}