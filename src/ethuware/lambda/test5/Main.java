package ethuware.lambda.test5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a"); hm.put(2, "b"); hm.put(3, "c");

        hm.forEach((key, value)->System.out.printf("%d %s ", key, value));

    }
}
