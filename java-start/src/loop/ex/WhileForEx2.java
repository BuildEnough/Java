package loop.ex;

public class WhileForEx2 {

    public static void main(String[] args) {
        int num = 2;
        int count = 0;

//        while (true) {
//            if (count < 10) {
//                System.out.println(num);
//                num += 2;
//                count++;
//            }
//        }

        num = 2;
        for (count = 0; count < 10; count++) {
            System.out.println(num);
            num += 2;
        }


    }
}
