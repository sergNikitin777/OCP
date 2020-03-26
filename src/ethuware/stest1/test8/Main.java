package ethuware.stest1.test8;

import java.util.Arrays;
import java.util.List;

public class Main {

    public  static class Book{

        private String name;
        private double cost;

        public Book(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }
    }

    public static void main(String[] args) {
        List<List<Book>> books = Arrays.asList(
                Arrays.asList(
                        new Book("Windmills of the Gods", 7.0),
                        new Book("Tell me your dreams",9.0) ),
                Arrays.asList(
                        new Book("There is a hippy on the highway", 5.0),
                        new Book("Easy come easy go", 5.0)) );

        double d = books.stream()
                .flatMap(bs->bs.stream())
                .mapToDouble(e->e.getCost())
                .sum();
        System.out.println(d);
    }
}
