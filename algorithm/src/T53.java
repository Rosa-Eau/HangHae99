public class T53 {
    public static void main(String[] args) {
        System.out.println(solution("111", "1111"));
    }

    static String solution(String X, String Y) {
        String answer = "";

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (String x : X.split("")) {

        }

//        List<Integer> list = new ArrayList<>();
//
//        // X, Y 비교 같은 값 전부 구함
//        for (int i = 0; i < X.length(); i++) {
//            String x = X.substring(i, i + 1);
//            for (int j = 0; j < Y.length(); j++) {
//                String y = Y.substring(j, j + 1);
//                if (y.equals(x)) {
//                    list.add(Integer.valueOf(x));
//                    Y = Y.replaceFirst(y, "");
//                }
//            }
//        }
//
//        // 나온 수 내림차순 정렬
//        list.sort(Collections.reverseOrder());
//
//        // list 예외처리
//        if (list.isEmpty()) {
//            list.add(-1);
//        }
//
//        // answer에 답 넣기
//        for (Integer integer : list) {
//            answer += integer.toString();
//        }
//
//        if (answer.isEmpty()) {
//            answer = "-1";
//        } if (answer.replace("0", "") == "") {
//            answer = "0";
//        }

        return answer;
    }
}
