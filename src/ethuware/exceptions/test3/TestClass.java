package ethuware.exceptions.test3;

public class TestClass
{
    public static boolean isGoodnumber(int n)
    {
        assert n>51;
        return true;
    }
    public static void main(String[] args)
    {
        int i = Integer.parseInt(args[1]);
        int j = Integer.parseInt(args[2]);
        do
        {
            i--;
            if( i < 5) break;
        }while( isGoodnumber(j--) );
        System.out.println(i);
    }
}

