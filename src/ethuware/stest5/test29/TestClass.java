package ethuware.stest5.test29;

import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class TestClass {
    public static void main(String[] args) {
        Instant  now = Instant.now();
        Instant now2 = now.truncatedTo(ChronoUnit.DAYS);

    }
}
