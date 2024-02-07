package week02;

public class w12 {
    public static void main(String[] args) {
        // 중첩 if
        boolean flag = true;
        int num = 2;

        if (flag) {
            if (num == 1) {
                System.out.println("true, 1");
            } else if (num == 2) {
                System.out.println("true, 2");
            } else {
                System.out.println("true, ?");
            }
        } else {
            if (num == 1) {
                System.out.println("false, 1");
            } else if (num == 2) {
                System.out.println("false, 2");
            } else {
                System.out.println("false, ?");
            }
        }
    }
}
