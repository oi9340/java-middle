package lang.wrapper;

public class MyIntegerMethdoMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(10, 5);
        System.out.println("i = " + i1);

        int i2 = compareTo(10, 10);
        System.out.println("i = " + i2);

        int i3 = compareTo(10, 20);
        System.out.println("i = " + i3);
    }

    public static int compareTo(int value, int target) {
        if (value < target){
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

}
