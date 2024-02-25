public class T48 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }

    static int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (j != k && i != k) {
                        int n = nums[i] + nums[j] + nums[k];
                        if (isPrime(n)) {
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
