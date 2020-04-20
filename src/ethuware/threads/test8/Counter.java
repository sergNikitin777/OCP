package ethuware.threads.test8;

class Counter {
    public int startHere = 1;
    public int endHere = 100;

    public static void main(String[] args) {
        new Counter().go();
    }

    void go() {
        // A
//        Runnable a = new Runnable() {
//            public void run() {
//                for (int i = startHere; i <= endHere; i++) {
//                    System.out.println(i);
//                }
//            }
//        };

//        Thread a = new Thread()
//        {
//            public void run()
//            {
//                for (int i = startHere; i <= endHere; i++){ System.out.println(i); }
//            }
//        };

        class A implements Runnable
        {
            public void run()
            {
                for (int i = startHere; i <= endHere; i++){ System.out.println(i); }
            }
        };

        Runnable a = new A();

        Thread t = new Thread(a);
        t.start();
    }
}
