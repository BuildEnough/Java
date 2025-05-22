package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++ // 컴파일 에러
        staticValue++;

//        instanceMethod(); // 컴파일 에러
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        staticValue++;

        instanceMethod();
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
