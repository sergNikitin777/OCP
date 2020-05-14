package ethuware.stest3.test34;

import java.util.function.UnaryOperator;

public class TestClass {
    public static void main(String[] args) {
        String val1 = "hello";
        //StringBuilder val2 = new StringBuilder("world");
        String val2 = new String("world");
        UnaryOperator<String> uo1 = s1->s1.concat(val1); //1
        UnaryOperator<String> uo2 = s->s.toUpperCase(); //2
        System.out.println(uo1.apply(uo2.apply(val2))); //3
    }
}
