package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int num = input.nextInt();

        int[] numbers = new int[num];

        System.out.println(num + "개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average =(double) sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
