package week02.collection;

import java.util.ArrayList;

public class Col01 {
    public static void main(String[] args) {
        // list
        // 순서가 있는 데이터의 집합 => Array(최고 길이를 알아야 함)
        // 처음에 길이를 몰라도 만들 수 있음
        // 1) Array -> 정적배열
        // 2) List(ArrayList) => 동적 배열(크기가 가변적)

        ArrayList<Integer> intList = new ArrayList<>(); //선언 + 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println(intList.get(0));

        // 2번째 있는 값을 바꾸자
        intList.set(1, 10);
        System.out.println(intList.get(1));

        // 삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        //전체 삭제
        intList.clear();
        System.out.println(intList.toString());

    }
}
