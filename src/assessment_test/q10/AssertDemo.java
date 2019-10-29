package assessment_test.q10;

/**
 * Created by snikitin on 29.10.19.
 */
public class AssertDemo {
    public static void main(String[] args) {
        Integer x = 10;
        x++;
        assert x == null && x >= 0;
        System.out.println(x);
    }
}