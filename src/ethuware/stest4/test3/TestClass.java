package ethuware.stest4.test3;

import java.util.Arrays;
import java.util.List;

class DoubleAppender {
    public static void apply(Double d){
        d +=10;
    }
}

public class TestClass {
    public static void main(String[] args) {

        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.stream().forEach(x->{ x = x+10; });
        dList.stream().forEach(d->System.out.println(d));
        //Consumer<Double> c = d-> System.out.println(d);
        //dList.stream().forEach(DoubleAppender::apply);
        //dList.stream().forEach(d->System.out.println(d));

    }
}
