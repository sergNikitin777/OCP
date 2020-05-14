package ethuware.stest4.test8;

import com.apple.eawt.AppEvent;

public class Outer
{
    int i = 10;
    class Inner
    {
        public Inner() {
            methodA();
        }

        public void methodA()
        {
            //line 1.
            System.out.println(i);
            System.out.println(Outer.this.i);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
