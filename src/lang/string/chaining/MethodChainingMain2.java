package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder valueAdder1 =valueAdder.add(1);
        ValueAdder valueAdder2 =valueAdder.add(2);
        ValueAdder valueAdder3 =valueAdder.add(3);

        System.out.println("valueAdder.getValue() = " + valueAdder.getValue());
        System.out.println("valueAdder.getValue() = " + valueAdder1.getValue());
        System.out.println("valueAdder.getValue() = " + valueAdder2.getValue());
        System.out.println("valueAdder.getValue() = " + valueAdder3.getValue());

    }
}
