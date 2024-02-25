import java.util.Arrays;

public class T40 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("foobar")));
    }

    static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i+1);
            if (i > 0) {
                answer[i] = s.lastIndexOf(temp, i-1);
            } else {
                answer[i] = -1;
            }
            if (answer[i] != -1) {
                answer[i] = i - answer[i];
            }
        }
        return answer;
    }

}
