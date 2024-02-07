package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col06 {
    public static void main(String[] args) {
        // Map : key - value pair
        // key라는 값으로 unipue하게 보장이 되어야
        // Map -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("one", 1);
        intMap.put("two", 2);
        intMap.put("three", 3);
        intMap.put("three", 4);
        intMap.put("three", 5);

        // key 값 전체 출력
        for (String key: intMap.keySet()) {
            System.out.println(key);
        }

        // value 값 전체 출력
        for (Integer value: intMap.values()) {
            System.out.println(value);
        }

        System.out.println(intMap.get("three"));



    }
}
