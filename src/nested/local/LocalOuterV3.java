package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료 되는 순간 함께 제거 된다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수 보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localPrinter.print(); 여기서 실행 하지 않고 Printer 인스턴스만 반환 한다.
        return localPrinter;

    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(2);
        printer.print();

        System.out.println("필드 확인");
        Field[] fieldsield = printer.getClass().getDeclaredFields();
        for (Field field : fieldsield) {
            System.out.println("field = " + field);
        }
    }
}
