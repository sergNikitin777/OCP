package ethuware.threads.test6;

public class TestClass {
    static StringBuffer sb1 = new StringBuffer();
    static StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) {
        new Thread
                (
                        new Runnable() {
                            public void run() {
                                int i = 0;
                                while (i < 100) {
                                    synchronized (sb1) {
                                        sb1.append("X");
                                        try {
                                            Thread.sleep(100);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        synchronized (sb2) {
                                            sb2.append("Y");
                                        }
                                    }
                                    i++;
                                }
                                System.out.println(sb1);
                            }
                        }
                ).start();
        new Thread
                (
                        new Runnable() {
                            public void run() {
                                int i = 0;
                                while (i < 100) {
                                    synchronized (sb1) {
                                        sb1.append("X");
                                        synchronized (sb2) {
                                            sb2.append("Y");
                                        }
                                    }
                                    i++;
                                }
                                System.out.println(sb2);
                            }
                        }
                ).start();
    }
}
