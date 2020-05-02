package ethuware.stest3.test22;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private int id;
    private String title;
    private String genre;
    private String author;
    private double price;

    public Book(int id, String title, String genre, String author, double price) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(0,"There is a hippy on the highway", "Thriller", "James Hadley Chase",33),
                new Book(1,"Coffin from Hongkong", "Thriller", "James Hadley Chase",43),
                new Book(2,"The Client", "Thriller", "John Grisham",23),
                new Book(3,"Gone with the wind", "Fiction", "Margaret Mitchell",45)
        );
        Map<String, Map<String, List<Book>>> classified = null;
        classified = books.stream().collect(Collectors.groupingBy(
                //x->x.getGenre(), Collectors.groupingBy(x->x.getAuthor()) //this is fine as well.
                Book::getGenre, Collectors.groupingBy(Book::getAuthor)
        ));
        System.out.println(classified);
    }
}
