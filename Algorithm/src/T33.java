public class T33 {
    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }

    static int solution(String t, String p) {
        int answer = 0;
        int intP = Integer.parseInt(p);

        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            int end = i + p.length();
            String strT = t.substring(i, end);
            long intT = Long.parseLong(strT);
            if (intT <= intP) {
                answer++;
            }
        }

        return answer;
    }
}