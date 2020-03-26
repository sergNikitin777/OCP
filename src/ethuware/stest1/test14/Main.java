package ethuware.stest1.test14;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(d);
    }
}
