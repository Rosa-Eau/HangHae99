package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col05 {

    public static void main(String[] args) {
        // Set(집합) : 순서 없고, 중복 없음
        // 순서가 보장되지 않는 대신 중복을 허용하지 않음
        // Set -> 그냥 쓸 수도 있음. 그러나 HashSet, TreeSet 등으로 응용 가능
        // 생성자가 없는 껍데기라서 바로 생성 X

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(20);
        intSet.add(1);
        intSet.add(9);

        for (Integer value: intSet) {
            System.out.println(value);
        }

        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));



    }
}
