package ethuware.stest4.test11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Tom Cruise", "Tom Hart", "Tom Hanks", "Tom Brady");
        Predicate<String> p = str->{
            System.out.println("Looking...");
            return str.indexOf("Tom") > -1;
        };
        boolean flag = ls.stream().filter(str->str.length()>8).allMatch(p);
    }
}
