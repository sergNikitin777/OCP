package ethuware.stest4.test24;

import java.io.Console;

public class TestConsole {
    public static void main(String[] args) {

        Console c = System.console(); //1
        String line = c.readLine("Please enter your name:"); //2
        System.out.println("Hello, "+line); //3

    }
}
