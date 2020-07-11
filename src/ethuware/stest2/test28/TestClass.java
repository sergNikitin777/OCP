package ethuware.stest2.test28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestClass {
    public static void main(String[] args) {
        Map hm = new ConcurrentHashMap();
        hm.put(null, "asdf");  //1 //NullPointerException
        hm.put("aaa", null);  //2 //NullPointerException

        hm = new HashMap();
        hm.put(null, "asdf");  //3
        hm.put("aaa", null);  //4

        List list = new ArrayList();
        list.add(null); //5
        list.add(null); //6

        list = new CopyOnWriteArrayList();
        list.add(null); //7
    }
}
