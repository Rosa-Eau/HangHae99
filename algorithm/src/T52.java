public class T52 {
    public static void main(String[] args) {

    }

    public int solution(String[] babbling) {
        int answer = 0;

        for (String bab : babbling) {
            bab = bab.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            bab = bab.replaceAll("aya|ye|woo|ma", "");
            if (bab.isEmpty())
                answer++;
        }

        return answer;
    }
}
