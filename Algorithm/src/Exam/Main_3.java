package Exam;

import java.util.ArrayList;
import java.util.List;

public class Main_3 {

//    설명) 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
//    현지는 s에 나타나는 숫자 중 소수의 최대값과 소수가 아닌 수의 최소값을 찾아 이를
//    "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하려고 합니다.
//    예를들어 s가 "2 3 4 5"라면 "4 5"를 리턴하고, "15 3 10 9 7 8"라면 "8 7"을 리턴하면 됩니다.
    public String solution(String s) {
        String answer = "";

        // s를 공백으로 쪼개 배열 생성
        String[] nums = s.split(" ");

        // 소수인 수들의 리스트와 소수가 아닌 수들의 리스트 선언
        List<Integer> Primes = new ArrayList<>();
        List<Integer> notPrimes = new ArrayList<>();


        // 소수를 판별해 리스트에 넣기
        for (String strNum : nums) {
            int intNum = Integer.parseInt(strNum);
            // 0, 1은 제외
            if (intNum < 2) {
                continue;
            }

            if (isPrime(intNum)) {
                Primes.add(intNum);
            } else {
                notPrimes.add(intNum);
            }
        }

        // 최소값과 최대값 판별을 위한 세팅

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        // 소수가 아닌 것들 중 최소값
        for (int i : notPrimes) {
            min = Math.min(i, min);
        }

        // 소수들 중 최대값
        for (int i : Primes) {
            max = Math.max(i, max);
        }

        // answer 만들어주기 "(최소값) (최대값)"
        answer = min + " " + max;

        return answer;

    }

    private boolean isPrime(int num) {
        // 소수 판별식 : 효율을 위해 제곱근까지만 나눠준다
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 나누어 떨어지는 것이 있으면 소수가 아님
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main_3 method = new Main_3();
        String s = "15 3 1 0 9 7 8 10";
        System.out.println(method.solution(s));
    }

}
