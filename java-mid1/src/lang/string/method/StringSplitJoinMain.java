package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr1 = "";
        for (String string : splitStr) {
            joinStr1 += string + "-";
        }
        System.out.println("joinStr = " + joinStr1);

        String joinStr2 = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr2 += string;
            if (i != splitStr.length-1) {
                joinStr2 += "-";
            }
        }
        System.out.println("joinStr2 = " + joinStr2);

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);

        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
