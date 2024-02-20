import java.util.Arrays;

public class T46 {
    public static void main(String[] args) {

        System.out.println(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));

    }

    static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        int n = score.length;

        for (int i = n - m; i >= 0; i -= m) {
            int min = score[i];
            answer += min * m;
        }

//        시간초과
//        List<Integer> sList = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        for (int i = 0; i < score.length/m; i++) {
//            int[] apple = new int[m];
//            for (int j = 0; j < m; j++) {
//                apple[j] = sList.get(j);
//                sList.set(j, 0);
//            }
//            Arrays.sort(apple);
//            answer += apple[0] * m;
//            while (sList.contains(0)){
//                sList.remove(0);
//            }
//        }

        return answer;
    }
}
