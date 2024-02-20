import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T47 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }

    static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;

        int[] st1 = new int[answers.length];
        int[] st2 = new int[answers.length];
        int[] st3 = new int[answers.length];
        int cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            cnt++;
            if (cnt == 6) {
                cnt = 1;
            }
            st1[i] = cnt;
        }

        cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (i % 2 == 0) {
                st2[i] = 2;
            } else {
                cnt++;
                if (cnt == 5) {
                    cnt = 1;
                }
                System.out.println(cnt);
                switch (cnt) {
                    case 1:
                        st2[i] = 1;
                        break;
                    case 2:
                        st2[i] = 3;
                        break;
                    case 3:
                        st2[i] = 4;
                        break;
                    case 4:
                        st2[i] = 5;
                        break;
                }
            }
        }

        cnt = 0;

        for (int i = 0; i < answers.length; i = i + 2) {
            cnt++;
            if (cnt == 6) {
                cnt = 1;
            }
            switch (cnt) {
                case 1:
                    st3[i] = 3;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 3;
                    break;
                case 2:
                    st3[i] = 1;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 1;
                    break;
                case 3:
                    st3[i] = 2;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 2;
                    break;
                case 4:
                    st3[i] = 4;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 4;
                    break;
                case 5:
                    st3[i] = 5;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 5;
                    break;
            }
        }

        String stu1 = Arrays.toString(st1);
        String stu2 = Arrays.toString(st2);
        String stu3 = Arrays.toString(st3);

        System.out.println(stu1 + stu2 + stu3);


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == st1[i]) {
                correct1++;
            }
            if (answers[i] == st2[i]) {
                correct2++;
            }
            if (answers[i] == st3[i]) {
                correct3++;
            }
        }

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


}
