package week02;

public class w15 {
    public static void main(String[] args) {
        // for (초기값 ; 조건문; 증가연산)
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " 번째 출력");
        }

        // 향상된 for
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number: numbers) {
            System.out.println(number + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
