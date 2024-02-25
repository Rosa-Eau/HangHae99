public class T44 {
    public static void main(String[] args) {

        System.out.println(solution(5, 5));

    }

    static String solution(int a, int b) {
        String answer = "";
        int m = 0;

        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        for (int i = 1; i < a; i++) {
            boolean month31 = (i <= 7 && i % 2 == 1) || (i > 7 && i % 2 == 0);
            boolean month30 = (i > 7 && i % 2 == 1) || (i <= 7 && i % 2 == 0);
            if (i != 2) {
                if (month31) {
                    m += 31;
                } else if (month30) {
                    m += 30;
                }
            } else {
                m += 29;
            }
        }

        int d = (m+b)%7-1;

        if (d == -1) {
            d = 6;
        }
        answer = week[d];

        return answer;
    }
}
