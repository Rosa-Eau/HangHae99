package week02.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        //1주차 과제
        //  입력값
        //    - 내가 좋아하는 요리 제목을 먼저 입력합니다.
        //    - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
        //    - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
        //  출력값
        //    - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
        //    - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
        //    - 바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
        //    - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
        Scanner sc = new Scanner(System.in);

        LinkedList<String> recipe = new LinkedList<>();


        System.out.println("제목을 입력하세요.");
        System.out.print("> ");
        String title = sc.nextLine();
        System.out.println("별점을 입력하세요.");
        System.out.print("> ");
        float rate = Float.parseFloat(sc.nextLine());
        System.out.println("한 문장씩 입력하세요");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " > ");
            recipe.add(i, sc.nextLine());
        }



        int intRate = (int)rate;
        double perRate = intRate * 100 / 5.0;

        System.out.println("[ " + title + " ]");
        System.out.println("별점 : " + intRate + " (" + perRate + "%)");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + recipe.get(i));
        }

    }

}
