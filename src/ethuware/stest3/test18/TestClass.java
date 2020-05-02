package ethuware.stest3.test18;

import java.util.*;
public class TestClass {
    public static void main(String[] args)
    {
        // put declaration here
        //Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>(); //will work if lines //2 and //3 are commented out.
        Map m = new HashMap();


        m.put("1", new ArrayList());    //1
        m.put(1, new Object());    //2
        m.put(1.0, "Hello");     //3
        System.out.println(m);
    }
}