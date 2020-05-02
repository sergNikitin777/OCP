package ethuware.stest3.test10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 4, 6, 9); //1
        Predicate<Integer> check = (Integer i) -> {
            System.out.println("Checking");
            return i == 4; //2
        };
        Predicate<Integer> even = (Integer i)-> i%2==0;  //3
        Long res = values.stream().filter(check).filter(even).count(); //4
        System.out.println(res);
    }
}
