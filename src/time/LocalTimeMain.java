package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);

        LocalTime ofTime = LocalTime.of(8, 30, 30);
        System.out.println("지정 시간 = " + ofTime);

        ofTime = ofTime.plusSeconds(30);
        System.out.println("지정 시간 + 30초 = " + ofTime);
    }
}
