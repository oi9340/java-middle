package nested.anoymous.ex;

import java.util.Random;

public class Ex1MyMain {

    public static void  hello(String type){
        System.out.println("프로그램 시작");

        if (type.equals("Dice")) {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
        if (type.equals("Sum")) {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        hello("Dice");
        hello("Sum");
    }

}
