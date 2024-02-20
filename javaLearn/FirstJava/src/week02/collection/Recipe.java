package week02.collection;

import java.util.*;

public class Recipe {
    public static void main(String[] args) {
//        자료구조 요리 레시피 메모장 만들기
//
//        - 입력값
//                - 저장할 자료구조명을 입력합니다. (List / Set / Map)
//                - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//                - 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
//        - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
//        - 출력값
//                - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
//                - 이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.
        Scanner sc = new Scanner(System.in);

        System.out.println("저장할 자료구조명을 입력하세요 (List/Set/Map)");
        System.out.print(" > ");
        String coll = sc.nextLine();

        
        if (Objects.equals(coll, "List")) {
            LinkedList<String> recipe = new LinkedList<>();

            System.out.println("제목을 입력하세요");
            System.out.print(" > ");
            String title = sc.nextLine();

            System.out.println("내용을 한 문장씩 입력하세요");

            while (true) {
                System.out.print(" > ");
                String input = sc.nextLine();
                if (Objects.equals(input, "끝")) {
                    break;
                }
                recipe.add(input);
            }

            System.out.println("[ List로 저장된 " + title + " ]");

            for (int i = 0; i < recipe.size(); i++) {
                System.out.println((i + 1) + ". " + recipe.get(i));
            }
        } else if (Objects.equals(coll, "Set")) {
            LinkedHashSet<String> recipe = new LinkedHashSet<>();

            System.out.println("제목을 입력하세요");
            System.out.print(" > ");
            String title = sc.nextLine();

            System.out.println("내용을 한 문장씩 입력하세요");

            while (true) {
                System.out.print(" > ");
                String input = sc.nextLine();
                if (Objects.equals(input, "끝")) {
                    break;
                }
                recipe.add(input);
            }

            System.out.println("[ Set으로 저장된 " + title + " ]");

            Iterator iter = recipe.iterator();

            for (int i = 0; i < recipe.size(); i++) {
                System.out.println((i + 1) + ". " + iter.next());
            }
        } else if (Objects.equals(coll, "Map")) {
            Map<Integer, String> strMap = new HashMap<>();

            System.out.println("제목을 입력하세요");
            System.out.print(" > ");
            String title = sc.nextLine();

            int inputNum = 0;

            System.out.println("내용을 한 문장씩 입력하세요");

            while (true) {
                System.out.print(" > ");
                String input = sc.nextLine();
                if (Objects.equals(input, "끝")) {
                    break;
                }
                strMap.put(inputNum++, input);
            }

            System.out.println("[ Map 으로 저장된 " + title + " ]");

            for (int i = 0; i < strMap.size(); i++) {

                int number = i + 1;
                System.out.println(number + ". " + strMap.get(i));
            }
        } else {
            System.out.println("잘못된 값이 입력되었습니다.");
        }


    }

}
