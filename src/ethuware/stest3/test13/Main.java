package ethuware.stest3.test13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Book {
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Война и мир","роман"),
                new Book("Обитаемый остров","фантастика"),
                new Book("Евгений Онегин","поэма"));
                Comparator<Book> c1 =  (b1, b2)->b1.getGenre().compareTo(b2.getGenre()); //1
        //List<Book> sortedBooks = books.stream().sorted(c1.thenComparing(Book::getTitle)).collect(Collectors.toList()); //2
        List<Book> sortedBooks = books.stream().sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList()); //2
        System.out.println(books);
        System.out.println(sortedBooks);
    }
}
