package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);

        LocalDate ofDate = LocalDate.of(1992, 8, 23);
        System.out.println("지정 날짜 = " + ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10 = " + ofDate);

    }
}
