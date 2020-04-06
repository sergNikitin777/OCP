package ethuware.advclassdesign.test6;

class Outsider
{
    public class Insider{ }
}
public class TestClass
{
    public static void main(String[] args)
    {
        Outsider os = new Outsider();
        // 1 insert line here
        Outsider.Insider in = os.new Insider();
    }
}
