import java.util.*;

public class T51 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int idx1 = 0;
        int idx2 = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                idx1++;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    idx2++;
                }
            }
        }

        int max = idx1 + idx2;
        int min = idx2;

        for (int i = 0; i < 2; i++) {
            switch (max) {
                case 0, 1: answer[i] = 6; break;
                case 2: answer[i] = 5; break;
                case 3: answer[i] = 4; break;
                case 4: answer[i] = 3; break;
                case 5: answer[i] = 2; break;
                case 6: answer[i] = 1; break;
            }
            max = min;
        }

        return answer;
    }

}
