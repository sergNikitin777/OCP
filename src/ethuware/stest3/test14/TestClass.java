package ethuware.stest3.test14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

class Book {
    private String title;
    private Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

public class TestClass {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Atlas Shrugged", 10.0),
                new Book("Freedom at Midnight", 5.0),
                new Book("Gone with the wind", 5.0)
        );

        Map<String, Double> bookMap = books.stream().collect(Collectors.toMap((b -> b.getTitle()), b -> b.getPrice()));

        BiConsumer<String, Double> func = (a, b) -> {
            if (a.startsWith("A")) {
                System.out.println(b);
            }
        };

        bookMap.forEach(func);

        books.stream()
                .filter(b -> b.getTitle().startsWith("F"))
                .forEach(b -> b.setPrice(10.0));

        books.stream()
                .forEach(b -> System.out.println(b.getTitle() + ":" + b.getPrice()));

        Map<String , List<? extends CharSequence>> stateCitiesMap = new HashMap<>();

    }
}
