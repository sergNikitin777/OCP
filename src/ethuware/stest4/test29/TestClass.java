package ethuware.stest4.test29;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TestClass {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
        System.out.println(ld1);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        System.out.println(zd1);
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
        System.out.println(ld2);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        System.out.println(zd2);
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);
    }
}