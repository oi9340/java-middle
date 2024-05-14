package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        Instant nowInstant = Instant.now(); //UTC 기준
        System.out.println("now = " + nowInstant);

        ZonedDateTime nowZdt = ZonedDateTime.now();
        Instant from = Instant.from(nowZdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        Instant instant = epochStart.plusSeconds(3600);
        System.out.println("instant = " + instant);

        long epochSecond = instant.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
}
