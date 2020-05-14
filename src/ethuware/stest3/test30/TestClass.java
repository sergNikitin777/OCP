package ethuware.stest3.test30;

import java.util.function.Function;
import java.util.function.Supplier;

class MyProcessor{
    int value;
    public MyProcessor(){ value = 10; }
    public MyProcessor(int value){
        this.value = value;
    }
    public void process(){
        System.out.println("Processing "+value);
    }
}

public class TestClass {
    public static void main(String[] args) {

        Supplier<MyProcessor> supp = MyProcessor::new;
        MyProcessor mp = supp.get();
        mp.process();

//        Supplier<MyProcessor> supp1 = MyProcessor::new(10);
//        MyProcessor mp1 = supp.get();
//        mp1.process();

//        Supplier<MyProcessor> supp2 = MyProcessor(10)::new;
//        MyProcessor mp2 = supp.get();
//        mp2.process();

        Function<Integer, MyProcessor> f = MyProcessor::new;
        MyProcessor mp3 = f.apply(10);
        mp3.process();

//        MyProcessor mp4 = MyProcessor::new(10);
//        mp.process();

    }
}
