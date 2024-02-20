import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T45 {
    public static void main(String[] args) {

        System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));

    }

    static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(q1.peek())) {
                q1.poll();
            } else if (goal[i].equals(q2.peek())) {
                q2.poll();
            } else {
                answer = "No";
            }
        }

        return answer;
    }
}
