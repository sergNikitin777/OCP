package ethuware.stest4.test41;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestClass {
    public static void main(String[] args) {

        String name = "bob";
        String val = null;
//Insert code here

        Supplier<String> s = name::toUpperCase;
        val = s.get();

//        Supplier<String> s = name::toUpperCase;
//        val = s.apply();

//        Function<String> f = name::toUpperCase;
//        val = f.get();

//        Function<String> f = name::toUpperCase;
//        val = f.apply();

//        Function<String, Locale> f = name::toUpperCase;
//        val = f.apply();



        System.out.print(val);

    }
}
