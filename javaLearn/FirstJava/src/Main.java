import java.util.Scanner;

// class
// public = (접근)제어자
public class Main {

    // [JDK]
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : debugging

    // main method
    // 자바 프로젝트는, 제일 먼저 클래스의 main 메소드를 실행시킨다. = JVM의 약속
    // static : 이 프로그램이 시작할 때 무조건 실행됨
    // void : 메서드의 출력값의 데이터 타입, "아무것도 없다" -> 출력이 없다.
    // String[] args : 매개변수 자리
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

        System.out.println("제목을 입력하세요.");
        System.out.print("> ");
        String title = sc.nextLine();
        System.out.println("별점을 입력하세요.");
        System.out.print("> ");
        float rate = Float.parseFloat(sc.nextLine());
        System.out.println("한 문장씩 입력하세요");
        System.out.print("1 > ");
        String se1 = sc.nextLine();
        System.out.print("2 > ");
        String se2 = sc.nextLine();
        System.out.print("3 > ");
        String se3 = sc.nextLine();
        System.out.print("4 > ");
        String se4 = sc.nextLine();
        System.out.print("5 > ");
        String se5 = sc.nextLine();
        System.out.print("6 > ");
        String se6 = sc.nextLine();
        System.out.print("7 > ");
        String se7 = sc.nextLine();
        System.out.print("8 > ");
        String se8 = sc.nextLine();
        System.out.print("9 > ");
        String se9 = sc.nextLine();
        System.out.print("10 > ");
        String lastSe = sc.nextLine();

        int intRate = (int)rate;
        double perRate = intRate * 100 / 5.0;

        System.out.println("[ " + title + " ]");
        System.out.println("별점 : " + intRate + " (" + perRate + "%)");
        System.out.println("1. " + se1);
        System.out.println("2. " + se2);
        System.out.println("3. " + se3);
        System.out.println("4. " + se4);
        System.out.println("5. " + se5);
        System.out.println("6. " + se6);
        System.out.println("7. " + se7);
        System.out.println("8. " + se8);
        System.out.println("9. " + se9);
        System.out.println("10. " + lastSe);

    }
}