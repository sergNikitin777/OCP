package ethuware.lambda.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Double> dList = Arrays.asList(10.0, 12.0);
        Consumer df = x->System.out.println(Double.valueOf(x.toString())+10);
        dList.stream().forEach(df);
        dList.stream().forEach(d->System.out.println(d));
    }
}
