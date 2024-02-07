package week02;

public class w06 {

    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점
        // ++, --

        int a = 10;
        int b = 10;
//      잘못된 예시 : int val = ++a + b--
        int val = ++a + --b; // 11 + 9 = 20
        System.out.println(a);
        System.out.println(b);
        System.out.println(val); // 21
    }
}
