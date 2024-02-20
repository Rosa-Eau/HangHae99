package Exam;

public class Main_2 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        for (int i = 0; i < 7; i++) {
            int checkin = arr1[i];
            int checkout = arr2[i];

            if (checkout >= 29) {
                checkout = 21;
            }

            answer += checkout - checkin;

        }

        return answer;
    }

    public static void main(String[] args) {
        Main_2 method = new Main_2();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }

}
