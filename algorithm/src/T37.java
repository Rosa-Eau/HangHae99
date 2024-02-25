import java.util.*;

public class T37 {
    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};
        String[] strings1 = {"abce", "abcd", "cdx"};

        System.out.println(Arrays.toString(solution(strings1,1)));

    }

    static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char char1 = (o1.length() > n) ? o1.charAt(n) : 0; // 예외 처리
                char char2 = (o2.length() > n) ? o2.charAt(n) : 0; // 예외 처리

                int result = Character.compare(char1, char2);
                return (result != 0) ? result : o1.compareTo(o2);
            }
        });


        return strings;
    }

}
