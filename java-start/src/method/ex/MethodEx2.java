package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        iterator("Hello World!", 3);
        iterator("Hello java!", 3);
        iterator("Hello hi!", 3);
    }

    public static void iterator(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}