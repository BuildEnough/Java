package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int number = scanner.nextInt();


        System.out.println(number + "개의 정수를 입력하세요");
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("가장 큰 정수: " + max);
        System.out.println("가장 작은 정수: " + min);
    }
}
