package Exam;

public class Main_1 {
    public int solution(int num) {
        int answer = 0;

        int change = 1000 - num;
        int[] coins = {500, 100, 50, 10};

        for (int coin : coins) {
            answer += change / coin;
            change %= coin;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_1 method = new Main_1();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }


}
