package lang.clazz.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        long currentedTimeMillis = System.currentTimeMillis();
        System.out.println("currentedTimeMillis = " + currentedTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        System.out.println("getenv = " + System.getenv());

        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        System.exit(0);
        System.out.println("hello");
    }
}
