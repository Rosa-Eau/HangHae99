import java.util.Arrays;

public class T50 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
    }

    static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisors = new int[number];

        for (int i = 0; i < divisors.length; i++) {
            int cnt = 0;
            for(int j = 1; j * j <= (i+1); j++) {
                if(j * j == (i+1)) cnt++;
                else if((i+1) % j == 0) cnt+=2;
            }
            divisors[i] = cnt;
        }

        System.out.println(Arrays.toString(divisors));

        for (int i = 0; i < number; i++) {
            if (divisors[i] > limit) {
                answer += power;
            } else {
                answer += divisors[i];
            }
        }

        return answer;
    }
}
