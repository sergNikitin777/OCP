package ethuware.stest1.test11;

import java.util.concurrent.RecursiveTask;

class ComplicatedTask extends RecursiveTask<Integer> {
    int[] ia; int from; int to;
    public ComplicatedTask(int[] ia, int from, int to){
        this.ia = ia;
        this.from = from;
        this.to = to;
    }
    public int transform(int t){
        //this is a CPU intensive operation that
        //transforms t and returns the value
        System.out.println("transform start:"+t);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("transform end:"+(t+1));
        return t+1;
    }
    protected Integer compute() {
        if(from == to){
            System.out.println("from == to");
            return transform(ia[from]);
        }
        else if(from+1==to){
            System.out.println("from+1==to");
            return transform(ia[from])+transform(ia[to]);
        }
        else{
            System.out.println("else");

            int mid = (from+to)/2;
            ComplicatedTask newtask1 = new ComplicatedTask(ia, from, mid);
            ComplicatedTask newtask2 = new ComplicatedTask(ia, mid+1, to);
            newtask1.fork();

            int x = newtask2.compute();  //LINE A
            int y = newtask1.join(); //LINE B

            return x+y;
        }
    }
}