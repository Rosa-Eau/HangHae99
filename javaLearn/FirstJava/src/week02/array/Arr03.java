package week02.array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a;


        int[] c = {1, 2, 3, 4};
        int[] d = new int[a.length];

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i]; // 깊은 복사
        }

        d[0] = 3; //b 배열의 0번째 순번값을 3으로 수정

        // 1. clone() 메서드
        int[] e = {1, 2, 3, 4};
        int[] f = e.clone(); // 가장 간단한 방법, but 2차원 이상 배열에서는 얕은 복사로 동작

        // 2. Arrays.copyOf() method
        int[] g = {1, 2, 3, 4};
        int[] h = Arrays.copyOf(g, g.length); // 배열과 함께 length값도 같이 넣어줌

    }
}
