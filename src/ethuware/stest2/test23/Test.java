package ethuware.stest2.test23;

class Point { int x, y; }
class ColoredPoint extends Point { int color; }
public class Test
{
    static void test(ColoredPoint p, Point q)
    {
        System.out.println("(ColoredPoint, Point)");
    }
    static void test(Point p, ColoredPoint q)
    {
        System.out.println("(Point, ColoredPoint)");
    }
    public static void main(String[] args)
    {
        ColoredPoint cp = new ColoredPoint();
        test((Point) cp, cp);
    }
}
