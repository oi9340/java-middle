package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println(ChronoUnit.DAYS);
        System.out.println("DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long between = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("between = " + between);

        long between1 = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("between1 = " + between1);
    }
}
