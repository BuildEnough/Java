package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //AutoBoxing
        System.out.println("boxedValue = " + boxedValue);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // AutoUnBoxing
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
