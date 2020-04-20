package ethuware.datatimeapi.test1;

import java.time.*;

public class Main  {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);
    }

}