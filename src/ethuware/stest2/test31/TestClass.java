package ethuware.stest2.test31;

import java.util.*;
public class TestClass
{
    static String[] sa = { "a", "aa", "aaa", "aaaa" };
    static
    {
        Arrays.sort(sa);
    }
    public static void main(String[] args)
    {
        String search = "aaa";
        if(args.length != 0) search = args[0];
        System.out.println(Arrays.binarySearch(sa, search));
    }
}

