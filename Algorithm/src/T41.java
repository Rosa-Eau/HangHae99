public class T41 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));
    }

    static String solution(int[] food) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < food.length; i++) {
            if (food[i] / 2 > 0) {
                int cnt = food[i] / 2;
                for (int j = 0; j < cnt; j++) {
                    sb.append(i);
                }
            }
        }

//        sb.append(0);
//        int zero = sb.indexOf("0");
//
//        for (int i = 0; i < food.length; i++) {
//            if (food[i] / 2 > 0) {
//                int cnt = food[i] / 2;
//                for (int j = 0; j < cnt; j++) {
//                    sb.insert(zero + 1, i);
//                }
//            }
//        }


        answer = sb.toString() + "0" + sb.reverse().toString();

        return answer;
    }

}
