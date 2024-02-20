import java.util.*;

public class T39 {
    public static void main(String[] args) {
        String sol = Arrays.toString(solution(new int[]{5,0,2,7}));
        System.out.println(sol);
    }

    static int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    numSet.add(numbers[i]+numbers[j]);
                }
            }
        }


//        for (int num : numbers) {
//                numSet.add(temp+num);
//                temp = num;
//        }
//
//        System.out.println(numSet);
//
        answer = numSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }

}
