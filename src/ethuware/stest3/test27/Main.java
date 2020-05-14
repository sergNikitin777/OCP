package ethuware.stest3.test27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book{
    private String title;
    private Double price;
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0)
        );
        //Map<String,Double> map = books.stream().collect(Collectors.toMap(b->b.getTitle(), b->b.getPrice()));
        Map<String,Double> map = books.stream().collect(Collectors.toMap(b->b.getTitle(), b->b.getPrice(),(b,b1)->b+b1));
        System.out.println(map);
                //.forEach((a, b)->System.out.println(a+" "+b));
    }
}
