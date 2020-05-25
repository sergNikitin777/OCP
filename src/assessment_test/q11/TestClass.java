package assessment_test.q11;

import java.util.Optional;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        //magic(Stream.empty());                java.util.NoSuchElementException
        //magic(Stream.iterate(1, x ->> x++));  Not Compile
        //magic(Stream.of(5, 10));              java.util.NoSuchElementException

    }

    private static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x-y);
        System.out.println(o.get());
    }
}
