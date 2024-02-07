package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        // 가변배열
        int[][] array = new int[3][];

        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        // 중괄호로 초기화를 아예 해버릴 대도 가능합!
        int[][] array2 = {
                {10, 20},
                {1, 2, 3, 4},
                {0},
                {232323, 3, 4, 5, 6, 1}
        };

    }
}
