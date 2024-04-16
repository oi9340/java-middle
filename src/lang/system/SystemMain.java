package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        System.out.println("getenv = "+System.getenv());

        System.out.println("properties = "+System.getProperties());
        System.out.println("Java version = "+System.getProperty("java.version"));

        char[] orginalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(orginalArray,0,copiedArray,0,orginalArray.length);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));
        System.out.println("orginalArray = " + Arrays.toString(orginalArray));

        System.exit(0);

    }
}
