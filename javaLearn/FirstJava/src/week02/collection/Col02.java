package week02.collection;

import java.util.LinkedList;

public class Col02 {
    public static void main(String[] args) {
        // linked List
        // 메모리에 남은 공간을 요청해서 나누어 값을 담음
        // 실제 값이 있는 주소값을 ㅗ목록을 구성하고 저장

        // 기본적 기능은 동일
        // 조회 속도는 느리지만 추가/삭제는 빠름

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(30);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString());

        linkedList.add(200);
        System.out.println(linkedList.toString());

        linkedList.add(1, 33);
        System.out.println(linkedList.toString());

        linkedList.set(0, 30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

    }
}
