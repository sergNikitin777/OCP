package ethuware.stest2.test32;

import java.util.Arrays;
import java.util.List;

class MyProcessor{
    Integer value;
    public MyProcessor(Integer value){
        this.value = value;
    }
    public void process(){
        System.out.println(value+" ");
    }
}
public class TestClass {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        //INSERT CODE HERE
        ls.stream()
                .map(MyProcessor::new)
                .forEach(MyProcessor::process);
    }
}