package ethuware.stest4.test17;

import java.io.Console;

public class TestClass {
    public static void main(String[] args) {
        Console c = System.console();
        String id = c.readLine("%s", "Enter UserId:"); //1
        System.out.println("userid is " + id); //2
        char[] pwd = c.readPassword("%s", "Enter Password :"); //3
        System.out.println("password is " + String.valueOf(pwd)); //4
    }
}
