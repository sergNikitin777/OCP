package ethuware.stest2.test11;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class TestClass {
    public static void main(String[] args) {
        List<Double> dList = Arrays.asList(10.0, 12.0);
        DoubleFunction df = x->x+10;
        //dList.stream().forEach(df);
        dList.stream().forEach(d->System.out.println(d));
    }
}
