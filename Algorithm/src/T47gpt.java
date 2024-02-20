import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T47gpt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }

    static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] st1 = createAnswerPattern(answers.length, 1);
        int[] st2 = createAnswerPattern(answers.length, 2);
        int[] st3 = createAnswerPattern(answers.length, 3);

        String std1 = Arrays.toString(st1);
        String std2 = Arrays.toString(st2);
        String std3 = Arrays.toString(st3);
        System.out.println(std1 + std2 + std3);

        int correct1 = countCorrect(answers, st1);
        int correct2 = countCorrect(answers, st2);
        int correct3 = countCorrect(answers, st3);

        int maxScore = Math.max(correct1, Math.max(correct2, correct3));

        if (maxScore == correct1) {
            answer.add(1);
        }
        if (maxScore == correct2) {
            answer.add(2);
        }
        if (maxScore == correct3) {
            answer.add(3);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    static int[] createAnswerPattern(int length, int studentNumber) {
        int[] pattern = new int[length];

        switch (studentNumber) {
            case 1:
                for (int i = 0; i < length; i++) {
                    pattern[i] = i % 5 + 1;
                }
                break;
            case 2:
                for (int i = 0; i < length; i++) {
                    pattern[i] = (i % 2 == 0) ? 2 : (i / 2 % 4 + 1) != 2 ? (i / 2 % 4 + 1) : (i / 2 % 4 + 1) + 1;
                }
                break;
            case 3:
                for (int i = 0; i < length; i++) {
                    pattern[i] = (i / 2 % 5 + 1);
                }
                break;
        }

        return pattern;
    }

    static int countCorrect(int[] answers, int[] studentAnswers) {
        int correct = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == studentAnswers[i]) {
                correct++;
            }
        }
        return correct;
    }
}