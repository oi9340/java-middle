package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1); //seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        int randomRangeInt = random.nextInt(10);
        System.out.println("randomRangeInt(0~9) = " + randomRangeInt);

        int randomRangeInt2 = random.nextInt(10) + 1;
        System.out.println("randomRangeInt(1~10) = " + randomRangeInt2);
    }
}
