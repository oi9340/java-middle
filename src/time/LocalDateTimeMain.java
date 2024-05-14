package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime ofDateTime = LocalDateTime.of(1992, 8, 23, 13, 29, 30);
        System.out.println("현재 날짜시간 = " + nowDateTime);
        System.out.println("지정 날짜시간 = " + ofDateTime);

        LocalDate localDate = ofDateTime.toLocalDate();
        LocalTime localTime = ofDateTime.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDateTimePlus = ofDateTime.plusDays(1000);
        System.out.println("지정 날짜시간 + 1000일 = " + ofDateTimePlus);
        LocalDateTime ofDateTimePlusYears = ofDateTime.plusYears(1);
        System.out.println("지정 날짜시간 + 1년 = " + ofDateTimePlusYears);

        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? "+nowDateTime.isBefore(ofDateTime));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? "+nowDateTime.isAfter(ofDateTime));
        System.out.println("현재 날짜시간이 지정 날짜 시간이 같은가? "+nowDateTime.isEqual(ofDateTime));

    }
}
