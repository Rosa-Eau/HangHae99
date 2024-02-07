package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기
        int[] arr = {1, 2, 3, 0, 5};

        // 최대값 초기화 세팅
        int max = arr[0];

        // 최대값 구하기 로직
        for (int num: arr) {
            if (num > max) {
                max = num;
            }
        }

        // 최소값 초기화 세팅
        int min = arr[0];
        // 최소값 구하기 로직
        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }
    }
}
