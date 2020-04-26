package ethuware.stest2.test4;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class TestClass {
    public static void main(String[] args) {
        IntStream is1 = IntStream.range(0, 5); //1
        OptionalDouble x = is1.average(); //2
        System.out.println(x); //3
    }
}
