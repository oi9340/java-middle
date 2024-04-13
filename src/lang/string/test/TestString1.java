package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
//        String url = "www.example.com";
        if (url.startsWith("https://")) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

        boolean result = url.startsWith("https://");
        System.out.println("result = " + result);
    }
}
