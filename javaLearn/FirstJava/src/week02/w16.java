package week02;

public class w16 {
    public static void main(String[] args) {
        int number = 0;

        // while
        while (number < 3) { //number < 3인 동안
            number++;
            System.out.println(number + "출력");
        }

        // do ~ while
        number = 4;
        do {
            // 이 로직을 먼저 수행
            System.out.println(number + "출력");
        } while(number < 3);

        // break
        number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                break;
            }
            System.out.println(number + "출력");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("i:" + i);
            if (i == 2) {
                break;
            }
        }

        // continue
        number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                continue; // 하위 로직은 skip, 2가 출력되지 않음
            }
            System.out.println(number + "출력");
        }







    }

}
