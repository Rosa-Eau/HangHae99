import java.util.Arrays;
import java.util.PriorityQueue;

public class T43 {
    public static void main(String[] args) {
        String sol = Arrays.toString(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
        System.out.println(sol);
    }

    static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }
            answer[i] = q.peek();
        }

        return answer;
    }
}
