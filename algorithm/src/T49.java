public class T49 {
    public static void main(String[] args) {
        System.out.println(solution(4, 1, new int[]{1, 2, 3, 4}));
    }

    static int solution(int n, int m, int[] section) {
        int answer = 0;

        int[] walls = new int[n];

        for (int sec : section) {
            walls[sec-1] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (walls[i] == 1) {
                answer++;
                i = i + m - 1;
            }
        }

        return answer;
    }
}
