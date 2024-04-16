package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String hello1 = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("hello1 = " + hello1);

    }
}
