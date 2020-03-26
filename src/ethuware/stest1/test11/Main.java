package ethuware.stest1.test11;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int[] ia = {1,2,3,4,5,6};
        int from =1;
        int to =5;

        new ForkJoinPool().invoke(new ComplicatedTask(ia,from,to));
    }
}
