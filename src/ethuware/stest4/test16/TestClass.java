package ethuware.stest4.test16;

import java.util.Optional;

public class TestClass {
    public static void main(String[] args) {

        Optional<Double> price = Optional.ofNullable(getPrice("1111"));
        System.out.println(price);

    }

    private static Double getPrice(String s) {
        return Double.valueOf(s);
    }
}
