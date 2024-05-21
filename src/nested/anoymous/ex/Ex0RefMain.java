package nested.anoymous.ex;

public class Ex0RefMain {
    public static void hello(String str){
        //변하는 부분과 변하지 않는 부분을 분리 한다.
        System.out.println("프로그램 시작");
        System.out.println(str);
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
