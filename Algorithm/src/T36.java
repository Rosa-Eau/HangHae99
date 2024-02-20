public class T36 {

    public static void main(String[] args) {

        System.out.println(solution("one4seveneight"));

    }


    static int solution(String s) {
        int answer = 0;

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            String num = i + "";
            s = s.replace(str[i], num);
        }

//        s = s.replace("one", "1");
//        s = s.replace("two", "2");
//        s = s.replace("three", "3");
//        s = s.replace("four", "4");
//        s = s.replace("five", "5");
//        s = s.replace("six", "6");
//        s = s.replace("seven", "7");
//        s = s.replace("eight", "8");
//        s = s.replace("nine", "9");
//        s = s.replace("zero", "0");

        answer = Integer.parseInt(s);

        return answer;
    }
}

