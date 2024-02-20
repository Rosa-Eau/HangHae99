import java.util.Arrays;

public class T38 {
    public static void main(String[] args) {
        String answer = Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
        System.out.println(answer);
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] newArr = new int[array.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int a = command[0];
            int b = command[1];
            int k = command[2];

            System.out.println(a);
            System.out.println(b);
            System.out.println(k);

            newArr = Arrays.copyOfRange(array, a - 1, b);
            Arrays.sort(newArr);

            answer[i] = newArr[k - 1];
        }

        return answer;
    }

}
