package lang.object;

//Object 클래스 주요 메서드 : toString(), equals(), getClass()
public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }

}
