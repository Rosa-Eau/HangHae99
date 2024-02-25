public class T42 {
    public static void main(String[] args) {
        System.out.println(solution(8, 1, 20));
    }

    static int solution(int a, int b, int n) {
        int answer = 0;

        while (n / a > 0){
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }

        return answer;
    }
    
}
