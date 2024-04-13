package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String string : split) {
            joinStr += string+"-";
        }
        System.out.println(joinStr);

        String joinStr2 = "";
        for(int i=0; i<split.length; i++){
            joinStr2 += split[i];
            if (i < split.length - 1) {
                joinStr2 += "-";
            }
        }
        System.out.println(joinStr2);

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        String joinedStr2 = String.join("-", split);
        System.out.println(joinedStr2);


    }
}
