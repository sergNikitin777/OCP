package ethuware.threads.test9;

class MyClass implements Runnable
{
    int n = 0;
    public MyClass(int n){ this.n = n; }
    public static void main(String[] args)
    {
//        new MyClass(2).run();
//        new MyClass(1).run();
       new Thread( new MyClass(2)).start();
       new Thread( new MyClass(1)).start();
    }
    public void run()
    {
        for(int i=0; i<n; i++)
        {
            System.out.println("Hello World");
        }
    }
}
